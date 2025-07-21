package com.study.online_learning_platform.api.courses;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.online_learning_platform.api.courses.dto.CourseDTO;
import com.study.online_learning_platform.api.courses.service.ICourseService;
import com.study.online_learning_platform.ultils.ResponseDTO;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private ICourseService courseService;

    @GetMapping("/all")
    public List<CourseDTO> getCourses() {
        List<CourseDTO> courses = courseService.findAll();
        return courses;
    }

    @GetMapping("/")
    public CourseDTO getCourseById(@RequestParam Integer id) {
        return courseService.findById(id);
    }

    @PutMapping("/update/")
    public ResponseEntity<ResponseDTO> post(@RequestParam Integer id, @RequestBody CourseDTO courseDTO) {
        return courseService.updateById(id, courseDTO);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> create(@RequestBody CourseDTO courseDTO) {
        return courseService.create(courseDTO);
    }

    @DeleteMapping("/delete/")
    public ResponseEntity<ResponseDTO> deleteUser(@RequestParam Integer id) {
        return courseService.deleteById(id);
    }

}
