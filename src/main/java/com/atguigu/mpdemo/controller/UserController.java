package com.atguigu.mpdemo.controller;

import com.atguigu.mpdemo.entity.User;
import com.atguigu.mpdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("testA")
    public List<User> getAll(){
        return userService.getAll();
    }
}
