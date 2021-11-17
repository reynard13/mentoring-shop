package org.example.mentoringshop.services;

import org.example.mentoringshop.repositories.Dao;
import org.example.mentoringshop.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    private Dao<User> userRepository;

    public UserService(Dao<User> userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public User getUser(int index) {
        return userRepository.get(index);
    }

}
