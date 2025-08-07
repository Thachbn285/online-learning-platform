package com.study.online_learning_platform.api.categories.entity;

import java.sql.Timestamp;
import java.util.List;

import com.study.online_learning_platform.api.courses.entity.CourseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@Getter
@Setter
@Table(name = "categories")
public class CategoriesEntity {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    Integer category_id;

    @Column(name = "name")
    String name;

    @Column(name = "description")
    String description;

    @Column(name = "slug")
    String slug;

    @Column(name = "icon_url")
    String iconUrl;

    @Column(name = "sort_order")
    Integer sortOrder;

    @Column(name = "is_active")
    Boolean isActive;

    @Column(name = "created_at")
    Timestamp createdAt;

    @OneToMany(mappedBy = "categoriesEntity")
    List<CourseEntity > courseEntities;
}
