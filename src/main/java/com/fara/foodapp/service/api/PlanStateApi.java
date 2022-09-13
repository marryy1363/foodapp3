package com.fara.foodapp.service.api;

import com.fara.foodapp.domain.PlanState;
import org.springframework.stereotype.Service;

@Service
public interface PlanStateApi {
    void save(PlanState planState);
}
