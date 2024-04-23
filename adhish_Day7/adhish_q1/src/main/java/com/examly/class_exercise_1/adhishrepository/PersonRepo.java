package com.examly.class_exercise_1.adhishrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.class_exercise_1.adhishmodel.adhishPerson;

/**
 * PersonRepo
 */
@Repository
public interface PersonRepo extends JpaRepository<adhishPerson, Integer> {

     List<adhishPerson> findByAge(int byAge);
}