package com.example.springapp.adhishrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.adhishmodel.adhishDoor;

import java.util.List;

@Repository
public interface adhishDoorRepo extends JpaRepository<adhishDoor,Integer>{

    List<adhishDoor> findByDoorId(int doorId);
    List<adhishDoor> findByAccessType(String accessType);
    
}
