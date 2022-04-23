package com.joogil.billy.db.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Cart extends BaseEntity {
    @OneToOne
    private User user;
}
