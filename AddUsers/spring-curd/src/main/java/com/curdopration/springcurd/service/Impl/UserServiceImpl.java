package com.curdopration.springcurd.service.Impl;

import com.curdopration.springcurd.entity.User;
//import com.curdopration.springcurd.repository.H2Database;
import com.curdopration.springcurd.repository.H2Database;
import com.curdopration.springcurd.repository.UserRepo;
import com.curdopration.springcurd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private H2Database h2Database;

    @Autowired
    public UserServiceImpl( UserRepo userRepo, H2Database H2Repo) {
        this.userRepo = userRepo;
        this.h2Database = H2Repo;
    }


    @Override
    public String addUser(User user) {
        userRepo.save(user);
        return "hello";
    }

    @Override
    public void addUser3(User user) {
        userRepo.save(user); // Save to MySQL
        h2Database.save(user); // Save to PostgreSQL

    }

}
