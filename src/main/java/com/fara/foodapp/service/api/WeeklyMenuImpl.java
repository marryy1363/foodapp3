package com.fara.foodapp.service.api;

import com.fara.foodapp.domain.WeeklyMenu;
import com.fara.foodapp.repo.WeeklyMenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static com.fara.foodapp.service.api.Utils.DateUtils.dateOf;

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
    public WeeklyMenu save(WeeklyMenu weeklyMenu) throws Exception {
         checkValidateTimeWeeklyMenu(weeklyMenu);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        weeklyMenu.setCreateDate(timestamp);
         return weeklyMenuRepository.save(weeklyMenu);
    }

    @Override
    public WeeklyMenu edit(WeeklyMenu weeklyMenu) throws Exception {
        if (weeklyMenuRepository.findById(weeklyMenu.getId()).isPresent())
        {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            weeklyMenu.setCreateDate(timestamp);
            checkValidateTimeWeeklyMenu(weeklyMenu);
            return weeklyMenuRepository.save(weeklyMenu);
        }
        else
            throw new Exception("id not found");

    }

    private void checkValidateTimeWeeklyMenu(WeeklyMenu weeklyMenu) throws Exception {
        java.util.Date startDate = weeklyMenu.getStartDate();
        if (startDate.before(Date.valueOf(LocalDate.now())))
            throw new Exception("start date of menu cant be in past");
        java.util.Date toDate = weeklyMenu.getToDate();
        if (!toDate.after(startDate))
            throw new Exception("todate of menu cant be in past of start date");

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
