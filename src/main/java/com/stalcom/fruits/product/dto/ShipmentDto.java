package com.stalcom.fruits.product.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class ShipmentDto {
    @NotNull
    private long supplier;
    @NotNull
    private long warehouse;
    @NotNull
    private LocalDate timeDelivery;
    @NotNull
    private List<ProductDto> productDtoList;
}
