package com.example.servingwebcontent.service;

import com.example.servingwebcontent.UserRepository;
import com.example.servingwebcontent.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository ;

    public UserService( @Autowired UserRepository userRepository) {
       this.userRepository=userRepository;
    }

    public void addUser(User user) {

        userRepository.save(user);
    }

    public User getUser(int index) {
        return  userRepository.getUser(index);
    }

    @Override
    public String toString() {

        return userRepository.toString();
    }
}
