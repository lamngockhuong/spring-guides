package com.ngockhuong.modules.data.service;

import com.ngockhuong.modules.data.model.Category;
import com.ngockhuong.modules.data.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

//    private final CategoryRepository categoryRepository;
//
//    @Autowired
//    public CategoryServiceImpl(CategoryRepository categoryRepository) {
//        this.categoryRepository = categoryRepository;
//    }

    @Override
    public List<Category> getCategories() {
        return null;
//        return categoryRepository.findAll();
    }
}
