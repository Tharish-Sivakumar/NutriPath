package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ClientProfile;

public interface ClientProfileRepository extends JpaRepository<ClientProfile, Long> {

    Optional<ClientProfile> findByAccountId(Long accountId);

}