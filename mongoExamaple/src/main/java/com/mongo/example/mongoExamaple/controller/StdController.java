package com.mongo.example.mongoExamaple.controller;

import com.mongo.example.mongoExamaple.models.Student;
import com.mongo.example.mongoExamaple.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StdController {
    @Autowired
    private StudentRepo studentRepo;
    @PostMapping("/")
    public ResponseEntity<?> addStudent(@RequestBody Student student)
    {
        this.studentRepo.save(student);
        return ResponseEntity.ok(student);
    }
    @GetMapping("/")
    public ResponseEntity<?> getStudent(@RequestBody Student student)
    {
        return ResponseEntity.ok(this.studentRepo.findAll());
    }


}
