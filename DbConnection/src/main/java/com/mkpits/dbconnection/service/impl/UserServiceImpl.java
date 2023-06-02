package com.mkpits.dbconnection.service.impl;

import com.mkpits.dbconnection.dto.UserDto;
import com.mkpits.dbconnection.model.h2.UserH2;
import com.mkpits.dbconnection.model.mysql.UserMysql;
import com.mkpits.dbconnection.repo.h2.UserH2Repo;
import com.mkpits.dbconnection.repo.mysql.UserMysqlRepo;
import com.mkpits.dbconnection.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserH2Repo userH2Repo;
    @Autowired
    private UserMysqlRepo userMysqlRepo;
    @Override
    public List<UserDto> getAllUser() {
        // H2 Database
        List<UserDto> userDtoList = new ArrayList<>();
//        List <UserH2> userH2List = userH2Repo.findAll();
//        userH2List.stream().forEach(userH2 -> {
//            UserDto studentDto = UserDto.builder()
//                    .firstName(userH2.getFirstName())
//                    .lastName(userH2.getLastName())
//                    .email(userH2.getEmail())
//                    .mobile(userH2.getMobile())
//                    .build();
//            userDtoList.add(studentDto);
//        });

        // MySQL Database
        List <UserMysql> userMysqlList = userMysqlRepo.findAll();
        userMysqlList.stream().forEach(userMysql -> {
            UserDto studentDto = UserDto.builder()
                    .firstName(userMysql.getFirstName())
                    .lastName(userMysql.getLastName())
                    .email(userMysql.getEmail())
                    .mobile(userMysql.getMobile())
                    .build();
            userDtoList.add(studentDto);
        });
        return userDtoList;
    }

    @Override
    public List<UserDto> addUser(UserDto userDto) {
        List<UserDto> userDtoList = new ArrayList<>();
        UserH2 userH2 = UserH2.builder()
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .email(userDto.getEmail())
                .mobile(userDto.getMobile())
                .build();
        UserH2 afterRegi = userH2Repo.save(userH2);
        userDto.setId(afterRegi.getId());

        userDtoList.add(userDto);

        UserMysql userMysql = UserMysql.builder()
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .email(userDto.getEmail())
                .mobile(userDto.getMobile())
                .build();
        UserMysql afterRegiSave = userMysqlRepo.save(userMysql);
        userDto.setId(afterRegiSave.getId());

        userDtoList.add(userDto);
        return userDtoList;
    }
}
