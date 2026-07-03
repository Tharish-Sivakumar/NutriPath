package com.example.demo.service;

import java.util.List;

import org.springframework.security.core.Authentication;

import com.example.demo.dto.ProfileDto;
import com.example.demo.entity.ClientProfile;

public interface ProfileManagementService {

    ClientProfile getMyProfile(Authentication auth);

    List<ClientProfile> getAllProfiles();

    ClientProfile updateProfile(String email, ProfileDto dto);

}