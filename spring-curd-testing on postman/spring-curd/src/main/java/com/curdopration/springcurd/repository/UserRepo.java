package com.curdopration.springcurd.repository;

import com.curdopration.springcurd.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
