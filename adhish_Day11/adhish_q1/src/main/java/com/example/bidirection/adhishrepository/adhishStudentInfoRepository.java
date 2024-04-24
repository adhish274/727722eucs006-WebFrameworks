package com.example.bidirection.adhishrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.adhishmodel.adhishStudentInfo;

@Repository
public interface adhishStudentInfoRepository extends JpaRepository<adhishStudentInfo,Integer>{
    
}