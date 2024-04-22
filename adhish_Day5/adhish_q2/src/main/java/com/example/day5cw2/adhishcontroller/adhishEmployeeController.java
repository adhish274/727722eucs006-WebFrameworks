package com.example.day5cw2.adhishcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day5cw2.adhishmodel.adhishEmployee;
import com.example.day5cw2.adhishservice.adhishEmployeeService;

@RestController
public class adhishEmployeeController {
    public adhishEmployeeService employeeService;
    public adhishEmployeeController( adhishEmployeeService employeeService)
    {
        this.employeeService=employeeService;
    }
    @PostMapping("/api/employee")
    public ResponseEntity<adhishEmployee> postMethodName(@RequestBody adhishEmployee employee) {
        if(employeeService.saveEmployee(employee) == true)
        {
            return new ResponseEntity<>(employee,HttpStatus.CREATED);
        }
        
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PutMapping("/api/employee/{employeeId}")
    public ResponseEntity<adhishEmployee> putMethodName(@PathVariable("employeeId") int id, @RequestBody adhishEmployee employee) {
        if(employeeService.updateDetails(id,employee) == true)
        {
            return new ResponseEntity<>(employee,HttpStatus.OK);
        }
        
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
    
    @DeleteMapping("/api/employee/{employeeId}")
    public ResponseEntity<adhishEmployee> delete(@PathVariable("employeeId") int id,@RequestBody adhishEmployee employee)
    {
        if(employeeService.deleteEmployee(id) == true)
        {
            return new ResponseEntity<>(employee,HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
}
