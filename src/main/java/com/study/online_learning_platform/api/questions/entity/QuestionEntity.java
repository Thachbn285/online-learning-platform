package com.study.online_learning_platform.api.questions.entity;

import java.sql.Date;
import java.util.List;

import com.study.online_learning_platform.api.questionOptions.entity.QuestionOptionsEntity;
import com.study.online_learning_platform.api.quizzes.entity.QuizzesEntity;

import jakarta.persistence.*;
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
@Entity
public class QuestionEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    Integer question_id;
    @Column(name = "question_text")
    String question_text;
    @Column(name = "question_type")
    String question_type;
    @Column(name = "points")
    Double points;
    @Column(name = "explanation")
    String explanation;
    @Column(name = "sort_order")
    Integer sort_order;
    @Column(name = "is_active")
    Boolean is_active;
    @Column(name = "created_at")
    Date created_at;
    
    @OneToMany(mappedBy = "questionEntity")
    List<QuestionOptionsEntity> questionOptionsEntities;
    @ManyToOne
    @JoinColumn(name = "quiz_id")
    QuizzesEntity quizzesEntity;

}
