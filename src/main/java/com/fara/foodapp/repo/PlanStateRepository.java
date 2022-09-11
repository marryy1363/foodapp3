package com.fara.foodapp.repo;

import com.fara.foodapp.domain.PlanState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanStateRepository extends JpaRepository<PlanState, Long> {
}