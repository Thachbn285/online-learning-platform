package com.study.online_learning_platform.api.course.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Course")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CourseEntity {
    @Id
    @GeneratedValue
    Integer id;
    @Column(name = "title")
    String title;
    @Column(name = "des_introduce")
    String des_introduce;
    @Column(name = "price")
    BigDecimal price;
    @Column(name = "discount_price")
    BigDecimal discount_price;
    @Column(name = "level")
    String level;
    @Column(name = "language")
    String language;
    @Column(name = "thumbnail")
    String thumbnail;
    @Column(name = "status")
    String status;
    @Column(name = "instructor_id")
    BigInteger instructor_id;
    @Column(name = "category_id")
    BigInteger category_id;
    @Column(name = "created_at")
    Date created_at;
    @Column(name = "updated_at")
    Date updated_at;
}
