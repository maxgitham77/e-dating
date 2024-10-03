package com.edatingapp.edatingapp.services.impl;

import com.edatingapp.edatingapp.entities.UserAccount;
import com.edatingapp.edatingapp.repositories.UserAccountRepository;
import com.edatingapp.edatingapp.services.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    private UserAccountRepository userAccountRepository;

    @Override
    public UserAccount registerUser(UserAccount userAccount) {
        return userAccountRepository.save(userAccount);
    }

    @Override
    public List<UserAccount> getAllUsers() {
        return userAccountRepository.findAll();
    }

    @Override
    public UserAccount getUserById(Long userId) {
        return userAccountRepository.findById(userId).get();
    }

    @Override
    public UserAccount updateUser(UserAccount userAccount) {
        return userAccountRepository.save(userAccount);
    }

    @Override
    public List<UserAccount> findUserMatches(Long id, int age, String city, String country) {
        return userAccountRepository.findMatches(age, city, country, id);
    }

    @Override
    public void deleteUser(UserAccount userAccount) {
        userAccountRepository.delete(userAccount);
    }
}
