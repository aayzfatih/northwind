package com.example.demo.busieness.abstracts;

import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.entities.concrete.Product;

import java.util.List;

public interface ProductService {
   DataResult<List<Product>>getAll();
   Result add(Product product);

}
