package com.example.demo.demoApplication.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {

    private String Name;
    private String email;

//    @Override
//    public String toString() {
//        return "User{" +
//                "Name='" + Name + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }
}
