package com.fara.foodapp.service.api;

import com.fara.foodapp.domain.PlanState;
import com.fara.foodapp.repo.PlanStateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlanStateImpl implements PlanStateApi{
    final PlanStateRepository planStateRepository;
    @Override
    public void save(PlanState planState) {
    planStateRepository.save(planState);
    }
}
