package com.joogil.billy.db.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class User extends BaseEntity {
    @NotNull
    private String email;
    @NotNull
    private String password;
    @Column(length = 100)
    @NotNull
    private String name;
    private String profileImgUrl;
    @Column(length = 11)
    private String phoneNumber;
    private LocalDate birth;
}
