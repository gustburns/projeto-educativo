package com.educarweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educarweb.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
