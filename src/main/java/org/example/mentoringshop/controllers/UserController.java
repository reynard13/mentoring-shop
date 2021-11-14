package org.example.mentoringshop.controllers;

import org.example.mentoringshop.models.User;
import org.example.mentoringshop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public User getUser(@RequestParam Integer id) {
        return userService.getUser(id);
    }

    @PostMapping
    public User store(@RequestBody User user) {
        userService.addUser(user);
        return user;
    }
}
