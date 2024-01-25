package com.stalcom.fruits.product.service;

import com.stalcom.fruits.product.model.Product;

import java.util.List;

public interface ProductService {
    void create(long idSup, long idWare, List<Product> products);
}
