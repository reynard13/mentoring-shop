package com.example.servingwebcontent.controller;

import com.example.servingwebcontent.model.User;
import com.example.servingwebcontent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    @ResponseBody
    public User getUser(@RequestParam Integer id) {

//        User response = new User();
//        response.setName(userService.getBd(id));
        return userService.getUser(id);
    }


    @PostMapping
    public User create(@RequestBody User user) {
        userService.addUser(user);
        return user;
    }
}
