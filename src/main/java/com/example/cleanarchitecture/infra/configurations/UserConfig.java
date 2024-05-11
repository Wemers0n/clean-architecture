package com.example.cleanarchitecture.infra.configurations;

import com.example.cleanarchitecture.application.gateways.UserGateway;
import com.example.cleanarchitecture.application.usecases.CreateUserInteractor;
import com.example.cleanarchitecture.application.usecases.GetAllUsersInteractor;
import com.example.cleanarchitecture.domain.entity.User;
import com.example.cleanarchitecture.infra.dtos.UserDTOMapper;
import com.example.cleanarchitecture.infra.gateways.UserRepositoryGateway;
import com.example.cleanarchitecture.infra.gateways.mappers.UserEntityMapper;
import com.example.cleanarchitecture.infra.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CreateUserInteractor createUserCase(UserGateway userGateway) {
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    GetAllUsersInteractor getAllUsersCase(UserGateway userGateway){
        return new GetAllUsersInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper() {
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper() {
        return new UserDTOMapper();
    }
}
