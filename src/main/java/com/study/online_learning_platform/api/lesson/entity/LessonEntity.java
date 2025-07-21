package com.study.online_learning_platform.api.lesson.entity;

import java.sql.Date;
import java.util.List;

import com.study.online_learning_platform.api.assignments.entity.AssignmentsEntity;
import com.study.online_learning_platform.api.discussions.entity.DiscussionsEntity;
import com.study.online_learning_platform.api.sections.entity.SectionsEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
    String lessonType;

    @Column(name = "video_url")
    String videoUrl;

    @Column(name = "video_duration")
    Integer videoDuration;

    @Column(name = "attachments")
    String attachments;

    @Column(name = "is_preview")
    Boolean isPreview;

    @Column(name = "sort_order")
    Integer sortOrder;

    @Column(name = "is_active")
    Boolean isActive;

    @Column(name = "created_at")
    Date createdAt;

    @Column(name = "updated_at")
    Date updatedAt;

    @ManyToOne
    @JoinColumn(name = "section_id", nullable = false)
    private SectionsEntity section;

    @ManyToOne
    @JoinColumn(name = "assignmentId")
    private AssignmentsEntity assignments;

    @OneToMany(mappedBy = "lesson", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DiscussionsEntity> discussions;

}
