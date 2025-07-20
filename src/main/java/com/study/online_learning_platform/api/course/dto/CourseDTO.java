package com.study.online_learning_platform.api.course.dto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class CourseDTO {
    Integer id;
    String title;
    String des_introduce;
    BigDecimal price;
    BigDecimal discount_price;
    String level;
    String language;
    String thumbnail;
    String status;
    BigInteger instructor_id;
    BigInteger category_id;
    Date created_at;
    Date updated_at;
}
