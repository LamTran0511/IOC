package org.example.ioc.service;

import org.example.ioc.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {
    private final ArrayList<Product> products;

    public ProductService() {
        products = new ArrayList<>();
        Product p1 = new Product(1,"Peppsi",15000);
        Product p2 = new Product(2,"Coca cola",13000);
        Product p3 = new Product(3,"7Up",10000);
        products.add(p1);
        products.add(p2);
        products.add(p3);
    }

    public ArrayList<Product> getAllProducts() {
        return products;
    }
}
