package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.ClientProfileDTO;
import com.example.demo.entity.ClientProfile;
import com.example.demo.service.ClientProfileService;

@RestController
@RequestMapping("/api/profile")
public class ClientProfileController {

    @Autowired
    private ClientProfileService clientProfileService;

    @GetMapping("/me")
    public ClientProfile getMyProfile(@RequestParam String email) {
        return clientProfileService.getMyProfile(email);
    }

    @GetMapping
    public List<ClientProfile> getAllProfiles() {
        return clientProfileService.getAllProfiles();
    }

    @PutMapping("/me")
    public ClientProfile updateProfile(@RequestParam String email,
                                       @RequestBody ClientProfileDTO dto) {
        return clientProfileService.updateProfile(email, dto);
    }
}