package org.example.mentoringshop.services;

import org.example.mentoringshop.repositories.UserRepository;
import org.example.mentoringshop.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public User getUser(int index) {
        return userRepository.get(index);
    }

}
