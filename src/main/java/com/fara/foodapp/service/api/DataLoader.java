package com.fara.foodapp.service.api;

import com.fara.foodapp.domain.ExecutionState;
import com.fara.foodapp.domain.PlanState;
import com.fara.foodapp.domain.Supplier;
import com.fara.foodapp.domain.UserStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
//@Order(1)
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {
    final UserStatusApi userStatusApi;
    final PlanStateApi planStateApi;
    final SupplierApi supplierApi;

    final ExecutionStateApi executionStateApi;

    @Override
    public void run(String... args) throws Exception {
        userStatusApi.save(new UserStatus(null, "شاغل تمام وقت", ""));
        userStatusApi.save(new UserStatus(null, "شاغل پاره وقت", ""));

        planStateApi.save(new PlanState(null,"پیش نویس"));
        planStateApi.save(new PlanState(null,"در حال تایید"));
        planStateApi.save(new PlanState(null,"تایید شده"));

        supplierApi.save(new Supplier(null,"سازمان حج و زیارت"));

       executionStateApi.save(new ExecutionState(null,"آماده اجرا")) ;
       executionStateApi.save(new ExecutionState(null,"در حال اجرا")) ;
       executionStateApi.save(new ExecutionState(null,"اجرا شده")) ;
       executionStateApi.save(new ExecutionState(null,"خاتمه یافته")) ;
       executionStateApi.save(new ExecutionState(null,"تسویه شده")) ;



    }

}
