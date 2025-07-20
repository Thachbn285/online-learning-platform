package com.study.online_learning_platform.api.lecture.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class LectureDTO {
    Integer id;
    String title;
    String videoUrl;
    String contentType;
    Integer duration;
    Integer courseContentId;
    Integer isPreview;
}
