package com.example.cleanarchitecture.infra.persistence;

import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
