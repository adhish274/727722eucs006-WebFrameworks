package com.example.day5cw2.adhishservice;

import org.springframework.stereotype.Service;

import com.example.day5cw2.adhishmodel.adhishEmployee;
import com.example.day5cw2.adhishrepository.adhishEmployeeRepo;

@Service
public class adhishEmployeeService {
    public adhishEmployeeRepo employeeRepo;
    public adhishEmployeeService(adhishEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(adhishEmployee employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,adhishEmployee employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public adhishEmployee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
