package com.joogil.billy.db.repository;

import com.joogil.billy.db.entity.Category;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findAll();
}
