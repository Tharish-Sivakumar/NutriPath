package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AuthRequestDto;
import com.example.demo.dto.AuthResponseDto;
import com.example.demo.entity.SystemAccount;
import com.example.demo.repository.SystemAccountRepository;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private SystemAccountRepository systemAccountRepository;

    @Override
    public AuthResponseDto authenticate(AuthRequestDto request) {

        SystemAccount account = systemAccountRepository
                .findByEmail(request.getEmail())
                .orElse(null);

        if (account == null) {
            return null;
        }

        AuthResponseDto response = new AuthResponseDto();
        response.setToken("dummy-token");
        response.setEmail(account.getEmail());
        response.setRole(account.getRole());

        return response;
    }

    @Override
    public AuthResponseDto register(AuthRequestDto request) {

        SystemAccount account = new SystemAccount();

        account.setEmail(request.getEmail());
        account.setPasswordHash(request.getPassword());
        account.setRole("CLIENT");
        account.setStatus("ACTIVE");

        systemAccountRepository.save(account);

        AuthResponseDto response = new AuthResponseDto();
        response.setToken("dummy-token");
        response.setEmail(account.getEmail());
        response.setRole(account.getRole());

        return response;
    }
}