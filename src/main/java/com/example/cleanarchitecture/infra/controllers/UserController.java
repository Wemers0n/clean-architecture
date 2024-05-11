package com.example.cleanarchitecture.infra.controllers;

import com.example.cleanarchitecture.application.usecases.CreateUserInteractor;
import com.example.cleanarchitecture.application.usecases.GetAllUsersInteractor;
import com.example.cleanarchitecture.domain.entity.User;
import com.example.cleanarchitecture.infra.dtos.request.CreateUserRequest;
import com.example.cleanarchitecture.infra.dtos.response.CreateUserResponse;
import com.example.cleanarchitecture.infra.dtos.UserDTOMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
// @AllArgsConstructor
public class UserController {

    private final GetAllUsersInteractor getAllUsersInteractor;
    private final CreateUserInteractor createUserInteractor;
    private final UserDTOMapper userDTOMapper;

    public UserController(CreateUserInteractor createUserInteractor, GetAllUsersInteractor getAllUsersInteractor, UserDTOMapper userDTOMapper) {
        this.getAllUsersInteractor = getAllUsersInteractor;
        this.createUserInteractor = createUserInteractor;
        this.userDTOMapper = userDTOMapper;
    }

    @GetMapping
    List<CreateUserResponse> getAll(){
        List<User> userList = getAllUsersInteractor.getAllUsers();
        return userDTOMapper.toResponseList(userList);
    }

    @PostMapping
    CreateUserResponse create(@RequestBody CreateUserRequest userRequest){
        User userBussinessObj = userDTOMapper.toUser(userRequest);
        User user = createUserInteractor.createUser(userBussinessObj);
        return userDTOMapper.toResponse(user);
    }
}
