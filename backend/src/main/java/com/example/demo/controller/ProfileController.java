package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.ProfileDto;
import com.example.demo.entity.ClientProfile;
import com.example.demo.service.ProfileManagementService;

@RestController
@RequestMapping("/api/profiles")
public class ProfileController {

    @Autowired
    private ProfileManagementService profileManagementService;

    @GetMapping("/me")
    public ClientProfile getMyProfile(Authentication authentication) {
        return profileManagementService.getMyProfile(authentication);
    }

    @GetMapping
    public List<ClientProfile> getAllProfiles() {
        return profileManagementService.getAllProfiles();
    }

    @PutMapping("/me")
    public ClientProfile updateProfile(Authentication authentication,
                                       @RequestBody ProfileDto dto) {

        String email = authentication.getName();
        return profileManagementService.updateProfile(email, dto);
    }
}