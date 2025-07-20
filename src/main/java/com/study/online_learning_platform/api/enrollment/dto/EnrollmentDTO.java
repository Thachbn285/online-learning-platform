package com.study.online_learning_platform.api.enrollment.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class EnrollmentDTO {
    Integer id;
    Integer userId;
    Integer courseId;
    Double progress;
    Date enrollAt;
}
