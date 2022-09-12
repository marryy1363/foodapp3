package com.fara.foodapp.controller;

import com.fara.foodapp.domain.FoodItem;
import com.fara.foodapp.service.api.FoodItemApi;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/food-app/food-item")
@RequiredArgsConstructor
public class FoodItemController {

    private final FoodItemApi foodItemApi;


    @GetMapping("/all")
    List<FoodItem> findAll() {
        return foodItemApi.findAllfoodItem();
    }


    @GetMapping("/find-by-id/{id}")
    FoodItem findById(@PathVariable Long id) throws Exception {
        return foodItemApi.findById(id);

    }



    @PostMapping("/save")
    FoodItem save(@RequestBody @Valid FoodItem foodItem){
        return foodItemApi.save(foodItem);

    }

    @PostMapping("/edit")
    void Edit(@RequestBody @Valid FoodItem foodItem) throws Exception {
        foodItemApi.edit(foodItem);

    }

    @GetMapping("/delete/{id}")
    void delete(@PathVariable Long id) throws Exception {
        foodItemApi.delete(id);
    }
}
