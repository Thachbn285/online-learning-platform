package com.study.online_learning_platform.api.lession.service;

import com.study.online_learning_platform.api.lession.repository.ILessonRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class LessonService {
    ILessonRepository lessonRepository;
}
