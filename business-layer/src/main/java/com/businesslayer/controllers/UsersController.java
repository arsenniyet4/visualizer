package com.businesslayer.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.businesslayer.models.UserModel;
import com.businesslayer.services.UsersService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UsersController {
    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/getAllUsers")
    public List<UserModel> getAllUsers() {
        return usersService.getAllUserModels();
    }
    
}
