package com.joogil.billy.db.entity;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Member extends BaseEntity {
    @ManyToOne
    private User user;

    @ManyToOne
    private Club club;

    @NotNull
    private String nickname;

    @NotNull
    private Boolean isApproved = false;

    private LocalDateTime joinDatetime;

    @NotNull
    @Enumerated(EnumType.ORDINAL)
    private GradeEnum grade;
}
