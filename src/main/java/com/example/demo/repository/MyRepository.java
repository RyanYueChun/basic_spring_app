package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.MyEntity;

@Repository
public interface MyRepository extends JpaRepository<MyEntity, Long> {
    // Custom query methods if needed
}
