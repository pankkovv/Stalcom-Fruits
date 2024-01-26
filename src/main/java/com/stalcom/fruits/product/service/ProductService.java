package com.stalcom.fruits.product.service;

import com.stalcom.fruits.product.dto.ProductShipmentDto;
import com.stalcom.fruits.product.dto.StatsProductDto;
import com.stalcom.fruits.product.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> create(ProductShipmentDto productShipmentDto, List<Product> products);

    List<StatsProductDto> stats(String start, String end);
}
