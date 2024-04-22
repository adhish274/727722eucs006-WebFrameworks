package com.example.day5cw1.adhish_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw1.adhish_model.adhishProduct;

@Repository
public interface adhishProductRepo extends JpaRepository<adhishProduct,Integer>{
    
}
