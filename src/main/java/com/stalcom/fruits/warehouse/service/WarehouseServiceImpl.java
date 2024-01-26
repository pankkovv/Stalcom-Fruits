package com.stalcom.fruits.warehouse.service;

import com.stalcom.fruits.exception.EntityNotFoundException;
import com.stalcom.fruits.warehouse.model.Warehouse;
import com.stalcom.fruits.warehouse.repository.WarehouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class WarehouseServiceImpl implements WarehouseService {
    private final WarehouseRepository warehouseRepository;

    @Override
    public Optional<Warehouse> warehouseGetById(long idWare) {
        return Optional.ofNullable(warehouseRepository.findById(idWare).orElseThrow(
                () -> new EntityNotFoundException("Склад с id:" + idWare + "не найден.")));
    }
}
