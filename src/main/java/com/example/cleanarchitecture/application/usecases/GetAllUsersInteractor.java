package com.example.cleanarchitecture.application.usecases;


import com.example.cleanarchitecture.application.gateways.UserGateway;
import com.example.cleanarchitecture.domain.entity.User;

import java.util.List;

public class GetAllUsersInteractor {

    private final UserGateway userGateway;

    public GetAllUsersInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public List<User> getAllUsers(){
        return userGateway.GetAllUsers();
    }
}
