package com.study.online_learning_platform.api.courses;

import java.util.ArrayList;
import java.util.List;

import com.study.online_learning_platform.ultils.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/courses")
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
    public void update(@RequestParam Integer id, @RequestBody CourseDTO courseDTO) {
        courseService.updateById(id, courseDTO);
    }

    @PostMapping("/create")
    public ResponseDTO Insert(@RequestBody CourseDTO courseDTO) {

        courseService.create(courseDTO);
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setMessage("Course Created");
        String detail = "Da them thanh cong";
        List<String> details = new ArrayList<>();
        details.add(detail);
        responseDTO.setDetails(details);
        return responseDTO;
    }

    @DeleteMapping("/delete")
    public ResponseDTO deleteCourse(@RequestParam Integer id) {
        courseService.deleteById(id);
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setMessage("Course Deleted");
        String detail = "Da xoa thanh cong";
        List<String> details = new ArrayList<>();
        details.add(detail);
        responseDTO.setDetails(details);
        return  responseDTO;
    }

}
