package com.edatingapp.edatingapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String first_name;
    private String last_name;
    private int age;
    private String gender;
    @Column(unique = true)
    private String email;
    private String phone_number;
    private String city;
    private String country;
    @OneToOne(mappedBy = "userAccount")
    private UserInterest userInterest;
}
