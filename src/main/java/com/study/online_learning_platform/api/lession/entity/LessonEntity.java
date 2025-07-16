package com.study.online_learning_platform.api.lession.entity;


import com.study.online_learning_platform.api.course.entity.CourseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "LESSON")
public class LessonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer lessonId;

    @Column(name = "lesson_name")
    private String lessonName;

    @Column(name = "description")
    private String lessonDescription;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "courseId")
    private CourseEntity course; // Assuming a lesson belongs to a course

    @Column(name = "video_url")
    private String videoUrl;



}
