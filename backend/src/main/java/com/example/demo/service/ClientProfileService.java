package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ClientProfileDTO;
import com.example.demo.entity.ClientProfile;

public interface ClientProfileService {

    ClientProfile getMyProfile(String email);

    List<ClientProfile> getAllProfiles();

    ClientProfile updateProfile(String email, ClientProfileDTO dto);

}