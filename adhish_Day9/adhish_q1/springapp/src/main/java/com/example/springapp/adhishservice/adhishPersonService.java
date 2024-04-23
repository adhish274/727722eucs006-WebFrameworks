package com.example.springapp.adhishservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.adhishrepository.adhishPersonRepo;
import com.example.springapp.model.Person;

@Service
public class adhishPersonService {
    public adhishPersonRepo personRepo;

    public adhishPersonService(adhishPersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(adhishPerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<adhishPerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
