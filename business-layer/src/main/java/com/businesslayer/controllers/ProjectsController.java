package com.businesslayer.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.businesslayer.models.ProjectModel;
import com.businesslayer.services.ProjectsService;


@RestController
public class ProjectsController {

    private final ProjectsService projectsService;

    public ProjectsController(ProjectsService projectsService) {
        this.projectsService = projectsService;
    }

    @GetMapping("/welcome")
    public String firstApi() {
        return "Welcome To My First API Project";
    }

    @GetMapping("/getAllProjects")
    public List<ProjectModel> getAllProjects() {
        return projectsService.getAllProjectsModels();
    }

}
