package com.businesslayer.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.businesslayer.entities.ProjectEntity;

@Repository
public interface ProjectsRepository extends JpaRepository<ProjectEntity, Long> {

    @Procedure(procedureName = "get_all_projects")
    List<ProjectEntity> callProcedureGetAllProjects();
}
