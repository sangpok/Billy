package com.joogil.billy.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class ItemCategory extends BaseEntity {
    @ManyToOne
    private Club club;

    @Column(length = 100)
    @NotNull
    private String name;
}
