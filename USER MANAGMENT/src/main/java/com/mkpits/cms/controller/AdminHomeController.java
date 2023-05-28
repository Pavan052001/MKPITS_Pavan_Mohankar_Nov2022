package com.mkpits.cms.controller;

import com.mkpits.cms.dto.StudentDto;
import com.mkpits.cms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AdminHomeController {

    @Autowired
    StudentService studentListFromDB;

    @GetMapping("/")
    public String home(Model model) {
        List<StudentDto> studentDtoList = new ArrayList<>();
        model.addAttribute("students", studentListFromDB.getallstudent());
        return "index";
    }

    @GetMapping("/register-user")
    public String registerUserPage(Model model) {
        model.addAttribute("student", StudentDto.builder().build());
        return "register-user";
    }
}
