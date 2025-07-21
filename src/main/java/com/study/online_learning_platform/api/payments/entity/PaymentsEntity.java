package com.study.online_learning_platform.api.payments.entity;

import java.sql.Date;

import com.study.online_learning_platform.api.courses.entity.CourseEntity;
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

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "payments")
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class PaymentsEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    Integer payment_id;

    @Column(name = "amount")
    Double amount;

    @Column(name = "currency")
    String currency;

    @Column(name = "payment_method")
    String payment_method;

    @Column(name = "transaction_id")
    String transaction_id;

    @Column(name = "status")
    String status;

    @Column(name = "payment_gateway_response")
    String payment_gateway_response;

    @Column(name = "created_at")
    Date created_at;

    @Column(name = "completed_at")
    Date completed_at;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private CourseEntity course;

}
