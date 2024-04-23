package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.springapp.model.adhishVillage;
import com.example.springapp.service.adhishVillageService;

@RestController
public class adhishVillageController {
    @Autowired
    private adhishVillageService ser;

    @PostMapping("/api/village")
    public ResponseEntity<adhishVillage> post(@RequestBody adhishVillage person) {
        if (ser.post(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/village/byname/{villageName}")
    public ResponseEntity<adhishVillage> getAll(@PathVariable String villageName) {
        adhishVillage li = ser.start(villageName);
        if (li!=null) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/village/bypopulation/{villagePopulation}")
    public ResponseEntity<List<adhishVillage>> getbyAge(@PathVariable int villagePopulation) {
        List<adhishVillage> li = ser.end(villagePopulation);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/village/{villageId}")
    public ResponseEntity<adhishVillage> get3(@PathVariable int villageId) {
        adhishVillage li = ser.get3(villageId);
        if (li!=null) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
