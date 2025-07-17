package com.study.online_learning_platform.api.course.service.impl;

import com.study.online_learning_platform.api.course.dto.CourseDTO;
import com.study.online_learning_platform.api.course.entity.CourseEntity;
import com.study.online_learning_platform.api.course.repository.ICourseRepository;
import com.study.online_learning_platform.api.course.service.ICourseService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
                .map(courseEntity -> modelMapper.map(courseEntity, CourseDTO.class))
                .toList();


    }

    @Override
    public CourseDTO findById(Integer id) {
        return null;
    }

    @Override
    public String save(CourseDTO courseDTO) {
        return "";
    }

    @Override
    public String update(CourseDTO courseDTO) {
        return "";
    }

    @Override
    public void deleteById(Integer id) {

    }
}
