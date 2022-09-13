package com.fara.foodapp.service.api;

import com.fara.foodapp.domain.WeeklyMenu;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WeeklyMenuApi {
    List<WeeklyMenu> findAllWeeklyMenu();

    WeeklyMenu findById(Long id) throws Exception;

    WeeklyMenu save(WeeklyMenu weeklyMenu) throws Exception;

    WeeklyMenu edit(WeeklyMenu weeklyMenu) throws Exception;

    void delete(Long id) throws Exception;
}
