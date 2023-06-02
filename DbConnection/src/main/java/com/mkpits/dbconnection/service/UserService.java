package com.mkpits.dbconnection.service;

import com.mkpits.dbconnection.dto.UserDto;

import java.util.List;

public interface UserService {
    public List<UserDto> getAllUser();
    public List<UserDto> addUser(UserDto userDto);


}
