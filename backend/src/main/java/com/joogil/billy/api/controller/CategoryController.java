package com.joogil.billy.api.controller;

import com.joogil.billy.api.response.CategoryListRes;
import com.joogil.billy.api.service.CategoryService;
import com.joogil.billy.db.entity.Category;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/category")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<List<CategoryListRes>> listCategories() {
        List<Category> categories = categoryService.listCategories();
        List<CategoryListRes> res = categories.stream()
            .map(category -> CategoryListRes.of(category))
            .collect(Collectors.toList());

        return ResponseEntity.ok(res);
    }
}
