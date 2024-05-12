package com.example.cleanarchitecture.application.usecases;

import com.example.cleanarchitecture.domain.entity.User;

import java.util.List;

public interface GetAllUsersUseCase {
    List<User> getAllUsers();
}
