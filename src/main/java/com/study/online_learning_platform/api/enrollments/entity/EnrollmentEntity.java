package com.study.online_learning_platform.api.enrollments.entity;

import java.sql.Date;

import com.study.online_learning_platform.api.courses.entity.CourseEntity;
import com.study.online_learning_platform.api.user.entity.UserEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@Table(name = "enrollments")
public class EnrollmentEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    Integer enrollmentId;

    @Column(name = "enrollment_date")
    Date enrollmentDate;

    @Column(name = "completion_date")
    Date completionDate;

    @Column(name = "progress_percentage")
    Double progressPercentage;

    @Column(name = "status")
    String status;

    @Column(name = "payment_status")
    String payment_status;

    @Column(name = "payment_amount")
    Double payment_amount;

    @Column(name = "certificate_issued")
    Boolean certificate_issued;

    @Column(name = "certificate_url")
    String certificate_url;

    @Column(name = "last_accessed")
    Date last_accessed;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private CourseEntity course;
}
