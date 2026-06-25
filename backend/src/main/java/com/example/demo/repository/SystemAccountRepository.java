package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.SystemAccount;

public interface SystemAccountRepository extends JpaRepository <SystemAccount,Long> {
    
}
