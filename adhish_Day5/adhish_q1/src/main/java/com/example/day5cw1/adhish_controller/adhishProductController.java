package com.example.day5cw1.adhish_controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.day5cw1.adhish_model.adhishProduct;
import com.example.day5cw1.adhish_service.adhishProductService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class adhishProductController {
    public adhishProductService productService;
    public adhishProductController(adhishProductService productService)
    {
        this.productService = productService;
    }
    @PostMapping("/api/product")
    public ResponseEntity<adhishProduct> postMethodName(@RequestBody adhishProduct product) {
        if(productService.saveProduct(product) == true)
        {
            return new ResponseEntity<>(product,HttpStatus.CREATED);
        }
        
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PutMapping("/api/product/{productId}")
    public ResponseEntity<adhishProduct> putMethodName(@PathVariable("productId") int id, @RequestBody adhishProduct product) {
        if(productService.updateDetails(id,product) == true)
        {
            return new ResponseEntity<>(product,HttpStatus.OK);
        }
        
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
    
    @DeleteMapping("api/product/{productId}")
    public ResponseEntity<adhishProduct> delete(@PathVariable("productId") int id,@RequestBody adhishProduct product)
    {
        if(productService.deleteProduct(id) == true)
        {
            return new ResponseEntity<>(product,HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
}
