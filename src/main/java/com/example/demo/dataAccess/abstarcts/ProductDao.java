package com.example.demo.dataAccess.abstarcts;

import com.example.demo.entities.concrete.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {

}
