package com.example.q4.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class AdressController {
    @GetMapping("/address")
    public Address addressobject(){
        Address obj = new Address();
        obj.setName("Adhish S R");
        obj.setDoorNo(282);
        obj.setStreetName("4th Main Street");
        obj.setPincode(625020);
        obj.setArea("AnnaNagar");
        obj.setDistrict("Madurai");
        obj.setState("TamilNadu");
        obj.setCountry("India");
        return obj;


    }
}
