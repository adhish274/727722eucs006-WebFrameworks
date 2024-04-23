package com.examly.springapp.adhishservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.adhishrepository.adhishDoorRepo;
import com.examly.springapp.model.Door;

@Service
public class adhishDoorService {
    @Autowired
    private adhishDoorRepo doorRepo;

    public adhishDoor postData(adhishDoor door) {
        return doorRepo.save(door);
    }

    public List<adhishDoor> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public adhishDoor updateDetail(int doorid, adhishDoor door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<adhishDoor> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<adhishDoor> getAllDetails() {

        return doorRepo.findAll();
    }

    public adhishDoor getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}