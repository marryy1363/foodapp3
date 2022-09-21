package com.fara.foodapp.service.api;

import com.fara.foodapp.domain.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsersApi {
    List<Users> findAllUsers();

    Users findById(Long id) throws Exception;

    Users save(Users users) throws Exception;

    Users edit(Users users) throws Exception;

    void delete(Long id) throws Exception;

    Users findByUserId(String userId);
}
