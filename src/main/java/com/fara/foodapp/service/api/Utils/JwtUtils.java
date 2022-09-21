package com.fara.foodapp.service.api.Utils;


import com.fara.foodapp.domain.Users;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class JwtUtils {

    private final String SECRET = "CT3DUq9CZg3xHJ0P1@3iC3&sFLhiWRhq";

    public String generateToken(Users user) {
        // after 15 minutes expires
        long EXPIRED = 900_000L;

        return "Bearer " + Jwts.builder().setSubject(user.getUserId())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRED))
                .signWith(SignatureAlgorithm.HS256, SECRET)
                .compact();

    }

    public String getSubject(String token) {
        return Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token).getBody().getSubject();

    }

}

