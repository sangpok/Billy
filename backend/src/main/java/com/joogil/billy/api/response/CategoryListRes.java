package com.joogil.billy.api.response;

import com.joogil.billy.db.entity.Category;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CategoryListRes {
    private Long id;
    private String name;

    public static CategoryListRes of(Category category) {
        return CategoryListRes.builder()
            .id(category.getId())
            .name(category.getName())
            .build();
    }
}
