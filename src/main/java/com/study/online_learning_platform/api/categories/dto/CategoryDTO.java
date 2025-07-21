package com.study.online_learning_platform.api.categories.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@Getter
@Setter
public class CategoryDTO {
    Long id;
    String name;
    String icon;
}
