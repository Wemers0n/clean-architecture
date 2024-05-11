package com.example.cleanarchitecture.infra.dtos;

import com.example.cleanarchitecture.domain.entity.User;
import com.example.cleanarchitecture.infra.dtos.request.CreateUserRequest;
import com.example.cleanarchitecture.infra.dtos.response.CreateUserResponse;

import java.util.List;
import java.util.stream.Collectors;

public class UserDTOMapper {

    public CreateUserResponse toResponse(User user){
        return new CreateUserResponse(user.username(), user.email());
    }

    public User toUser(CreateUserRequest userRequest){
        return new User(userRequest.username(), userRequest.password(), userRequest.email());
    }

    public List<CreateUserResponse> toResponseList(List<User> userList){
        return userList.stream().map(this::toResponse).collect(Collectors.toList());
    }
}
