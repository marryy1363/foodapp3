package com.fara.foodapp.repo;

import com.fara.foodapp.domain.ExecutionState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExecutionStateRepository extends JpaRepository<ExecutionState, Long> {
}