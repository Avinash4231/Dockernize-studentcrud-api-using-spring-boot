package com.avincode.studentcrud.service;

import java.util.*;

import com.avincode.studentcrud.entity.Student;


public interface StudentService {
    List<Student> getAllStudents();

    boolean updateStudent(Student student, Long id);

    void createStudent(Student student);

    boolean deleteStudentById(Long id);

    Student getStudentById(Long id);
}
