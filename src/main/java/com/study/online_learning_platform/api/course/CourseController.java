package com.study.online_learning_platform.api.course;

import com.study.online_learning_platform.api.course.dto.CourseDTO;
import com.study.online_learning_platform.api.course.service.ICourseService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    ICourseService courseService;

    @GetMapping("/all")
    public List<CourseDTO> getAllCourses() {
        return courseService.findAll();
    }

    @GetMapping("/{id}")
    public CourseDTO getCourseById(@RequestParam Integer id) {
        return courseService.findById(id);
    }
}
