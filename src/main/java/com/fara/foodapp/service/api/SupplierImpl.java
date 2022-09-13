package com.fara.foodapp.service.api;

import com.fara.foodapp.domain.Supplier;
import com.fara.foodapp.repo.SupplierRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SupplierImpl implements SupplierApi{
    final SupplierRepository supplierRepository;
    @Override
    public void save(Supplier supplier) {
     supplierRepository.save(supplier);
    }
}
