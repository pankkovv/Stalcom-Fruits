package com.stalcom.fruits.warehouse.service;

import com.stalcom.fruits.warehouse.model.Warehouse;

import java.util.Optional;

public interface WarehouseService {
    Optional<Warehouse> warehouseGetById(long idWare);
}
