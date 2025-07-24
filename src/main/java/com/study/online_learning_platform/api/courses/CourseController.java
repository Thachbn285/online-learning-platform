package com.study.online_learning_platform.api.courses;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.online_learning_platform.api.courses.dto.CourseDTO;
import com.study.online_learning_platform.api.courses.service.ICourseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private ICourseService courseService;

    @GetMapping("/all")
    public List<CourseDTO> getCourses() {
        return courseService.findAll();
    }

    @GetMapping("")
    public CourseDTO getCourseById(@RequestParam Integer id) {
        return courseService.findById(id);
    }

    @PutMapping("/update")
    public void update(@RequestParam Integer id,@RequestBody CourseDTO courseDTO) {
        courseService.updateById(id,courseDTO);
    }

    @PostMapping("/create")
    public void Insert(@RequestBody CourseDTO courseDTO) {
        courseService.create(courseDTO);
    }

    @DeleteMapping("/delete")
    public void deleteCourse(@RequestParam Integer id) {
        courseService.deleteById(id);
    }

}
