package com.fara.foodapp.service.api;

import com.fara.foodapp.domain.UserStatus;
import com.fara.foodapp.repo.UserStatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserStatusImpl implements UserStatusApi{

    final UserStatusRepository userStatusRepository;
    @Override
    public void save(UserStatus userStatus) {
        userStatusRepository.save(userStatus);
    }
}
