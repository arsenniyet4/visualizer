package com.businesslayer.utils;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.businesslayer.entities.ProjectEntity;
import com.businesslayer.entities.UserEntity;
import com.businesslayer.models.ProjectModel;
import com.businesslayer.models.UserModel;

@Mapper
public interface ObjectMapper {
    ObjectMapper INSTANCE = Mappers.getMapper(ObjectMapper.class);

    ProjectModel projectEntityToModel(ProjectEntity entity);
    UserModel userEntityToModel(UserEntity entity);
}
