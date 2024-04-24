package com.example.relation.adhishrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.adhishmodel.adhishStudent;

@Repository
public interface adhishStudentRepository extends JpaRepository<adhishStudent,Integer>{
    
}
