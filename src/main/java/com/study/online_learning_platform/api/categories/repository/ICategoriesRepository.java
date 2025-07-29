package com.study.online_learning_platform.api.categories.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.online_learning_platform.api.categories.entity.CategoriesEntity;

public interface ICategoriesRepository extends JpaRepository<CategoriesEntity, Integer> {
    // Additional query methods can be defined here if needed

}
