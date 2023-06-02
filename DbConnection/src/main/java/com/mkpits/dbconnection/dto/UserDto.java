package com.mkpits.dbconnection.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserDto {
    private  long id;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
}
