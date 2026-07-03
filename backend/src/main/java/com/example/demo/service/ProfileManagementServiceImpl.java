package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ProfileDto;
import com.example.demo.entity.ClientProfile;
import com.example.demo.repository.ClientProfileRepository;

@Service
public class ProfileManagementServiceImpl implements ProfileManagementService {

    @Autowired
    private ClientProfileRepository clientProfileRepository;

    @Override
    public ClientProfile getMyProfile(Authentication auth) {
        // Will be implemented after Auth module
        return null;
    }

    @Override
    public List<ClientProfile> getAllProfiles() {
        return clientProfileRepository.findAll();
    }

    @Override
    public ClientProfile updateProfile(String email, ProfileDto dto) {
        // Will be implemented after Auth module
        return null;
    }
}