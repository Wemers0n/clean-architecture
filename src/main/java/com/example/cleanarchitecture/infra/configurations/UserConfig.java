package com.example.cleanarchitecture.infra.configurations;

import com.example.cleanarchitecture.application.gateways.UserGateway;
import com.example.cleanarchitecture.application.usecases.impls.CreateUserImpl;
import com.example.cleanarchitecture.application.usecases.impls.GetAllUsersImpl;
import com.example.cleanarchitecture.infra.dtos.UserDTOMapper;
import com.example.cleanarchitecture.infra.gateways.UserRepositoryGateway;
import com.example.cleanarchitecture.infra.gateways.mappers.UserEntityMapper;
import com.example.cleanarchitecture.infra.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CreateUserImpl createUserCase(UserGateway userGateway) {
        return new CreateUserImpl(userGateway);
    }

    @Bean
    GetAllUsersImpl getAllUsersCase(UserGateway userGateway){
        return new GetAllUsersImpl(userGateway);
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
