package com.study.online_learning_platform.api.user.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.modelmapper.internal.bytebuddy.dynamic.TypeResolutionStrategy.Lazy;

import com.study.online_learning_platform.api.certificates.entity.CertificateEntity;
import com.study.online_learning_platform.api.courseReviews.entity.CourseReviewsEntity;
import com.study.online_learning_platform.api.courses.entity.CourseEntity;
import com.study.online_learning_platform.api.discussionReplies.entity.DiscussionRepliesEntity;
import com.study.online_learning_platform.api.discussions.entity.DiscussionsEntity;
import com.study.online_learning_platform.api.notifications.entity.NotificationsEntity;
import com.study.online_learning_platform.api.payments.entity.PaymentsEntity;
import com.study.online_learning_platform.api.quizzes.entity.QuizzesEntity;
import com.study.online_learning_platform.api.submissions.entity.SubmissionsEntity;
import com.study.online_learning_platform.api.userPreferences.entity.UserPreferencesEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor

@Getter
@Setter
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer user_id;

    @Column(name = "username")
    String username;

    @Column(name = "email")
    String email;

    @Column(name = "password_hash")
    String passwordHash;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @Column(name = "phone")
    String phone;

    @Column(name = "date_of_birth")
    Date dateOfBirth;

    @Column(name = "avatar_url")
    String avatarUrl;

    @Column(name = "bio")
    String bio;

    @Column(name = "role")
    String role;

    @Column(name = "status")
    String status;

    @Column(name = "email_verified")
    Integer emailVerified;

    @Column(name = "created_at")
    Date createdAt;

    @Column(name = "updated_at")
    Date updatedAt;

    @Column(name = "last_login")
    Date lastLogin;

    @ManyToMany(cascade = { jakarta.persistence.CascadeType.MERGE, jakarta.persistence.CascadeType.PERSIST })
    @JoinTable(name = "user_courses", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
    List<CourseEntity> courses;

    @ManyToMany(cascade = { jakarta.persistence.CascadeType.MERGE, jakarta.persistence.CascadeType.PERSIST })
    @JoinTable(name = "user_quizzes", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "quiz_id"))
    List<QuizzesEntity> quizzes;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    List<SubmissionsEntity> submissions;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    List<SubmissionsEntity> gradedSubmissions;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    List<DiscussionsEntity> discussions;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DiscussionRepliesEntity> replies;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CourseReviewsEntity> reviews;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CertificateEntity> certificates;

    @OneToMany(mappedBy = "user")
    private List<PaymentsEntity> payments;

    @OneToMany(mappedBy = "user")
    private List<NotificationsEntity> notifications;

    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY)
    private UserPreferencesEntity preferences;

}
