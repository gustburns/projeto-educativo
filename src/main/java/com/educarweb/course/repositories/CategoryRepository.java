package com.educarweb.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.educarweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
