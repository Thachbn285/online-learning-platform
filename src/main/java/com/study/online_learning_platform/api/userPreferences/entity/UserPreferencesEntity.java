package com.study.online_learning_platform.api.userPreferences.entity;

import java.sql.Timestamp;
import java.util.Date;

import com.study.online_learning_platform.api.user.entity.UserEntity;

import jakarta.persistence.*;
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
    Boolean email_notifications;
    @Column(name = "push_notifications")
    Boolean push_notifications;
    @Column(name = "marketing_emails")
    Boolean marketing_emails;
    @Column(name = "theme")
    String theme;
    @Column(name = "playback_speed")
    Double playback_speed;
    @Column(name = "auto_play_next")
    Boolean auto_play_next;
    @Column(name = "created_at")
    Timestamp created_at;
    @Column(name = "updated_at")
    Timestamp updated_at;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;

}
