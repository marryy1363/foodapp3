package com.fara.foodapp.controller;

import com.fara.foodapp.domain.MealCourse;
import com.fara.foodapp.service.api.MealCourseApi;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/food-app/meal-course")
@RequiredArgsConstructor
public class MealCourseController {

    private final MealCourseApi mealCourseApi;


    @GetMapping("/all")
    List<MealCourse> findAll() {
        return mealCourseApi.findAllMealCourse();
    }


    @GetMapping("/find-by-id/{id}")
    MealCourse findById(@PathVariable Long id) throws Exception {
        return mealCourseApi.findById(id);

    }



    @PostMapping("/save")
    MealCourse save(@RequestBody @Valid MealCourse mealCourse){
        return mealCourseApi.save(mealCourse);

    }

    @PostMapping("/edit")
    void Edit(@RequestBody @Valid MealCourse mealCourse) throws Exception {
        mealCourseApi.edit(mealCourse);

    }

    @GetMapping("/delete/{id}")
    void delete(@PathVariable Long id) throws Exception {
        mealCourseApi.delete(id);
    }


}

