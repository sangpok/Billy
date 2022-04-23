package com.joogil.billy.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class ItemSubCategory extends BaseEntity {
    @ManyToOne
    private ItemCategory itemCategory;

    @Column(length = 100)
    @NotNull
    private String name;
}
