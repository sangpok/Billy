package com.joogil.billy.db.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Club extends BaseEntity {
    @ManyToOne
    @NotNull
    private Category category;

    @Column(length = 100)
    @NotNull
    private String name;

    @Column(columnDefinition = "TEXT")
    @NotNull
    private String description;

    @NotNull
    private String password;

    @NotNull
    private Boolean isAutoJoin;

    private String thumbnailUrl;

    @NotNull
    private Boolean isAuthorizedPhoneNumber;

    @NotNull
    private Boolean isAuthorizedBirth;

    @CreatedDate
    private LocalDate regDate;
}
