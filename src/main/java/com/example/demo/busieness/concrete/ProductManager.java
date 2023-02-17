package com.example.demo.busieness.concrete;

import com.example.demo.busieness.abstracts.ProductService;
import com.example.demo.dataAccess.abstarcts.ProductDao;
import com.example.demo.entities.concrete.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {
    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}
