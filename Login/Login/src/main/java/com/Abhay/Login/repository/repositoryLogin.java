package com.Abhay.Login.repository;

import com.Abhay.Login.model.modelLogin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface repositoryLogin extends JpaRepository<modelLogin, Long> {

    boolean existsByUsername(String username);
    Optional<modelLogin> findByUsernameAndPassword(String username, String password);
}