package com.study.online_learning_platform.api.course.repository;

import com.study.online_learning_platform.api.course.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepository extends JpaRepository<CourseEntity, Integer> {
}
