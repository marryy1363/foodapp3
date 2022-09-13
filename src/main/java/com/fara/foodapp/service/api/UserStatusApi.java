package com.fara.foodapp.service.api;

import com.fara.foodapp.domain.UserStatus;
import org.springframework.stereotype.Service;

@Service
public interface UserStatusApi {
    void save(UserStatus userStatus);
}
