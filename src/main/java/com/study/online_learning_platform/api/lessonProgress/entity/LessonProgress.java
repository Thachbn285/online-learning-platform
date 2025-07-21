package com.study.online_learning_platform.api.lessonProgress.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Date;

import com.study.online_learning_platform.api.lesson.entity.LessonEntity;
import com.study.online_learning_platform.api.user.entity.UserEntity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@Table(name = "lesson_progress")
public class LessonProgress {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    Integer lessonProgressId;

    @Column(name = "user_id")
    Integer userId;

    @Column(name = "status")
    String status;

    @Column(name = "completion_percentage")
    Double completionPercentage;

    @Column(name = "time_spent")
    Integer timeSpent;

    @Column(name = "last_position")
    Integer lastPosition;

    @Column(name = "completed_at")
    Date completedAt;

    @Column(name = "first_accessed")
    Date firstAccessed;

    @Column(name = "last_accessed")
    Date lastAccessed;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private LessonEntity lesson;

}
