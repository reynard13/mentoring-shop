package com.example.servingwebcontent.service;

import com.example.servingwebcontent.UserRepository;
import com.example.servingwebcontent.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository bd = new UserRepository();

    public void addUser(User user) {

        bd.save(user);
    }

    public User getUser(int index) {
        return  bd.getUser(index);
    }

    @Override
    public String toString() {

        return bd.toString();
    }
}
