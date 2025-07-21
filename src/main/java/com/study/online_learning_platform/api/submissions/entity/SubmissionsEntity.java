package com.study.online_learning_platform.api.submissions.entity;

import java.sql.Date;

import com.study.online_learning_platform.api.assignments.entity.AssignmentsEntity;
import com.study.online_learning_platform.api.user.entity.UserEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
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
@Table(name = "submissions")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SubmissionsEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    Integer submissionId;

    @Column(name = "url_submission")
    String urlSubmission;

    @Column(name = "submitted_at")
    Date submittedAt;

    @Column(name = "status")
    String status;

    @Column(name = "grade")
    Double grade;

    @Column(name = "feedback")
    String feedback;

    @Column(name = "graded_at")
    Date gradedAt;

    @ManyToOne
    @JoinColumn(name = "assignment_id", nullable = false)
    private AssignmentsEntity assignment;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "graded_by")
    private UserEntity gradedBy;
}
