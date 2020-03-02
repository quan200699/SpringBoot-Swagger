package com.codegym.demo.service;

import com.codegym.demo.model.Category;

import java.util.Optional;

public interface CategoryService{
    Iterable<Category> findAll();

    Optional<Category> findById(Long id);

    Category save(Category model);

    void remove(Long id);
}
