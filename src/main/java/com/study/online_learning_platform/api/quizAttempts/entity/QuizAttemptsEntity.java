package com.study.online_learning_platform.api.quizAttempts.entity;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
@Table(name = "quiz_attempts")
public class QuizAttemptsEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    Integer attempt_id;

    @Column(name = "user_id")
    Integer user_id;

    @Column(name = "quiz_id")
    Integer quiz_id;

    @Column(name = "attempt_number")
    Integer attempt_number;

    @Column(name = "start_time")
    Date start_time;

    @Column(name = "end_time")
    Date end_time;

    @Column(name = "score")
    Integer score;

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

}
