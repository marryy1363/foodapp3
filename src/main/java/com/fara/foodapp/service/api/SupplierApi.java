package com.fara.foodapp.service.api;

import com.fara.foodapp.domain.Supplier;
import org.springframework.stereotype.Service;

@Service
public interface SupplierApi {
    void save(Supplier supplier);
}
