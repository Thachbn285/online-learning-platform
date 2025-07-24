package com.study.online_learning_platform.api.assignments.entity;

import com.study.online_learning_platform.api.lesson.entity.LessonEntity;
import com.study.online_learning_platform.api.submissions.entity.SubmissionsEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;

@Entity
@Table(name = "assignments")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AssignmentsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer assignment_id;
    @Column(name = "title")
    String title;
    @Column(name = "description")
    String description;
    @Column(name = "instructions")
    String instructions;
    @Column(name = "max_points")
    Double maxPoints;
    @Column(name = "due_date")
    Timestamp due_date;
    @Column(name = "submission_type")
    String submission_type;
    @Column(name = "max_file_size")
    Integer max_file_size;
    @Column(name = "allowed_extensions")
    String allowed_extensions;
    @Column(name = "is_active")
    Integer is_active;
    @Column(name = "created_at")
    Timestamp created_at;

    @ManyToOne
    @JoinColumn(name = "submission_id")
    SubmissionsEntity submissionsEntity;
    @ManyToOne
    @JoinColumn(name = "lesson_id")
    LessonEntity lessonEntity;
}
