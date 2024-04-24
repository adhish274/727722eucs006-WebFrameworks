package com.examly.springapp.adhishrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.Door;

// import jakarta.transaction.Transactiona

@Repository
public interface adhishDoorRepo extends JpaRepository<adhishDoor, Integer> {

    @Query(value = "DELETE FROM Door WHERE Door_id = ?1", nativeQuery = true)
    void deleteDoor(int DoorId);

    public List<adhishDoor> findByColor(String color);

    public List<adhishDoor> findByDoorType(String doortype);
}
