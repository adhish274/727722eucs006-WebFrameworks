package com.example.q1.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ApiController {
    @GetMapping("/first")
    public String welcome() {
        return "Welcome Springboot";
    }
    

}
