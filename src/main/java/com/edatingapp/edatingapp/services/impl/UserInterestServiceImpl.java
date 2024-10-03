package com.edatingapp.edatingapp.services.impl;

import com.edatingapp.edatingapp.entities.UserInterest;
import com.edatingapp.edatingapp.repositories.UserInterestRepository;
import com.edatingapp.edatingapp.services.UserInterestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInterestServiceImpl implements UserInterestService {

    @Autowired
    private UserInterestRepository userInterestRepository;

    @Override
    public UserInterest createUserInterest(UserInterest userInterest)
    {
        return userInterestRepository.save(userInterest);
    }

    @Override
    public void deleteUserInterest(UserInterest userInterest)
    {
        userInterestRepository.delete(userInterest);
    }
}
