package com.stalcom.fruits.supplier.service;

import com.stalcom.fruits.exception.EntityNotFoundException;
import com.stalcom.fruits.supplier.model.Supplier;
import com.stalcom.fruits.supplier.repository.SupplierRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class SupplierServiceImpl implements SupplierService {
    private final SupplierRepository supplierRepository;

    @Override
    public Optional<Supplier> supplierGetById(long idSup) {
        return Optional.ofNullable(supplierRepository.findById(idSup).orElseThrow(
                () -> new EntityNotFoundException("Поставщик с id:" + idSup + "не найден.")));
    }
}
