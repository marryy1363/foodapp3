package com.fara.foodapp.service.api;

import com.fara.foodapp.domain.WeeklyMenu;
import com.fara.foodapp.repo.WeeklyMenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WeeklyMenuImpl implements WeeklyMenuApi{
    final WeeklyMenuRepository weeklyMenuRepository;
    @Override
    public List<WeeklyMenu> findAllWeeklyMenu() {
        return weeklyMenuRepository.findAll();
    }

    @Override
    public WeeklyMenu findById(Long id) throws Exception {
        Optional<WeeklyMenu> byId = weeklyMenuRepository.findById(id);
        if (byId.isPresent())
            return byId.get();
        else
            throw new Exception("user not found.");

    }

    @Override
    public WeeklyMenu save(WeeklyMenu weeklyMenu) {
        return weeklyMenuRepository.save(weeklyMenu);
    }

    @Override
    public WeeklyMenu edit(WeeklyMenu weeklyMenu) throws Exception {
        if (weeklyMenuRepository.findById(weeklyMenu.getId()).isPresent())
            return weeklyMenuRepository.save(weeklyMenu);
        else
            throw new Exception("id not found");

    }

    @Override
    public void delete(Long id) throws Exception {
        Optional<WeeklyMenu> byId = weeklyMenuRepository.findById(id);
        if (byId.isPresent())
            weeklyMenuRepository.delete(byId.get());
        else
            throw new Exception("id not found");
    }
}
