package com.businesslayer.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.businesslayer.entities.UserEntity;

@Repository
public interface UsersRepository extends JpaRepository<UserEntity, Long>{

    @Procedure(procedureName = "get_all_users")
    List<UserEntity> callProduceGetAllUsers();
}
