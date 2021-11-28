package org.example.mentoringshop.repositories;

import org.example.mentoringshop.models.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class UserRepository  implements Dao<User> {
    private int index;
    private final HashMap<Integer, User> map;

    public UserRepository() {
        map = new HashMap<>();
        index = 1;
    }

    @Override
    public void save(User user) {
        user.setId(index);
        map.put(index, user);
        index++;
    }
    @Override
    public User get(int index) {
        return map.get(index);
    }

}
