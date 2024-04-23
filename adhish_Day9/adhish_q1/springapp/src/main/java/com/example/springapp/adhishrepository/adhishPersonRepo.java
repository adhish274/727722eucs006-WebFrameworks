package com.example.springapp.adhishrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springapp.model.Person;

public interface adhishPersonRepo extends JpaRepository<adhishPerson, Integer> {
    @Query("SELECT p FROM Person p WHERE age=?1")
    List<adhishPerson> findByAge(int age);
}
