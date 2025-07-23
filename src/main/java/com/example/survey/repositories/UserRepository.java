package com.example.survey.repositories;

import com.example.survey.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    // For login

    Optional<User> findByUsername(String username);
}