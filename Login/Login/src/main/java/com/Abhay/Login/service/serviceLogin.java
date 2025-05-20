package com.Abhay.Login.service;
import com.Abhay.Login.model.modelLogin;
import com.Abhay.Login.repository.repositoryLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceLogin {

    @Autowired
    private repositoryLogin repository;

    public boolean isUserTaken(String username) {
        return repository.existsByUsername(username);
    }

    public void createUser(modelLogin user){
        repository.save(user);
    }

    public modelLogin authenticateUser(String username, String password) {
        return repository.findByUsernameAndPassword(username, password).orElseThrow();
    }
}

