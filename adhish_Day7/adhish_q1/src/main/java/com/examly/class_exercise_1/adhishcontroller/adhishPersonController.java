package com.examly.class_exercise_1.adhishcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_1.adhishmodel.adhishPerson;
import com.examly.class_exercise_1.adhishservice.adhishPersonService;

@RestController
public class adhishPersonController {

     @Autowired
     public adhishPersonService personService;

     @PostMapping("/api/person")
     public ResponseEntity<adhishPerson> postMethodName(@RequestBody adhishPerson entity) {

          adhishPerson inst = personService.SaveEntity(entity);

          return new ResponseEntity<adhishPerson>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<adhishPerson>> getMethodName() {

          List<adhishPerson> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<adhishPerson>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<adhishPerson>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<adhishPerson> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}