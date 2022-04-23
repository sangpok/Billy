package com.joogil.billy.db.entity;

import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Cart {
    @Id
    @OneToOne
    private User user;
}
