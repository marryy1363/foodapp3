package com.fara.foodapp.controller;

import com.fara.foodapp.domain.WeeklyMenu;
import com.fara.foodapp.service.api.WeeklyMenuApi;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/food-app/weekly-menu")
@RequiredArgsConstructor
public class WeeklyMenuController {
    private final WeeklyMenuApi weeklyMenuApi;


    @GetMapping("/all")
    List<WeeklyMenu> findAll() {
        return weeklyMenuApi.findAllWeeklyMenu();
    }


    @GetMapping("/find-by-id/{id}")
    WeeklyMenu findById(@PathVariable Long id) throws Exception {
        return weeklyMenuApi.findById(id);

    }



    @PostMapping("/save")
    WeeklyMenu save(@RequestBody @Valid WeeklyMenu weeklyMenu){
        return weeklyMenuApi.save(weeklyMenu);

    }

    @PostMapping("/edit")
    void Edit(@RequestBody @Valid WeeklyMenu weeklyMenu) throws Exception {
        weeklyMenuApi.edit(weeklyMenu);

    }

    @GetMapping("/delete/{id}")
    void delete(@PathVariable Long id) throws Exception {
        weeklyMenuApi.delete(id);
    }

}
