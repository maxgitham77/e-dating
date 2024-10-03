package com.edatingapp.edatingapp.controllers;

import com.edatingapp.edatingapp.entities.UserAccount;
import com.edatingapp.edatingapp.entities.UserInterest;
import com.edatingapp.edatingapp.services.UserAccountService;
import com.edatingapp.edatingapp.services.UserInterestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")
public class UserAccountController {

    @Autowired
    private UserAccountService userAccountService;

    @Autowired
    private UserInterestService userInterestService;

    @PostMapping("/register-user")
    public UserAccount registerAccount(@RequestBody UserAccount userAccount)
    {
        return userAccountService.registerUser(userAccount);
    }

    @PostMapping("/create-interest")
    public UserInterest createInterest(@RequestBody UserInterest userInterest)
    {
        UserAccount userAccount = userAccountService.getUserById(userInterest.getUserAccountId());
        userInterest.setUserAccount(userAccount);
        return userInterestService.createUserInterest(userInterest);
    }

    @GetMapping("/all-user")
    public List<UserAccount> getAllUsers()
    {
        return userAccountService.getAllUsers();
    }

    /*@DeleteMapping("/delete/{userInterestId}")
    public void deleteUserInterest(@PathVariable("userInterestId") Long id)
    {
        userInterestService.deleteUserInterest(id);
    }*/

    @DeleteMapping("/delete/user-interest")
    public void deleteUserInterest(@RequestParam Long id)
    {
        UserInterest userInterest = new UserInterest();
        userInterest.setId(id);
        userInterestService.deleteUserInterest(userInterest);
    }

    @GetMapping("/matches/{id}")
    public List<UserAccount> findMatches(@PathVariable("id") Long id)
    {
        UserAccount userAccount = userAccountService.getUserById(id);
        return userAccountService.findUserMatches(userAccount.getId(), userAccount.getAge(), userAccount.getCity(), userAccount.getCountry());
    }

}
