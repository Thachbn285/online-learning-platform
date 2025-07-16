package com.study.online_learning_platform.api.course;

import com.study.online_learning_platform.api.course.service.ICourseService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CourseController {
    ICourseService courseService;



}
