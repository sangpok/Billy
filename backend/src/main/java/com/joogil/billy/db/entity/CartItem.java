package com.joogil.billy.db.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class CartItem extends BaseEntity {
    @ManyToOne
    @NotNull
    private Cart cart;

    @ManyToOne
    @NotNull
    private Club club;

    @ManyToOne
    @NotNull
    private Item item;
}
