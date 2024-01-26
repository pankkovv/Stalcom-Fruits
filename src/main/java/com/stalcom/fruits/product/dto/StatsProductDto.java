package com.stalcom.fruits.product.dto;

import com.stalcom.fruits.product.model.Sort;
import com.stalcom.fruits.product.model.Type;
import com.stalcom.fruits.supplier.model.Supplier;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
public class StatsProductDto {
    private Supplier supplier;
    private LocalDate timeDelivery;
    private Type type;
    private Sort sort;
    private Long count;
    private Double price;

    public StatsProductDto(Supplier supplier, LocalDate timeDelivery, Type type, Sort sort, Long count, Double price) {
        this.supplier = supplier;
        this.timeDelivery = timeDelivery;
        this.type = type;
        this.sort = sort;
        this.count = count;
        this.price = price;
    }
}
