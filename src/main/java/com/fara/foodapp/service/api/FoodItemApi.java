package com.fara.foodapp.service.api;

import com.fara.foodapp.domain.FoodItem;
import com.fara.foodapp.domain.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FoodItemApi {


    List<FoodItem> findAllfoodItem();

    FoodItem findById(Long id) throws Exception;

    FoodItem save(FoodItem foodItem);

    void edit(FoodItem foodItem) throws Exception;

    void delete(Long id) throws Exception;
}
