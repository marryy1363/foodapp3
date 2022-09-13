package com.fara.foodapp.service.api;

import com.fara.foodapp.domain.ExecutionState;
import com.fara.foodapp.repo.ExecutionStateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExecutionStateImpl implements ExecutionStateApi{
    final ExecutionStateRepository executionStateRepository;
    @Override
    public void save(ExecutionState executionState) {
      executionStateRepository.save(executionState);
    }
}
