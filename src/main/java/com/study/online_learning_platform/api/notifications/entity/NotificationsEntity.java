package com.study.online_learning_platform.api.notifications.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Date;

import com.study.online_learning_platform.api.user.entity.UserEntity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@Table(name = "notifications")
@Entity
public class NotificationsEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    Integer notification_id;

    @Column(name = "title")
    String title;

    @Column(name = "message")
    String message;

    @Column(name = "notification_type")
    String notification_type;

    @Column(name = "related_id")
    Integer related_id;

    @Column(name = "is_read")
    Boolean is_read;

    @Column(name = "created_at")
    Date created_at;

    @Column(name = "read_at")
    Date read_at;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

}
