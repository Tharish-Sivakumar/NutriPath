package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ClientProfileDTO;
import com.example.demo.entity.ClientProfile;
import com.example.demo.repository.ClientProfileRepository;

@Service
public class ClientProfileServiceImpl implements ClientProfileService {

    @Autowired
    private ClientProfileRepository clientProfileRepository;

    @Override
    public ClientProfile getMyProfile(String email) {
        // TODO: Will be implemented after Auth module
        return null;
    }

    @Override
    public List<ClientProfile> getAllProfiles() {
        return clientProfileRepository.findAll();
    }

    @Override
    public ClientProfile updateProfile(String email, ClientProfileDTO dto) {
        // TODO: Will be implemented after Auth module
        return null;
    }
}