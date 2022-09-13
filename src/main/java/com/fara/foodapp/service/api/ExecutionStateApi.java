package com.fara.foodapp.service.api;

import com.fara.foodapp.domain.ExecutionState;
import org.springframework.stereotype.Service;

@Service
public interface ExecutionStateApi {
    void save(ExecutionState executionState);
}
