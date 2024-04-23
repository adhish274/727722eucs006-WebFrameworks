package com.example.springapp.adhishservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.adhishmodel.adhishDoor;
import com.example.springapp.adhishrepository.adhishDoorRepo;

@Service
public class adhishDoorService {
    @Autowired
    private adhishDoorRepo rep;

    public boolean post(adhishDoor door)
    {
        try
        {
            rep.save(door);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<adhishDoor> getAll()
    {
        return rep.findAll();
    }

    public List<adhishDoor> getbyDoorId(int doorId)
    {
        return rep.findByDoorId(doorId);
    }
    public List<adhishDoor> getbyType(String type)
    {
        return rep.findByAccessType(type);
    }
    
}
