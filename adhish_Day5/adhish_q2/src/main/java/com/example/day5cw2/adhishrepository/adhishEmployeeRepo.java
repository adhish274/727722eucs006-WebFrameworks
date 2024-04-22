package com.example.day5cw2.adhishrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw2.adhishmodel.adhishEmployee;


@Repository
public interface adhishEmployeeRepo extends JpaRepository<adhishEmployee,Integer>{
    
}
