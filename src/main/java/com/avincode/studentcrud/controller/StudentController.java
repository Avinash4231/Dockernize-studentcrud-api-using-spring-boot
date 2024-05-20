package com.avincode.studentcrud.controller;

import org.springframework.web.bind.annotation.RestController;

import com.avincode.studentcrud.entity.Student;
import com.avincode.studentcrud.service.StudentService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;


@RestController
@RequestMapping("/students")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateStudent(@PathVariable("id") Long id, @RequestBody Student student) {
        studentService.updateStudent(student, id);
        return new ResponseEntity<>("Student updated Sucessfully", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> addStudent(@RequestBody Student student) {
        studentService.createStudent(student);
        return new ResponseEntity<>("Student Added Sucessfully", HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCompany(@PathVariable("id") Long id) {
        boolean isDeleted = studentService.deleteStudentById(id);
        if (isDeleted) {
            return new ResponseEntity<>("Student Successfully Deleted", HttpStatus.OK);

        } else {
            return new ResponseEntity<>("Student Not Found", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable("id") Long id) {
        Student student = studentService.getStudentById(id);
        if (student != null) {
            return new ResponseEntity<>(student, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

}
