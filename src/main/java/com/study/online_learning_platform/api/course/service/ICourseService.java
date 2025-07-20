package com.study.online_learning_platform.api.course.service;

import com.study.online_learning_platform.api.course.dto.CourseDTO;
import com.study.online_learning_platform.ultils.ResponseDTO;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface ICourseService {
    List<CourseDTO> findAll();

    CourseDTO findById(Integer id);

    ResponseEntity<ResponseDTO> create(CourseDTO courseDTO);

    ResponseEntity<ResponseDTO> updateById(Integer id, CourseDTO courseDTO);

    ResponseEntity<ResponseDTO> deleteById(Integer id);
}
