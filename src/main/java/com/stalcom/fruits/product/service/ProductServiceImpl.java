package com.stalcom.fruits.product.service;

import com.stalcom.fruits.product.dto.ProductShipmentDto;
import com.stalcom.fruits.product.dto.StatsProductDto;
import com.stalcom.fruits.product.model.Product;
import com.stalcom.fruits.product.repository.ProductRepository;
import com.stalcom.fruits.supplier.model.Supplier;
import com.stalcom.fruits.supplier.service.SupplierService;
import com.stalcom.fruits.warehouse.model.Warehouse;
import com.stalcom.fruits.warehouse.service.WarehouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final WarehouseService warehouseService;
    private final SupplierService supplierService;

    @Override
    public List<Product> create(ProductShipmentDto productShipmentDto, List<Product> products) {
        Supplier supplier = supplierService.supplierGetById(productShipmentDto.getSupplier()).get();
        Warehouse warehouse = warehouseService.warehouseGetById(productShipmentDto.getWarehouse()).get();

        for (Product product : products) {
            product.setSupplier(supplier);
            product.setWarehouse(warehouse);
            product.setTimeDelivery(productShipmentDto.getTimeDelivery());
        }

        return productRepository.saveAll(products);
    }

    @Override
    public List<StatsProductDto> stats(String start, String end) {
        LocalDate startTime = LocalDate.parse(start);
        LocalDate endTime = LocalDate.parse(end);
        return productRepository.getStats(startTime, endTime);
    }
}
