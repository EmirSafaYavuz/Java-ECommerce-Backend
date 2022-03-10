package com.emirsafayavuz.northwind.dataAccess.abstracts;

import com.emirsafayavuz.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
