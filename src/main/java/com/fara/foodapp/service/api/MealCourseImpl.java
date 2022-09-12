package com.fara.foodapp.service.api;

import com.fara.foodapp.domain.MealCourse;
import com.fara.foodapp.repo.MealCourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MealCourseImpl implements MealCourseApi {
    final MealCourseRepository mealCourseRepository;

    @Override
    public List<MealCourse> findAllMealCourse() {
        return mealCourseRepository.findAll();
    }

    @Override
    public MealCourse findById(Long id) throws Exception {
        Optional<MealCourse> byId = mealCourseRepository.findById(id);
        if (byId.isPresent())
            return byId.get();
        else
            throw new Exception("mealCourseId not found");
    }

    @Override
    public MealCourse save(MealCourse mealCourse) {
        return mealCourseRepository.save(mealCourse);
    }

    @Override
    public void edit(MealCourse mealCourse) throws Exception {
        Optional<MealCourse> byId = mealCourseRepository.findById(mealCourse.getId());
        if (byId.isPresent())
            mealCourseRepository.save(byId.get());
        else
            throw new Exception("mealCourseId not found");
    }

    @Override
    public void delete(Long id) throws Exception {
        Optional<MealCourse> byId = mealCourseRepository.findById(id);
        if (byId.isPresent())
            mealCourseRepository.delete(byId.get());
        else
            throw new Exception("mealCourseId not found");
    }


}
