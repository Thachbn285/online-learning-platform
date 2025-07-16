package com.study.online_learning_platform.api.lession.repository;

import com.study.online_learning_platform.api.lession.entity.LessonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILessonRepository extends JpaRepository<LessonEntity, Integer> {
}
