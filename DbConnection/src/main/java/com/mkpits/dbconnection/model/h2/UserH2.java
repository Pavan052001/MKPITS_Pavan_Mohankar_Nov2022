package com.mkpits.dbconnection.model.h2;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class UserH2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
}
