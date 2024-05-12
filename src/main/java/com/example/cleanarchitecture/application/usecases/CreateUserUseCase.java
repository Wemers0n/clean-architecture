package com.example.cleanarchitecture.application.usecases;

import com.example.cleanarchitecture.domain.entity.User;

public interface CreateUserUseCase {
    User createUser(User user);
}
