package com.example.servingwebcontent.service;

import com.example.servingwebcontent.DataBase;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private DataBase bd = new DataBase();

    public void setBd(String name) {
        bd.set(name);
    }

    public String getBd(int index) {
        return  bd.getMap(index);
    }

    @Override
    public String toString() {

        return bd.toString();
    }
}
