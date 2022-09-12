package com.fara.foodapp.service.api;

import com.fara.foodapp.domain.FoodItem;
import com.fara.foodapp.repo.FoodItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FoodItemImpl implements FoodItemApi {

    private final FoodItemRepository foodItemRepository;

    @Override
    public List<FoodItem> findAllfoodItem() {
        return foodItemRepository.findAll();
    }

    @Override
    public FoodItem findById(Long id) throws Exception {
        Optional<FoodItem> byId = foodItemRepository.findById(id);
        if (byId.isPresent())
            return byId.get();
        else
            throw new Exception("id not found");
    }

    @Override
    public FoodItem save(FoodItem foodItem) {
        return foodItemRepository.save(foodItem);
    }

    @Override
    public void edit(FoodItem foodItem) throws Exception {
        Optional<FoodItem> byId = foodItemRepository.findById(foodItem.getId());
        if (byId.isPresent())
            foodItemRepository.save(foodItem);
        else
            throw new Exception("id not found");
    }

    @Override
    public void delete(Long id) throws Exception {
        Optional<FoodItem> byId = foodItemRepository.findById(id);
        if (byId.isPresent())
            foodItemRepository.delete(byId.get());
        else
            throw new Exception("id not found");
    }
}
