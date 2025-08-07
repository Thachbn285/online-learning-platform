package com.study.online_learning_platform.api.quizzes.entity;

import java.util.Date;
import java.util.List;

import com.study.online_learning_platform.api.lesson.entity.LessonEntity;
import com.study.online_learning_platform.api.questions.entity.QuestionEntity;
import com.study.online_learning_platform.api.quizAttempts.entity.QuizAttemptsEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name = "quizzes")
public class QuizzesEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    Integer quiz_id;
    @Column(name = "title")
    String title;
    @Column(name = "description")
    String description;
    @Column(name = "time_limit")
    Integer time_limit;
    @Column(name = "max_attempts")
    Integer max_attempts;
    @Column(name = "passing_score")
    Double passing_score;
    @Column(name = "show_correct_answers")
    Boolean show_correct_answers;
    @Column(name = "randomize_questions")
    Boolean randomize_questions;
    @Column(name = "is_active")
    Boolean is_active;
    @Column(name = "created_at")
    Date created_at;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    LessonEntity lessonEntity;
    @OneToMany(mappedBy = "quizzesEntity")
    List<QuestionEntity> questionEntities;
    @OneToMany(mappedBy = "quizzesEntity")
    List<QuizAttemptsEntity> quizAttemptsEntities;
}
