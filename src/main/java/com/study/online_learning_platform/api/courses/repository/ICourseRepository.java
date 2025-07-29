package com.study.online_learning_platform.api.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.online_learning_platform.api.courses.entity.CourseEntity;
import com.study.online_learning_platform.constant.SystemConstant;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;

public interface ICourseRepository extends JpaRepository<CourseEntity, Integer> {
}
