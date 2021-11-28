package org.example.mentoringshop.services;

import org.example.mentoringshop.models.Category;
import org.example.mentoringshop.models.User;
import org.example.mentoringshop.repositories.CategoryRepository;
import org.example.mentoringshop.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    public Category getCategory(int index) {
        return categoryRepository.get(index);
    }
}
