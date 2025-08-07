package com.study.online_learning_platform.api.courses.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.online_learning_platform.api.courses.dto.CourseDTO;
import com.study.online_learning_platform.api.courses.entity.CourseEntity;
import com.study.online_learning_platform.api.courses.repository.ICourseRepository;
import com.study.online_learning_platform.api.courses.service.ICourseService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements ICourseService {

    @Autowired
    private ICourseRepository courseRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<CourseDTO> findAll() {
        List<CourseEntity> courseEntities = courseRepository.findAll();
        return courseEntities.stream()
                .map(entity -> modelMapper.map(entity, CourseDTO.class))
                .toList();
    }

    @Override
    public CourseDTO findById(Integer id) {
        CourseEntity courseEntity = courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        return modelMapper.map(courseEntity, CourseDTO.class);
    }

    @Override
    public void create(CourseDTO courseDTO) {
        CourseEntity courseEntity = modelMapper.map(courseDTO, CourseEntity.class);
        courseEntity.setCourse_id(null);
        courseRepository.save(courseEntity);
    }

    @Override
    public void updateById(Integer id, CourseDTO courseDTO) {
        CourseEntity courseEntity = courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found with id: " + id));
        CourseEntity newCourseEntity = modelMapper.map(courseDTO, CourseEntity.class);
        courseRepository.save(newCourseEntity);
    }

    @Override
    public void deleteById(Integer id) {
        CourseEntity courseEntity = courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found with id: " + id));
        courseRepository.delete(courseEntity);
    }
}
