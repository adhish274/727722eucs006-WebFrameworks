package com.examly.class_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_2.model.adhishCourse;
import com.examly.class_exercise_2.service.adhishCourseService;

@RestController
public class adhishCourseController {

     @Autowired
     public adhishCourseService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<adhishCourse> postMethodName(@RequestBody adhishCourse entity) {

          adhishCourse inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<adhishCourse>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<adhishCourse>> getMethodName() {

          List<adhishCourse> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<adhishCourse>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<adhishCourse>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<adhishCourse> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}