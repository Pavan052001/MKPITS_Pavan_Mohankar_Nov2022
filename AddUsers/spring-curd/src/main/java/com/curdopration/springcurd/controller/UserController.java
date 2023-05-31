package com.curdopration.springcurd.controller;

import com.curdopration.springcurd.entity.User;
import com.curdopration.springcurd.repository.UserRepo;
import com.curdopration.springcurd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;


    @PostMapping("/add")
    public String addUser(@RequestBody User user){
       userService.addUser(user);
        return "success add user";

    }
    @PostMapping("/add1")
    public String addUser3(@RequestBody User user){
        userService.addUser(user);
        return "success add user1";

    }

}
