package com.example.finalproject2.controllers;


import com.example.finalproject2.dto.request.UserCreationRequest;
import com.example.finalproject2.dto.request.UserUpdateRequest;
import com.example.finalproject2.entity.User;
import com.example.finalproject2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.filter.RequestContextFilter;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RequestContextFilter requestContextFilter;

    @PostMapping
    User createUser(@RequestBody UserCreationRequest request) {
        return userService.createUser(request);
    }

    @GetMapping
    List<User> getAllUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{userId}")
    User getUser(@PathVariable("userId") Integer userId) {
        return userService.getUserById(userId);
    }

    @PutMapping("/{userId}")
    User updateUser(@PathVariable Integer userId, @RequestBody UserUpdateRequest request){
        return userService.updateUser(userId, request);
    }

}
