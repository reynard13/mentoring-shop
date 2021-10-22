package com.example.servingwebcontent;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private int index=0;
    HashMap<Integer, String> map = new HashMap<>();

    public void set(String name) {
        this.map.put(index, name);
        index++;
    }

    public String getMap(int index) {
        return map.get(index);
    }

    @Override
    public String toString() {
        return "DataBase{" + map ;
    }
}
