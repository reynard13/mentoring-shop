package org.example.mentoringshop.repositories;

import org.example.mentoringshop.models.Category;
import org.springframework.stereotype.Component;
import java.util.HashMap;

@Component
public class CategoryRepository {
    private HashMap<Integer, Category> map;
    private int index;

    public CategoryRepository(){
        map = new HashMap<>();
        index = 1;
    }
    public void save(Category category){
        category.setId(index);
        map.put(index,category);
        index++;
    }
    public Category get(int index) {
        return map.get(index);
    }

}
