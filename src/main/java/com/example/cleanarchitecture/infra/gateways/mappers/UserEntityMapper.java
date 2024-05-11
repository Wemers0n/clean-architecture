package com.example.cleanarchitecture.infra.gateways.mappers;

import com.example.cleanarchitecture.domain.entity.User;
import com.example.cleanarchitecture.infra.persistence.UserEntity;

public class UserEntityMapper {
    public  UserEntity toEntity(User userDomainObj){

        return new UserEntity(userDomainObj.username(), userDomainObj.password(), userDomainObj.email());
    }

    public  User toDomainObj(UserEntity userEntity){
        return new User(userEntity.getUsername(), userEntity.getPassword(), userEntity.getEmail());
    }
}
