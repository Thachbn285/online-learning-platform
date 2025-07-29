package com.study.online_learning_platform.api.lesson.entity;

import com.study.online_learning_platform.api.assignments.entity.AssignmentsEntity;
import com.study.online_learning_platform.api.discussions.entity.DiscussionsEntity;
import com.study.online_learning_platform.api.lessonProgress.entity.LessonProgressEntity;
import com.study.online_learning_platform.api.quizzes.entity.QuizzesEntity;
import com.study.online_learning_platform.api.sections.entity.SectionsEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@Entity
@Table(name = "lessons")
public class LessonEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    Integer lesson_id;
    @Column(name = "title")
    String title;
    @Column(name = "slug")
    String slug;
    @Column(name = "content")
    String content;
    @Column(name = "lesson_type")
    String lesson_type;
    @Column(name = "video_url")
    String video_url;
    @Column(name = "video_duration")
    Integer video_duration;
    @Column(name = "attachments")
    String attachments;
    @Column(name = "is_preview")
    Boolean is_preview;
    @Column(name = "sort_order")
    Integer sort_order;
    @Column(name = "is_active")
    Boolean is_active;
    @Column(name = "created_at")
    Timestamp created_at;
    @Column(name = "updated_at")
    Timestamp updated_at;
    
    @ManyToOne
    @JoinColumn(name = "section_id")
    SectionsEntity sectionsEntity;
    @OneToMany(mappedBy = "lessonEntity")
    List<LessonProgressEntity> lessonProgressEntities;
    @OneToMany(mappedBy = "lessonEntity")
    List<QuizzesEntity> quizzesEntities;
    @OneToMany(mappedBy = "lessonEntity")
    List<AssignmentsEntity> assignmentsEntities;
    @OneToMany(mappedBy = "lessonEntity")
    List<DiscussionsEntity> discussionsEntities;
}
