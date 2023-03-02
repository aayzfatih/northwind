package com.example.demo.dataAccess.abstarcts;

import com.example.demo.entities.concrete.Product;
import com.example.demo.entities.dtos.ProductWithCategoryDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer> {
    Product getByProductName(String productName);

    Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);

    List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);

    List<Product> getByCategory_CategoryIdIn(List<Integer> categories);

    List<Product> getByProductNameContains(String productName);

    List<Product> getByProductNameStartsWith(String productName);

    @Query("From Product where productName=:productName and category.categoryId=:categoryId")
    List<Product> getByNameAndCategory_Category(String productName, int categoryId);
    @Query("Select new  com.example.demo.entities.dtos.ProductWithCategoryDto" +
            "(p.id,p.productName,c.categoryName)" +
            " From Category c Inner Join c.products p ")
    List <ProductWithCategoryDto>getProductWithCategoryDetails();

    //select p.productId,p.productName,c.categoryName from Category c inner join Product p
    //on c.categoryId= p.categoryId
}
