package com.example.cleanarchitecture.application.usecases;

import com.example.cleanarchitecture.application.gateways.UserGateway;
import com.example.cleanarchitecture.domain.entity.User;

public class CreateUserInteractor {

    private UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User createUser(User user){
        return userGateway.createUser(user);
    }
}
