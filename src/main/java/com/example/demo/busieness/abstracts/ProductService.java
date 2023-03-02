package com.example.demo.busieness.abstracts;

import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.entities.concrete.Product;
import com.example.demo.entities.dtos.ProductWithCategoryDto;

import java.util.List;

public interface ProductService {
   DataResult<List<Product>>getAll();
   DataResult<List<Product>>getAllSorted();
   DataResult<List<Product>>getAll(int pageNo,int pageSize);
   Result add(Product product);
   DataResult<Product> getByProductName(String productName);
   DataResult<Product> getByProductNameAndCategory_CategoryId(String productName, int categoryId);
   DataResult<List<Product>>getByProductNameOrCategory_CategoryId(String productName,int categoryId);
   DataResult<List<Product>> getByCategory_CategoryIdIn(List<Integer>categories);
   DataResult<List<Product>> getByProductNameContains(String productName);
   DataResult<List<Product>> getByProductNameStartsWith(String productName);
   List<Product> getByNameAndCategory_Category(String productName, int categoryId);

   DataResult<List<Product>> getByNameAndCategoryId(String productName, int categoryId);
  DataResult< List <ProductWithCategoryDto>>getProductWithCategoryDetails();



}
