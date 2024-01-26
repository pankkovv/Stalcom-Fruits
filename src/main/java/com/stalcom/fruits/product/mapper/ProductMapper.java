package com.stalcom.fruits.product.mapper;

import com.stalcom.fruits.product.dto.ProductDto;
import com.stalcom.fruits.product.dto.ProductResponseDto;
import com.stalcom.fruits.product.model.Product;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ProductMapper {
    List<Product> listProductDtoToListProduct(List<ProductDto> productDtoList);

    List<ProductResponseDto> listProductToListProductResponseDto(List<Product> productList);
}
