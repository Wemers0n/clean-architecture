package com.example.cleanarchitecture.application.gateways;

import com.example.cleanarchitecture.domain.entity.User;

import java.util.List;

public interface UserGateway {
    User createUser(User user);

    List<User> GetAllUsers();
}
