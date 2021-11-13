package org.example.mentoringshop.repositories;

import org.example.mentoringshop.models.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class UserRepository {
    private int index;
    private HashMap<Integer, User> map;

    public UserRepository() {
        map = new HashMap<>();
        index = 1;
    }

    public void save(User user) {
        user.setId(index);
        map.put(index, user);
        index++;
    }

    public User get(int index) {
        System.out.println("user map.get(index): "+map.get(index));
        return map.get(index);
    }

}
