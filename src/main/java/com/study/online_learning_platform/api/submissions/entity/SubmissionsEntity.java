package com.study.online_learning_platform.api.submissions.entity;

import com.study.online_learning_platform.api.assignments.entity.AssignmentsEntity;
import com.study.online_learning_platform.api.user.entity.UserEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Date;
import java.sql.Timestamp;

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
    Integer submission_id;
    @Column(name = "submission_text")
    String submission_text;
    @Column(name = "file_url")
    String file_url;
    @Column(name = "url_submission")
    String url_submission;
    @Column(name = "submitted_at")
    Timestamp submitted_at;
    @Column(name = "status")
    String status;
    @Column(name = "grade")
    Double grade;
    @Column(name = "feedback")
    String feedback;
    @Column(name = "graded_at")
    Date graded_at;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assignment_id", insertable = false, updatable = false)
    private AssignmentsEntity assignmentsEntity;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private UserEntity userEntity;
}
