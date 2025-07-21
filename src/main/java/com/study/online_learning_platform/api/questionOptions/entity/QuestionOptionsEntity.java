package com.study.online_learning_platform.api.questionOptions.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Date;

import com.study.online_learning_platform.api.questions.entity.QuestionEntity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@Table(name = "question_options")
public class QuestionOptionsEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    Integer optionId;

    @Column(name = "question_id")
    Integer questionId;

    @Column(name = "option_text")
    String optionText;

    @Column(name = "is_correct")
    Boolean isCorrect;

    @Column(name = "sort_order")
    Integer sortOrder;

    @Column(name = "created_at")
    Date createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private QuestionEntity question;

}
