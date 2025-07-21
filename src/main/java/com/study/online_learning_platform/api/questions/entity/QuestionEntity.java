package com.study.online_learning_platform.api.questions.entity;

import java.sql.Date;

import com.study.online_learning_platform.api.quizzes.entity.QuizzesEntity;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
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
@Table(name = "questions")
public class QuestionEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    Integer questionId;

    @Column(name = "quiz_id")
    Integer quizId;

    @Column(name = "questionText")
    String questionText;

    @Column(name = "questionType")
    String questionType;

    @Column(name = "points")
    Double points;

    @Column(name = "explanation")
    String explanation;

    @Column(name = "sortOrder")
    Integer sortOrder;

    @Column(name = "isActive")
    Boolean isActive;

    @Column(name = "createAt")
    Date createAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quiz_id", nullable = false)
    private QuizzesEntity quizzes;

}
