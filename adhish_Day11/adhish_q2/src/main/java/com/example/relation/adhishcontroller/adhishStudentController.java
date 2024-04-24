package com.example.relation.adhishcontroller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.adhishmodel.adhishStudent;
import com.example.relation.adhishservice.StudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class adhishStudentController {
    public StudentService studentService;
    public adhishStudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public adhishStudent postMethodName(@RequestBody adhishStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<adhishStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
