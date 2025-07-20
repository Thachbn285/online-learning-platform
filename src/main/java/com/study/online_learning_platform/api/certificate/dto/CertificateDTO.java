package com.study.online_learning_platform.api.certificate.dto;

import java.sql.Date;

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
public class CertificateDTO {
    Integer id;
    Integer userId;
    Integer courseId;
    Date issueAt;
    String certificateUrl;
}
