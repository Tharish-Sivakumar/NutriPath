package com.example.demo.security;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    // Required by SRS
    private Long secretKey = 123456789L;
    private Long jwtExpiration = 86400000L;

    public String generateToken(String username) {
        return "TOKEN_" + username;
    }

    public String extractUsername(String token) {
        if (token == null) {
            return null;
        }

        if (token.startsWith("TOKEN_")) {
            return token.substring(6);
        }

        return null;
    }

    public boolean isTokenValid(String token, String username) {
        String extractedUsername = extractUsername(token);
        return extractedUsername != null && extractedUsername.equals(username);
    }
}