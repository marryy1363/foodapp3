package com.fara.foodapp.service.api;

import com.fara.foodapp.domain.Users;
import com.fara.foodapp.repo.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsersImpl implements UsersApi {
    final UsersRepository usersRepository;
    @Override
    public List<Users> findAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public Users findById(Long id) throws Exception {
        Optional<Users> byId = usersRepository.findById(id);
        if (byId.isPresent())
            return byId.get();
        else
            throw new Exception("user not found.");

    }

    @Override
    public Users save(Users users) {
        return usersRepository.save(users);
    }

    @Override
    public Users edit(Users users) throws Exception {
        if (usersRepository.findById(users.getId()).isPresent())
            return usersRepository.save(users);
        else
            throw new Exception("id not found");

    }

    @Override
    public void delete(Long id) throws Exception {
        Optional<Users> byId = usersRepository.findById(id);
        if (byId.isPresent())
            usersRepository.delete(byId.get());
        else
            throw new Exception("id not found");
    }
}
