package com.edatingapp.edatingapp.services;

import com.edatingapp.edatingapp.entities.UserAccount;
import org.apache.catalina.User;

import java.util.List;

public interface UserAccountService {

    UserAccount registerUser(UserAccount userAccount);

    List<UserAccount> getAllUsers();

    UserAccount getUserById(Long userId);

    UserAccount updateUser(UserAccount userAccount);

    List<UserAccount> findUserMatches(Long id, int age, String city, String country);

    void deleteUser(UserAccount userAccount);

}
