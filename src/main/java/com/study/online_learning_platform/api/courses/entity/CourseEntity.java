package com.study.online_learning_platform.api.courses.entity;

import java.util.Date;
import java.util.List;

import com.study.online_learning_platform.api.categories.entity.CategoriesEntity;
import com.study.online_learning_platform.api.certificates.entity.CertificateEntity;
import com.study.online_learning_platform.api.courseReviews.entity.CourseReviewsEntity;
import com.study.online_learning_platform.api.discussions.entity.DiscussionsEntity;
import com.study.online_learning_platform.api.enrollments.entity.EnrollmentEntity;
import com.study.online_learning_platform.api.payments.entity.PaymentsEntity;
import com.study.online_learning_platform.api.sections.entity.SectionsEntity;
import com.study.online_learning_platform.api.user.entity.UserEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
    Integer course_id;
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
    Float price;
    @Column(name = "discount_price")
    Float  discount_price;
    @Column(name = "duration_hours")
    Integer duration_hours;
    @Column(name = "max_students")
    Integer max_students;
    @Column(name = "prerequisites")
    String prerequisites;
    @Column(name = "what_you_learn")
    String whatYouLearn;
    @Column(name = "status")
    String status;
    @Column(name = "featured")
    Boolean featured;
    @Column(name = "rating_avg")
    Double rating_avg;
    @Column(name = "rating_count")
    Integer rating_count;
    @Column(name = "student_count")
    Integer student_count;
    @Column(name = "created_at")
    Date created_at;
    @Column(name = "updated_at")
    Date updated_at;
    @Column(name = "published_at")
    Date published_at;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    UserEntity userEntity;
    @ManyToOne
    @JoinColumn(name = "category_id")
    CategoriesEntity categoriesEntity;
    @OneToMany(mappedBy = "courseEntity")
    List<SectionsEntity> sectionsEntities;
    @OneToMany(mappedBy = "courseEntity")
    List<EnrollmentEntity> enrollmentEntities;
    @OneToMany(mappedBy = "courseEntity")
    List<DiscussionsEntity> discussionsEntities;
    @OneToMany(mappedBy = "courseEntity")
    List<CourseReviewsEntity> courseReviewsEntities;
    @OneToMany(mappedBy = "courseEntity")
    List<CertificateEntity> certificateEntities;
    @OneToMany(mappedBy = "courseEntity")
    List<PaymentsEntity> paymentsEntities;


}
