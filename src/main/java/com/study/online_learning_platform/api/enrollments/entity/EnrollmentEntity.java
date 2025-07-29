package com.study.online_learning_platform.api.enrollments.entity;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import com.study.online_learning_platform.api.courses.entity.CourseEntity;
import com.study.online_learning_platform.api.user.entity.UserEntity;

import jakarta.persistence.*;
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
    Integer enrollment_id;

    @Column(name = "enrollment_date")
    Timestamp enrollment_date;

    @Column(name = "completion_date")
    Timestamp completion_date;

    @Column(name = "progress_percentage")
    Double progress_percentage;

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
    Timestamp last_accessed;

    @ManyToOne
    @JoinColumn(name = "user_id")
    UserEntity userEntity;
    
    @ManyToOne
    @JoinColumn(name = "course_id")
    CourseEntity courseEntity;

}
