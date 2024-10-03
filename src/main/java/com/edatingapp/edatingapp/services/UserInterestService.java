package com.edatingapp.edatingapp.services;

import com.edatingapp.edatingapp.entities.UserInterest;

public interface UserInterestService {

    UserInterest createUserInterest(UserInterest userInterest);

    void deleteUserInterest(UserInterest userInterest);
}
