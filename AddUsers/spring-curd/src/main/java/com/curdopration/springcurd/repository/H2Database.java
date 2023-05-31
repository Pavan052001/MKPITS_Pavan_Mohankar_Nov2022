package com.curdopration.springcurd.repository;

import com.curdopration.springcurd.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface H2Database extends JpaRepository<User,Integer> {
}
