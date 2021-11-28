package org.example.mentoringshop.controllers;

import org.example.mentoringshop.models.Category;
import org.example.mentoringshop.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {

        this.categoryService = categoryService;
    }

    @GetMapping
    public Category getCategory(@RequestParam Integer id) {
        return categoryService.getCategory(id);
    }

    @PostMapping
    public Category store(@RequestBody Category category) {
        categoryService.addCategory(category);
        return category;
    }
}
