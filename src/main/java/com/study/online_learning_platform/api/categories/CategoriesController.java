package com.study.online_learning_platform.api.categories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.study.online_learning_platform.api.categories.service.ICategoriesService;


@RestController
public class CategoriesController {
    @Autowired
    private ICategoriesService categoriesService;

}
