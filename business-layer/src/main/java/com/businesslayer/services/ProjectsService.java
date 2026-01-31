package com.businesslayer.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.businesslayer.entities.ProjectEntity;
import com.businesslayer.models.ProjectModel;
import com.businesslayer.repositories.ProjectsRepository;
import com.businesslayer.utils.ObjectMapper;

@Service
public class ProjectsService {
    private final ProjectsRepository projectsRepository;

    public ProjectsService(ProjectsRepository projectsRepository) {
        this.projectsRepository = projectsRepository;
    }

    @Transactional
    public List<ProjectModel> getAllProjectsModels() {
        List<ProjectEntity> projectEntities = projectsRepository.callProcedureGetAllProjects();
        List<ProjectModel> projectModels =projectEntities.stream()
            .map(entity -> ObjectMapper.INSTANCE.projectEntityToModel(entity))
            .collect(Collectors.toList());
        return projectModels;
    }

}
