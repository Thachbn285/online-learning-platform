package com.study.online_learning_platform.api.quizAttempts.entity;

import java.sql.Timestamp;

import com.study.online_learning_platform.api.quizzes.entity.QuizzesEntity;
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

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@Entity
@Table(name = "quiz_attempts")
public class QuizAttemptsEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    Integer attempt_id;
    @Column(name = "attempt_number")
    Integer attempt_number;
    @Column(name = "start_time")
    Timestamp start_time;
    @Column(name = "end_time")
    Timestamp end_time;
    @Column(name = "score")
    Double score;
    @Column(name = "total_points")
    Double total_points;
    @Column(name = "status")
    String status;
    @Column(name = "answers")
    String answers;
    @Column(name = "time_taken")
    Integer time_taken;
    @Column(name = "passed")
    Boolean passed;

    @ManyToOne
    @JoinColumn(name = "user_id")
    UserEntity userEntity;
    @ManyToOne
    @JoinColumn(name = "quiz_id")
    QuizzesEntity quizzesEntity;


}
