package com.joogil.billy.api.service;

import com.joogil.billy.db.entity.Category;
import com.joogil.billy.db.repository.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> listCategories() {
        List<Category> categories = categoryRepository.findAll();
        return categories;
    }
}
