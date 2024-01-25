package com.stalcom.fruits.warehouse.service;

import com.stalcom.fruits.exception.EntityNotFoundException;
import com.stalcom.fruits.warehouse.repository.WarehouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.*;

@Service
@Transactional
@RequiredArgsConstructor
public class WarehouseServiceImpl implements WarehouseService {
    private final WarehouseRepository warehouseRepository;

    public void checkIfExistByWarehouse(long idWare) {
        warehouseRepository.findById(idWare).orElseThrow(
                () -> new EntityNotFoundException("Склад с id:" + idWare + "не найден."));
    }
}
