package com.study.online_learning_platform.api.sections.entity;

import java.sql.Date;
import java.util.List;

import com.study.online_learning_platform.api.courses.entity.CourseEntity;

import com.study.online_learning_platform.api.lesson.entity.LessonEntity;
import jakarta.persistence.*;
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
@Table(name = "sections")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SectionsEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    Integer section_id;

    @Column(name = "title")
    String title;

    @Column(name = "description")
    String description;

    @Column(name = "sort_order")
    Integer sortOrder;

    @Column(name = "is_active")
    Boolean isActive;

    @Column(name = "created_at")
    Date createdAt;

    @ManyToOne
    @JoinColumn(name = "course_id")
    CourseEntity courseEntity;
    
    @OneToMany(mappedBy = "sectionsEntity")
    List<LessonEntity> lessonEntities;
    
}
