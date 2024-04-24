package com.example.bidirection.adhishservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.adhishmodel.adhishStudent;
import com.example.bidirection.adhishmodel.adhishStudentInfo;
import com.example.bidirection.adhishrepository.adhishStudentInfoRepository;
import com.example.bidirection.adhishrepository.adhishStudentRepository;

@Service
public class adhishStudentService {
    public adhishStudentRepository studentRepository;
    public adhishStudentInfoRepository studentInfoRepository;
    public adhishStudentService(adhishStudentRepository studentRepository,adhishStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public adhishStudent saveStudent(adhishStudent student)
    {
        return studentRepository.save(student);
    }
    public adhishStudentInfo saveStudentInfo(adhishStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<adhishStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
