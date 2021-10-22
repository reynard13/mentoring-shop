package com.example.servingwebcontent.controller;

import com.example.servingwebcontent.DataBase;
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
    public User findUser(@RequestParam String id) {

        User response = new User();
        response.setName(userService.getBd(Integer.parseInt(id)));
        return response;
    }


    @PostMapping
    public void create(@RequestBody User request) {
        userService.setBd(request.getName());
       // System.out.println(userService.toString());
    }
}
