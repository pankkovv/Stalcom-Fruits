package com.stalcom.fruits.product.service;

import com.stalcom.fruits.product.model.Product;
import com.stalcom.fruits.product.repository.ProductRepository;
import com.stalcom.fruits.supplier.service.SupplierService;
import com.stalcom.fruits.warehouse.service.WarehouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;
    private final WarehouseService warehouseService;
    private final SupplierService supplierService;
    @Override
    public void create(long idSup, long idWare, List<Product> products) {
        supplierService.checkIfExistBySupplier(idSup);
        warehouseService.checkIfExistByWarehouse(idWare);
        productRepository.saveAll(products);
    }
}
