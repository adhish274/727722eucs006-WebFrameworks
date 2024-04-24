package com.example.bidirection.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.adhishmodel.adhishStudent;
import com.example.bidirection.adhishmodel.adhishStudentInfo;
import com.example.bidirection.adhishservice.adhishStudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class adhishStudentController {
    public adhishStudentService studentService;
    public adhishStudentController(adhishStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public adhishStudent postMethodName(@RequestBody adhishStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public adhishStudentInfo postMethodName(@RequestBody adhishStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<adhishStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}