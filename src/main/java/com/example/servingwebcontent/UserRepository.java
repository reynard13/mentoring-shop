package com.example.servingwebcontent;

import com.example.servingwebcontent.model.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserRepository {
    private int index;
    private HashMap<Integer, User> map = new HashMap<>();

    public UserRepository() {
        map = new HashMap<>();
        index = 1;
    }

    public void save(User user) {
        user.setId(index);
        map.put(index, user);
        index++;
    }

    public User getUser(int index) {
        return map.get(index);
    }

    @Override
    public String toString() {
        return "DataBase{" + map;
    }
}
