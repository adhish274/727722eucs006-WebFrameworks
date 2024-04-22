package com.example.day5cw1.adhish_service;

import org.springframework.stereotype.Service;

import com.example.day5cw1.adhish_model.adhishProduct;
import com.example.day5cw1.adhish_repository.adhishProductRepo;

@Service
public class adhishProductService {
    public adhishProductRepo productRepo;
    public adhishProductService(adhishProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(adhishProduct product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,adhishProduct product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public adhishProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
