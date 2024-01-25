package com.stalcom.fruits.supplier.service;

import com.stalcom.fruits.exception.EntityNotFoundException;
import com.stalcom.fruits.supplier.repository.SupplierRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.*;

@Service
@Transactional
@RequiredArgsConstructor
public class SupplierServiceImpl implements SupplierService {
    private final SupplierRepository supplierRepository;

    public void checkIfExistBySupplier(long idSup) {
        supplierRepository.findById(idSup).orElseThrow(
                () -> new EntityNotFoundException("Поставщик с id:" + idSup + "не найден."));
    }
}
