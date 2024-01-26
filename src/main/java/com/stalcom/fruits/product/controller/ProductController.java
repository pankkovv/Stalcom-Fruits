package com.stalcom.fruits.product.controller;

import com.stalcom.fruits.product.dto.ProductResponseDto;
import com.stalcom.fruits.product.dto.ProductShipmentDto;
import com.stalcom.fruits.product.dto.StatsProductDto;
import com.stalcom.fruits.product.mapper.ProductMapper;
import com.stalcom.fruits.product.model.Product;
import com.stalcom.fruits.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    private final ProductMapper productMapper;

    @PostMapping(path = "/shipment")
    @ResponseStatus(HttpStatus.CREATED)
    public List<ProductResponseDto> createNewShipment(@RequestBody @Valid ProductShipmentDto productShipmentDto) {
        List<Product> listProduct = productMapper.listProductDtoToListProduct(productShipmentDto.getProductDtoList());
        return productMapper.listProductToListProductResponseDto(productService.create(productShipmentDto, listProduct));
    }

    @GetMapping(path = "/stats")
    @ResponseStatus(HttpStatus.OK)
    public List<StatsProductDto> statsShipment(@RequestParam(name = "start") String start,
                                               @RequestParam(name = "end") String end) {
        return productService.stats(start, end);

    }
}
