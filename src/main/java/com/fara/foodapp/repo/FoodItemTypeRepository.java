package com.fara.foodapp.repo;

import com.fara.foodapp.domain.FoodItemType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItemTypeRepository extends JpaRepository<FoodItemType, Long> {
}