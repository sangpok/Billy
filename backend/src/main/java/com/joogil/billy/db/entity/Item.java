package com.joogil.billy.db.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Item extends BaseEntity {
    @ManyToOne
    @NotNull
    private Club club;

    @ManyToOne
    @NotNull
    private ItemCategory itemCategory;

    @ManyToOne
    private ItemSubCategory itemSubCategory;

    @OneToOne
    @JoinColumn(name = "thumbnail_image_id")
    private ItemImage thumbnailImage;

    @Column(length = 100)
    @NotNull
    private String name;

    @Column(columnDefinition = "TEXT")
    @NotNull
    private String description;

    @NotNull
    @Enumerated(EnumType.ORDINAL)
    private ItemStateEnum state;

    @CreatedDate
    private LocalDate reg_date;
}
