package com.fara.foodapp.controller;


import com.fara.foodapp.domain.Users;
import com.fara.foodapp.dto.LoginRequestDto;
import com.fara.foodapp.dto.LoginResponseDto;
import com.fara.foodapp.service.api.UsersImpl;
import com.fara.foodapp.service.api.Utils.JwtUtils;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/food-app")
@RequiredArgsConstructor
@Slf4j
public class authController {



   private final AuthenticationManager authenticationManager;
    private final UsersImpl userService;
    private final JwtUtils jwtUtils;


    @PostMapping("/login")
    LoginResponseDto login(
            @RequestBody LoginRequestDto requestDto,
            HttpServletRequest request,
            HttpServletResponse response) {
        String userName = requestDto.getUserName();
        String password = requestDto.getPassword();
        String loginIpAddress = request.getRemoteAddr();
        try {
            Authentication mmm = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            userName, password
                    )
            );


        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(" bad credentials ");
        }

        UserDetails userDetails = userService.loadUserByUsername(userName);
        Users user = (Users) userDetails;

        LoginResponseDto responseDto = new LoginResponseDto();

        String s = jwtUtils.generateToken(user);
        responseDto.setToken(s);

        return responseDto;

    }


}
