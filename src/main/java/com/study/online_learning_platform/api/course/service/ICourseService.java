package com.study.online_learning_platform.api.course.service;

import com.study.online_learning_platform.api.course.dto.CourseDTO;
import com.study.online_learning_platform.api.course.entity.CourseEntity;
import com.study.online_learning_platform.api.user.dto.UserDTO;

import java.util.List;

public interface ICourseService {
    List<CourseDTO> findAll();

    CourseDTO findById(Integer id);

    String save(CourseDTO courseDTO);

    String update(CourseDTO courseDTO);

    void deleteById(Integer id);
}
