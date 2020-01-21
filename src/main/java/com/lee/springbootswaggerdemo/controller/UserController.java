package com.lee.springbootswaggerdemo.controller;

import com.lee.springbootswaggerdemo.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/{id}")
    public User findOne(@PathVariable long id) {
        return User.builder().id(1L).firstName("test_name").age(100).build();
    }
}
