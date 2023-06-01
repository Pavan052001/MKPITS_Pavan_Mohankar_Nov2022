package com.mkpits.SpringBootCurdOpration.repository;

import com.mkpits.SpringBootCurdOpration.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;



public interface StudentRepo extends JpaRepository<Student,Long> {
}
