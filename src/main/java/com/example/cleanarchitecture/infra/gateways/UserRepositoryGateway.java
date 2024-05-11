package com.example.cleanarchitecture.infra.gateways;

import com.example.cleanarchitecture.application.gateways.UserGateway;
import com.example.cleanarchitecture.domain.entity.User;
import com.example.cleanarchitecture.infra.gateways.mappers.UserEntityMapper;
import com.example.cleanarchitecture.infra.persistence.UserEntity;
import com.example.cleanarchitecture.infra.persistence.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

public class UserRepositoryGateway implements UserGateway {

    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User userDomainObj) {
        UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
        UserEntity savedObj = userRepository.save(userEntity);
        return userEntityMapper.toDomainObj(savedObj);
    }

    @Override
    public List<User> GetAllUsers() {
        List<UserEntity> userEntities = userRepository.findAll();
        return userEntities.stream().map(userEntityMapper::toDomainObj).collect(Collectors.toList());
    }
}
