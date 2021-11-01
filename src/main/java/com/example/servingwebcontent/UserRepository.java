package com.example.servingwebcontent;

import com.example.servingwebcontent.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private int index=0;
    private HashMap<Integer, User> map = new HashMap<>();

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
        return "DataBase{" + map ;
    }
}
