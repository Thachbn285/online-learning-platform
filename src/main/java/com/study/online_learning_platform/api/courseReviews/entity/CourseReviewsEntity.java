package com.study.online_learning_platform.api.courseReviews.entity;

import java.sql.Date;
import java.util.List;

import com.study.online_learning_platform.api.courses.entity.CourseEntity;
import com.study.online_learning_platform.api.user.entity.UserEntity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "course_reviews")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CourseReviewsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer reviewId;
    @Column(name = "rating")
    Integer rating;
    @Column(name = "review_text")
    String reviewText;
    @Column(name = "is_anonymous")
    Boolean isAnonymous;
    @Column(name = "status")
    String status;
    @Column(name = "helpful_count")
    Integer helpfulCount;
    @Column(name = "created_at")
    Date createdAt;
    @Column(name = "updated_at")
    Date updatedAt;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private CourseEntity courseEntity;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;
 
}
