package com.study.online_learning_platform.api.lessonProgress.entity;

import com.study.online_learning_platform.api.lesson.entity.LessonEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;
import java.util.List;

import com.study.online_learning_platform.api.user.entity.UserEntity;

@Getter
@Entity
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@Table(name = "lesson_progress")
public class LessonProgressEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    Integer progress_id;
    @Column(name = "status")
    String status;
    @Column(name = "completion_percentage")
    Double completion_percentage;
    @Column(name = "time_spent")
    Integer time_spent;
    @Column(name = "last_position")
    Integer last_position;
    @Column(name = "completed_at")
    Timestamp completed_at;
    @Column(name = "first_accessed")
    Timestamp first_accessed;
    @Column(name = "last_accessed")
    Timestamp last_accessed;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    UserEntity userEntity;
    @ManyToOne
    @JoinColumn(name = "lesson_id")
    LessonEntity lessonEntity;
}
