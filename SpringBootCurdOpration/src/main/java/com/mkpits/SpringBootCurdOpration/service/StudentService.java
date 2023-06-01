package com.mkpits.SpringBootCurdOpration.service;

import com.mkpits.SpringBootCurdOpration.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);
    Student getStudentbyId(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
