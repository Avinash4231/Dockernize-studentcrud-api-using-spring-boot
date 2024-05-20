package com.avincode.studentcrud.service.impl;
import java.util.*;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.avincode.studentcrud.entity.Student;
import com.avincode.studentcrud.repository.StudentRepository;
import com.avincode.studentcrud.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        // TODO Auto-generated method stub
        return studentRepository.findAll();
    }

    @Override
    public boolean updateStudent(Student student, Long id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (studentOptional.isPresent()) {
            Student studentToUpdate = studentOptional.get();
            studentToUpdate.setName(student.getName());
            studentToUpdate.setEmail(student.getEmail());
            studentToUpdate.setCourse(student.getCourse());
            studentToUpdate.setBranch(student.getBranch());
            studentRepository.save(studentToUpdate);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void createStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public boolean deleteStudentById(Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
}
