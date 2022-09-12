package com.fara.foodapp.service.api;

import com.fara.foodapp.domain.MealCourse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MealCourseApi {
    List<MealCourse> findAllMealCourse();

    MealCourse findById(Long id) throws Exception;

    MealCourse save(MealCourse mealCourse);

    void edit(MealCourse mealCourse) throws Exception;

    void delete(Long id) throws Exception;
}
