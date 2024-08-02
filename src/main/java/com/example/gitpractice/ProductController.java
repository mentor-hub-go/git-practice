package com.example.gitpractice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping(value = "/product")
    public ResponseEntity<String> getProductList(){
        return ResponseEntity.ok("product list");
    }

    @GetMapping(value = "/product/{id}")
    public ResponseEntity<String> getProduct(){
        return ResponseEntity.ok("product");
    }

    @DeleteMapping(value = "/product/{id}")
    public ResponseEntity<String> deleteProduct(){
        return ResponseEntity.ok("delete product");
    }
}
