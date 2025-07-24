package com.study.online_learning_platform.api.user.entity;

import com.study.online_learning_platform.api.certificates.entity.CertificateEntity;
import com.study.online_learning_platform.api.courseReviews.entity.CourseReviewsEntity;
import com.study.online_learning_platform.api.courses.entity.CourseEntity;
import com.study.online_learning_platform.api.discussionReplies.entity.DiscussionRepliesEntity;
import com.study.online_learning_platform.api.discussions.entity.DiscussionsEntity;
import com.study.online_learning_platform.api.enrollments.entity.EnrollmentEntity;
import com.study.online_learning_platform.api.lessonProgress.entity.LessonProgressEntity;
import com.study.online_learning_platform.api.notifications.entity.NotificationsEntity;
import com.study.online_learning_platform.api.payments.entity.PaymentsEntity;
import com.study.online_learning_platform.api.quizAttempts.entity.QuizAttemptsEntity;
import com.study.online_learning_platform.api.submissions.entity.SubmissionsEntity;
import com.study.online_learning_platform.api.userPreferences.entity.UserPreferencesEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer user_id;
    @Column(name = "username")
    String username;
    @Column(name = "email")
    String email;
    @Column(name = "password_hash")
    String password_hash;
    @Column(name = "first_name")
    String first_name;
    @Column(name = "last_name")
    String last_name;
    @Column(name = "phone")
    String phone;
    @Column(name = "date_of_birth")
    Date date_of_birth;
    @Column(name = "avatar_url")
    String avatar_url;
    @Column(name = "bio")
    String bio;
    @Column(name = "role")
    String role;
    @Column(name = "status")
    String status;
    @Column(name = "email_verified")
    Boolean email_verified;
    @Column(name = "created_at")
    Timestamp created_at;
    @Column(name = "updated_at")
    Timestamp updated_at;
    @Column(name = "last_login")
    Timestamp last_login;

    @OneToMany(mappedBy = "userEntity")
    List<CourseEntity> courseEntities;
    @OneToMany(mappedBy = "userEntity")
    List<EnrollmentEntity> enrollmentEntities;
    @OneToMany(mappedBy = "userEntity")
    List<LessonProgressEntity> lessonProgressEntities;
    @OneToMany(mappedBy = "userEntity")
    List<QuizAttemptsEntity> quizAttemptsEntities;
    @OneToMany(mappedBy = "userEntity")
    List<SubmissionsEntity> submissionsEntities;
    @OneToMany(mappedBy = "userEntity")
    List<DiscussionsEntity> discussionsEntities;
    @OneToMany(mappedBy = "userEntity")
    List<DiscussionRepliesEntity> discussionRepliesEntities;
    @OneToMany(mappedBy = "userEntity")
    List<CourseReviewsEntity> courseReviewsEntities;
    @OneToMany(mappedBy = "userEntity")
    List<CertificateEntity> certificateEntities;
    @OneToMany(mappedBy = "userEntity")
    List<PaymentsEntity> paymentsEntities;
    @OneToMany(mappedBy = "userEntity")
    List<NotificationsEntity> notificationsEntities;
    @OneToMany(mappedBy = "userEntity")
    List<UserPreferencesEntity> userPreferencesEntities;

}
