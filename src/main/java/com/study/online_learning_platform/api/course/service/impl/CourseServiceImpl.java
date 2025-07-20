package com.study.online_learning_platform.api.course.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.study.online_learning_platform.api.course.dto.CourseDTO;
import com.study.online_learning_platform.api.course.entity.CourseEntity;
import com.study.online_learning_platform.api.course.repository.ICourseRepository;
import com.study.online_learning_platform.api.course.service.ICourseService;
import com.study.online_learning_platform.ultils.ResponseDTO;

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
        List<CourseDTO> courseDTOs = courseEntities.stream()
                .map(courseEntity -> modelMapper.map(courseEntity, CourseDTO.class))
                .toList();
        return courseDTOs;
    }

    @Override
    public CourseDTO findById(Integer id) {
        CourseEntity courseEntity = courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found with id: " + id));
        return modelMapper.map(courseEntity, CourseDTO.class);
    }

    @Override
    public ResponseEntity<ResponseDTO> create(CourseDTO courseDTO) {
        ResponseDTO responseDTO = new ResponseDTO();
        List<String> details = new ArrayList<>();
        if (courseDTO.getId() != null && courseRepository.existsById(courseDTO.getId())) {
            responseDTO.setMessage("CREATE FAIL");
            details.add("Khóa học đã tồn tại với id: " + courseDTO.getId());
            responseDTO.setDetails(details);
            return ResponseEntity.badRequest().body(responseDTO);
        }
        try {
            CourseEntity courseEntity = modelMapper.map(courseDTO, CourseEntity.class);
            CourseEntity savedEntity = courseRepository.save(courseEntity);
            responseDTO.setMessage("SUCCESS");
            details.add("Đã thêm thành công khóa học mới với id: " + savedEntity.getId());
            responseDTO.setDetails(details);
            return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
        } catch (Exception e) {
            responseDTO.setMessage("CREATE FAIL");
            details.add("Lỗi khi thêm khóa học: " + e.getMessage());
            responseDTO.setDetails(details);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseDTO);
        }
    }

    @Override
    public ResponseEntity<ResponseDTO> updateById(Integer id, CourseDTO courseDTO) {
        CourseEntity courseEntity = courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found with id: " + id));

        // Map DTO sang entity mới và giữ nguyên ID
        CourseEntity updatedEntity = modelMapper.map(courseDTO, CourseEntity.class);
        updatedEntity.setId(id);

        courseRepository.save(updatedEntity);

        ResponseDTO responseDTO = new ResponseDTO();
        List<String> details = new ArrayList<>();
        responseDTO.setMessage("UPDATE SUCCESS");
        details.add("Cập nhật thành công khóa học với id: " + id);
        responseDTO.setDetails(details);
        return ResponseEntity.ok(responseDTO);
    }

    @Override
    public ResponseEntity<ResponseDTO> deleteById(Integer id) {
        CourseEntity courseEntity = courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found id: " + id));
        courseRepository.deleteById(id);
        ResponseDTO responseDTO = new ResponseDTO();
        List<String> details = new ArrayList<>();
        responseDTO.setMessage("DELETE SUCCESS");
        details.add("Đã xóa khóa học với id: " + id);
        responseDTO.setDetails(details);
        return ResponseEntity.ok(responseDTO);
    }

}
