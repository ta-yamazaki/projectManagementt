package com.project.management.infrastructure.datasource.project;

import com.project.management.application.repository.ProjectRepository;
import com.project.management.domain.model.project.Keyword;
import com.project.management.domain.model.project.Project;
import com.project.management.domain.model.project.ProjectList;
import com.project.management.domain.model.project.ProjectName;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProjectDataSource implements ProjectRepository {
    ProjectMapper projectMapper;


    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    public ProjectDataSource(ProjectMapper projectMapper) {
        this.projectMapper = projectMapper;
    }

    @Override
    public ProjectList search(Keyword keyword) {
        List<Project> projectList = projectMapper.searchProjectList(keyword);
        return new ProjectList(projectList);
    }

    @Override
    public Project findBy(ProjectName projectName) {
        return projectMapper.findBy(projectName);
    }
}
