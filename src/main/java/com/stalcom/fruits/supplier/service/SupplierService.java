package com.stalcom.fruits.supplier.service;

import com.stalcom.fruits.supplier.model.Supplier;

import java.util.Optional;

public interface SupplierService {
    Optional<Supplier> supplierGetById(long idSup);
}
