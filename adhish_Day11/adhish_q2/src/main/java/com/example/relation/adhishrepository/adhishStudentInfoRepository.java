package com.example.relation.adhishrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.adhishmodel.adhishStudentInfo;

@Repository
public interface adhishStudentInfoRepository extends JpaRepository<adhishStudentInfo,Integer>{
    
}