package com.study.online_learning_platform.api.course.service;

import com.study.online_learning_platform.api.course.repository.ICourseRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class CourseService {
    private ICourseRepository courseRepository;

}
