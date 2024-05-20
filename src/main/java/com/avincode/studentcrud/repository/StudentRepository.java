package com.avincode.studentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.avincode.studentcrud.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
