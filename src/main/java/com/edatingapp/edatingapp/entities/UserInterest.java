package com.edatingapp.edatingapp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "interests")
public class UserInterest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String hobbies;
    private String likes;
    private String dislikes;
    private String profile_url;
    private String about;
    @Transient
    private Long userAccountId;
    @OneToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private UserAccount userAccount;
}
