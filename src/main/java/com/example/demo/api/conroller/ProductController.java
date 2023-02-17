package com.example.demo.api.conroller;

import com.example.demo.busieness.abstracts.ProductService;
import com.example.demo.entities.concrete.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getall")
    public List<Product>getAll(){
        return this.productService.getAll();

    }

}