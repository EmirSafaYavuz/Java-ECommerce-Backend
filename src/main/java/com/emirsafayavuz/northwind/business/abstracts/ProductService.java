package com.emirsafayavuz.northwind.business.abstracts;

import com.emirsafayavuz.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
