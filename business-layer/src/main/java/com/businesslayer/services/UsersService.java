package com.businesslayer.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.businesslayer.entities.UserEntity;
import com.businesslayer.models.UserModel;
import com.businesslayer.repositories.UsersRepository;
import com.businesslayer.utils.ObjectMapper;

@Service
public class UsersService {
    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Transactional
    public List<UserModel> getAllUserModels() {
        List<UserEntity> userEntities = usersRepository.callProduceGetAllUsers();
        List<UserModel> userModels = userEntities.stream()
            .map(entity -> ObjectMapper.INSTANCE.userEntityToModel(entity))
            .collect(Collectors.toList());
        return userModels;
    }
}
