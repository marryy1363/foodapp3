package com.fara.foodapp.controller;

import com.fara.foodapp.domain.Users;
import com.fara.foodapp.service.api.UsersApi;
import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/food-app/users")
@RequiredArgsConstructor
public class UserController {

    private final UsersApi usersApi;


    @GetMapping("/all")
    List<Users> findAll() {
        return usersApi.findAllUsers();
    }


    @GetMapping("/find-by-id/{id}")
    Users findById(@PathVariable Long id) throws Exception {
        return usersApi.findById(id);

    }



    @PostMapping("/save")
    Users save(@RequestBody @Valid Users users){
        return usersApi.save(users);

    }

    @PostMapping("/edit")
    void Edit(@RequestBody @Valid Users users) throws Exception {
        usersApi.edit(users);

    }

    @GetMapping("/delete/{id}")
    void delete(@PathVariable Long id) throws Exception {
        usersApi.delete(id);
    }
}
