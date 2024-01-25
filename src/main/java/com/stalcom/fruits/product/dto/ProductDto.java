package com.stalcom.fruits.product.dto;

import com.stalcom.fruits.product.model.Sort;
import com.stalcom.fruits.product.model.Type;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Builder
public class ProductDto {
    @NotBlank
    private Type type;
    @NotBlank
    private Sort sort;
    @NotNull
    private int count;
    @NotNull
    private float price;
}
