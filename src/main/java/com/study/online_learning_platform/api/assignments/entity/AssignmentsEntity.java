package com.study.online_learning_platform.api.assignments.entity;

import java.sql.Date;
import java.util.List;

import com.study.online_learning_platform.api.lesson.entity.LessonEntity;
import com.study.online_learning_platform.api.submissions.entity.SubmissionsEntity;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "assignments")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AssignmentsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer assignmentId;

    @Column(name = "title")
    String title;

    @Column(name = "description")
    String description;

    @Column(name = "instructions")
    String instructions;

    @Column(name = "max_points")
    Double maxPoints;

    @Column(name = "due_date")
    Date dueDate;

    @Column(name = "submission_type")
    String submissionType;

    @Column(name = "max_file_size")
    Integer maxFileSize;

    @Column(name = "allowed_extensions")
    String allowedExtensions;

    @Column(name = "is_active")
    Integer isActive;

    @Column(name = "created_at")
    Date createdAt;

    @OneToMany(mappedBy = "lesson_id")
    List<LessonEntity> lessons;

    @OneToMany(mappedBy = "assignment", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SubmissionsEntity> submissions;

}
