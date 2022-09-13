package com.fara.foodapp;

import com.fara.foodapp.domain.PlanState;
import com.fara.foodapp.domain.UserStatus;
import com.fara.foodapp.domain.Users;
import com.fara.foodapp.service.api.PlanStateApi;
import com.fara.foodapp.service.api.UserStatusApi;
import com.fara.foodapp.service.api.UsersApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class FoodappApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodappApplication.class, args);
    }

}
