package com.stalcom.fruits.product.dto;

import com.stalcom.fruits.product.model.Sort;
import com.stalcom.fruits.product.model.Type;
import com.stalcom.fruits.supplier.model.Supplier;
import com.stalcom.fruits.warehouse.model.Warehouse;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class ProductResponseDto {
    private long id;
    private Type type;
    private Sort sort;
    private int count;
    private float price;
    private LocalDate timeDelivery;
    private Warehouse warehouse;
    private Supplier supplier;
}
