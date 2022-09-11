package com.fara.foodapp.repo;

import com.fara.foodapp.domain.MealCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealCourseRepository extends JpaRepository<MealCourse, Long> {
}