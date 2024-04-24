package com.example.relation.adhishservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relation.adhishmodel.adhishStudent;
import com.example.relation.adhishrepository.adhishStudentRepository;

@Service
public class StudentService {
    public adhishStudentRepository studentRepository;
    public StudentService(adhishStudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public adhishStudent saveStudent(adhishStudent student)
    {
        return studentRepository.save(student);
    }
    public List<adhishStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
