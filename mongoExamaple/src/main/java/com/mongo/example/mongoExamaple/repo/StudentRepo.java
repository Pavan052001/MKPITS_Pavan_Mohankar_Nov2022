package com.mongo.example.mongoExamaple.repo;

import com.mongo.example.mongoExamaple.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<Student,Integer> {
}
