package com.study.online_learning_platform.api.categories.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.online_learning_platform.api.categories.entity.CategoryEntity;

public interface ICategoriesRepository extends JpaRepository<CategoryEntity, Integer> {
    // Additional query methods can be defined here if needed

}
