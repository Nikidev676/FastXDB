package com.example.fastxprojdemo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fastxprojdemo.entity.UserAccount;

public interface UserAccountRegRepo extends JpaRepository<UserAccount, String> {
}
