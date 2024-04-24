package com.example.bidirection.adhishrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.adhishmodel.adhishStudent;



@Repository
public interface adhishStudentRepository extends JpaRepository<adhishStudent,Integer>{
    
}
