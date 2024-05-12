package com.example.cleanarchitecture.infra.controllers;

import com.example.cleanarchitecture.application.usecases.CreateUserUseCase;
import com.example.cleanarchitecture.application.usecases.GetAllUsersUseCase;
import com.example.cleanarchitecture.application.usecases.impls.CreateUserImpl;
import com.example.cleanarchitecture.application.usecases.impls.GetAllUsersImpl;
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

    private final GetAllUsersUseCase getAllUsersUseCase;
    private final CreateUserUseCase createUserUseCase;
    private final UserDTOMapper userDTOMapper;

    public UserController(CreateUserImpl createUserUseCase, GetAllUsersImpl getAllUsersUseCase, UserDTOMapper userDTOMapper) {
        this.getAllUsersUseCase = getAllUsersUseCase;
        this.createUserUseCase = createUserUseCase;
        this.userDTOMapper = userDTOMapper;
    }

    @GetMapping
    List<CreateUserResponse> getAll(){
        List<User> userList = getAllUsersUseCase.getAllUsers();
        return userDTOMapper.toResponseList(userList);
    }

    @PostMapping
    CreateUserResponse create(@RequestBody CreateUserRequest userRequest){
        User userBussinessObj = userDTOMapper.toUser(userRequest);
        User user = createUserUseCase.createUser(userBussinessObj);
        return userDTOMapper.toResponse(user);
    }
}
