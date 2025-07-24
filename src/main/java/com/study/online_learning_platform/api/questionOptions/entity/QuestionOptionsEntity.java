package com.study.online_learning_platform.api.questionOptions.entity;

import com.study.online_learning_platform.api.questions.entity.QuestionEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@Table(name = "question_options")
@Entity
public class QuestionOptionsEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    Integer option_id;
    @Column(name = "option_text")
    String option_text;
    @Column(name = "is_correct")
    Boolean is_correct;
    @Column(name = "sort_order")
    Integer sort_order;
    @Column(name = "created_at")
    Timestamp created_at;

    @ManyToOne
    @JoinColumn(name = "question_id")
    QuestionEntity questionEntity;
}
