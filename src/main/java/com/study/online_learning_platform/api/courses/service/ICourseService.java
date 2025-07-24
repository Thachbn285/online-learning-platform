package com.study.online_learning_platform.api.courses.service;

import com.study.online_learning_platform.api.courses.dto.CourseDTO;
import com.study.online_learning_platform.api.user.dto.UserDTO;

import java.util.List;


public interface ICourseService {
    List<CourseDTO> findAll();

    CourseDTO findById(Integer id);

    void create(CourseDTO courseDTO);

    void updateById(Integer id, CourseDTO courseDTO);

    void deleteById(Integer id);
}
