package com.examly.class_exercise_1.adhishservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.class_exercise_1.adhishmodel.adhishPerson;
import com.examly.class_exercise_1.adhishrepository.PersonRepo;

@Service
public class adhishPersonService {

     @Autowired
     public PersonRepo personRepo;

     public adhishPerson SaveEntity(adhishPerson entity) {
          return personRepo.save(entity);

     }

     public List<adhishPerson> getDetails() {
          return personRepo.findAll();

     }

     public List<adhishPerson> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}
