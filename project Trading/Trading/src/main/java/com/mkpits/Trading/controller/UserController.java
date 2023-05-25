package com.mkpits.Trading.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller

public class UserController {


    @RequestMapping(method = RequestMethod.GET,path ="/Register")
    public ResponseEntity<Object> registerUser(){

        return ResponseEntity.status(HttpStatus.OK).body("hello : pavan");

    }
    @GetMapping(path = "/register/{name}")
    public ResponseEntity<Object> register(@PathVariable(value = "name") String name){

        return ResponseEntity.status(HttpStatus.OK).body("hello : pavan123 "+name);

    }
}
