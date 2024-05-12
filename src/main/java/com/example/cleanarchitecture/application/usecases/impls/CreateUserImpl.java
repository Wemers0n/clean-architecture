package com.example.cleanarchitecture.application.usecases.impls;

import com.example.cleanarchitecture.application.gateways.UserGateway;
import com.example.cleanarchitecture.application.usecases.CreateUserUseCase;
import com.example.cleanarchitecture.domain.entity.User;

public class CreateUserImpl implements CreateUserUseCase {

    private UserGateway userGateway;

    public CreateUserImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public User createUser(User user){
        return userGateway.createUser(user);
    }
}
