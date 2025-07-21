package com.study.online_learning_platform.api.courses.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class CourseDTO {
    Integer courseId;
    String title;
    String slug;
    String short_description;
    String full_description;
    String thumbnail_url;
    String trailer_url;
    String level;
    String language;
    Double price;
    Double discountPrice;
    Integer durationHours;
    Integer maxStudents;
    String prerequisites;
    String whatYouLearn;
    String status;
    Boolean featured;
    Integer ratingAvg;
    Integer ratingCount;
    Integer studentsCount;
    Date createdAt;
    Date updatedAt;
    Date publishedAt;
}
