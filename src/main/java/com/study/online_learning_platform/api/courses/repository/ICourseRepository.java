package com.study.online_learning_platform.api.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.online_learning_platform.api.courses.entity.CourseEntity;

public interface ICourseRepository extends JpaRepository<CourseEntity, Integer> {
}
