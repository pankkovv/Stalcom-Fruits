package com.stalcom.fruits.product.controller;

import com.stalcom.fruits.product.dto.ShipmentDto;
import com.stalcom.fruits.product.mapper.ShipmentMapper;
import com.stalcom.fruits.product.model.Product;
import com.stalcom.fruits.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/shipment")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    private final ShipmentMapper shipmentMapper;

    @PostMapping(path = "/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createShipment(@RequestBody @Valid ShipmentDto shipmentDto){
        List<Product> listProduct = shipmentMapper.listProductDtoToListProduct(shipmentDto.getProductDtoList());
        productService.create(shipmentDto.getSupplier(), shipmentDto.getWarehouse(), listProduct);
    }

    @GetMapping(path = "/stats")
    @ResponseStatus(HttpStatus.OK)
    public void statsShipment(@RequestBody @Valid ShipmentDto shipmentDto){
        List<Product> listProduct = shipmentMapper.listProductDtoToListProduct(shipmentDto.getProductDtoList());
        productService.create(shipmentDto.getSupplier(), shipmentDto.getWarehouse(), listProduct);
    }
}
