package com.study.online_learning_platform.api.cart.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@Getter
@Setter
public class CartDTO {
    Long id;
    Long userId;
    Long courseId;
    Date addAt;
}
