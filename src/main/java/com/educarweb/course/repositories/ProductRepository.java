package com.educarweb.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.educarweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
