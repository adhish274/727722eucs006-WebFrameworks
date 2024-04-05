package com.example.q2.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ApiController {
    @GetMapping("/studentName")
    public String studentName(@RequestParam(name="id") String studentName) {
        return "Welcome "+studentName+" !";
    }
    

}
