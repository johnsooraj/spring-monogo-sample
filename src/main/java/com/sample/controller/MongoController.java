package com.sample.controller;

import com.sample.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class MongoController {

    @Autowired
    UserService userService;

    @GetMapping
    public Object getAllUsers(){
        return userService.getAllUsers();
    }
}
