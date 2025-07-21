package com.study.online_learning_platform.api.certificates.entity;

import java.sql.Date;

import com.study.online_learning_platform.api.courses.entity.CourseEntity;
import com.study.online_learning_platform.api.user.entity.UserEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name = "certificate")
public class CertificateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer certificate_id;

    @Column(name = "certificate_code")
    String certificate_code;

    @Column(name = "issue_date")
    Date issueDate;

    @Column(name = "expiry_date")
    Date expiry_date;

    @Column(name = "certificate_url")
    String certificateUrl;

    @Column(name = "verification_url")
    String verification_url;

    @Column(name = "status")
    String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private CourseEntity course;
}
