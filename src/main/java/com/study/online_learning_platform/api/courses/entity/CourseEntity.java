package com.study.online_learning_platform.api.courses.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.study.online_learning_platform.api.categories.entity.CategoryEntity;
import com.study.online_learning_platform.api.certificates.entity.CertificateEntity;
import com.study.online_learning_platform.api.courseReviews.entity.CourseReviewsEntity;
import com.study.online_learning_platform.api.discussions.entity.DiscussionsEntity;
import com.study.online_learning_platform.api.payments.entity.PaymentsEntity;
import com.study.online_learning_platform.api.user.entity.UserEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "courses")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    Integer courseId;

    @Column(name = "title")
    String title;

    @Column(name = "slug")
    String slug;

    @Column(name = "short_description")
    String short_description;

    @Column(name = "full_description")
    String full_description;

    @Column(name = "thumbnail_url")
    String thumbnail_url;

    @Column(name = "trailer_url")
    String trailer_url;

    @Column(name = "level")
    String level;

    @Column(name = "language")
    String language;

    @Column(name = "price")
    Double price;

    @Column(name = "discount_price")
    Double discountPrice;

    @Column(name = "duration_hours")
    Integer durationHours;

    @Column(name = "max_students")
    Integer maxStudents;

    @Column(name = "prerequisites")
    String prerequisites;

    @Column(name = "what_you_learn")
    String whatYouLearn;

    @Column(name = "status")
    String status;

    @Column(name = "featured")
    Boolean featured;

    @Column(name = "rating_avg")
    Integer ratingAvg;

    @Column(name = "rating_count")
    Integer ratingCount;

    @Column(name = "student_count")
    Integer studentsCount;

    @Column(name = "created_at")
    Date createdAt;

    @Column(name = "updated_at")
    Date updatedAt;

    @Column(name = "published_at")
    Date publishedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "instructor_id")
    private UserEntity instructor;

    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

    @OneToMany(mappedBy = "course", orphanRemoval = true, fetch = FetchType.LAZY)
    private List<DiscussionsEntity> discussions;

    @OneToMany(mappedBy = "course", orphanRemoval = true, fetch = FetchType.LAZY)
    private List<CourseReviewsEntity> reviews;

    @OneToMany(mappedBy = "course")
    private List<CertificateEntity> certificates;

    @OneToMany(mappedBy = "course")
    private List<PaymentsEntity> payments;
}
