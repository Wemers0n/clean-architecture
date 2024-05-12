package com.example.cleanarchitecture.application.usecases.impls;


import com.example.cleanarchitecture.application.gateways.UserGateway;
import com.example.cleanarchitecture.application.usecases.GetAllUsersUseCase;
import com.example.cleanarchitecture.domain.entity.User;

import java.util.List;

public class GetAllUsersImpl implements GetAllUsersUseCase {

    private final UserGateway userGateway;

    public GetAllUsersImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public List<User> getAllUsers(){
        return userGateway.GetAllUsers();
    }
}
