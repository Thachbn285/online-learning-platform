package com.study.online_learning_platform.api.course;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.study.online_learning_platform.api.course.dto.CourseDTO;
import com.study.online_learning_platform.api.course.service.ICourseService;
import com.study.online_learning_platform.ultils.ResponseDTO;

@RestController
public class CourseController {
    @Autowired
    private ICourseService courseService;

    @GetMapping("/course/all")
    public List<CourseDTO> getCourses() {
        return courseService.findAll();
    }

    @GetMapping("/course/")
    public CourseDTO getCourseById(@RequestParam Integer id) {
        return courseService.findById(id);
    }

    @PutMapping("/course/update/")
    public ResponseEntity<ResponseDTO> post(@RequestParam Integer id, @RequestBody CourseDTO courseDTO) {
        return courseService.updateById(id, courseDTO);
    }

    @PostMapping("/course/create")
    public ResponseEntity<ResponseDTO> create(@RequestBody CourseDTO courseDTO) {
        return courseService.create(courseDTO);
    }

    @DeleteMapping("/course/delete/")
    public ResponseEntity<ResponseDTO> deleteUser(@RequestParam Integer id) {
        return courseService.deleteById(id);
    }

}
