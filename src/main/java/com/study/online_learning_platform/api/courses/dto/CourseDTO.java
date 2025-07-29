package com.study.online_learning_platform.api.courses.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class CourseDTO {
	Integer course_id;
	String title;
	String slug;
	String short_description;
	String full_description;
	String thumbnail_url;
	String trailer_url;
	String level;
	String language;
	Float price;
	Float  discount_price;
	Integer duration_hours;
	Integer max_students;
	String prerequisites;
	String whatYouLearn;
	String status;
	Boolean featured;
	Double rating_avg;
	Integer rating_count;
	Integer student_count;
	Date created_at;
	Date updated_at;
	Date published_at;
}
