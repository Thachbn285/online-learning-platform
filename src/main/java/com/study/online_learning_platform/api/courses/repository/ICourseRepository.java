package com.study.online_learning_platform.api.courses.repository;

import com.study.online_learning_platform.api.courses.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepository extends JpaRepository<CourseEntity, Integer> {
}
