package com.study.online_learning_platform.api.course.entity;

import com.study.online_learning_platform.api.lession.entity.LessonEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "USER")
public class CourseEntity {
    @Id
    @GeneratedValue
    private Integer courseId;
    private String courseName;
    private String courseDescription;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<LessonEntity> lessons = new ArrayList<>(); // Assuming a course can have multiple lessons


}
