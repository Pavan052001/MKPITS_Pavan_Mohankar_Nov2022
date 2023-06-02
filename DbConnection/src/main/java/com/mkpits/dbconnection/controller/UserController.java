package com.mkpits.dbconnection.controller;

import com.mkpits.dbconnection.dto.UserDto;
import com.mkpits.dbconnection.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    public UserService userService;
    @GetMapping("/")
    public String homePage(Model model){
        return "index";
    }
    @GetMapping("/user-details")
    public String userDetails(Model model){
        List<UserDto> userDtoList = userService.getAllUser();
       model.addAttribute("userDetail", userDtoList);
        return "user-details";
    }
    @GetMapping("/user-form")
    public String getClientForm(Model model){
        UserDto userDto = new UserDto();
        model.addAttribute("user", userDto);
        return "user-form";
    }
    @PostMapping("/addUserData")
    public String registerClient(@ModelAttribute("user-data") UserDto userDto){
       userService.addUser(userDto);
        return "redirect:/user-details";
    }
}
