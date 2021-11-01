package com.example.servingwebcontent;

import com.example.servingwebcontent.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private int index=0;
    HashMap<Integer, User> map = new HashMap<>();

    public void set(User user) {
        this.map.put(index, user);
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
