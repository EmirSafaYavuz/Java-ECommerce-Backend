package com.emirsafayavuz.northwind.business.concretes;

import com.emirsafayavuz.northwind.business.abstracts.ProductService;
import com.emirsafayavuz.northwind.dataAccess.abstracts.ProductDao;
import com.emirsafayavuz.northwind.entities.concretes.Product;
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
        return productDao.findAll();
    }
}