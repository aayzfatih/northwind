package com.example.demo.busieness.abstracts;

import com.example.demo.entities.concrete.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
