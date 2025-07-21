package com.study.online_learning_platform.api.userPreferences.entity;

import java.util.Date;

import com.study.online_learning_platform.api.user.entity.UserEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table(name = "user_preferences")
public class UserPreferencesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer preference_id;

    @Column(name = "language")
    String language;

    @Column(name = "timezone")
    String timeZone;

    @Column(name = "email_notifications")
    Boolean emailNotifications;

    @Column(name = "push_notifications")
    Boolean pushNotifications;

    @Column(name = "marketing_emails")
    Boolean marketingEmails;

    @Column(name = "theme")
    String theme;

    @Column(name = "playback_speed")
    Double playbackSpeed;

    @Column(name = "auto_play_next")
    Boolean autoPlayNext;

    @Column(name = "created_at")
    Date createdAt;

    @Column(name = "updated_at")
    Date updatedAt;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

}
