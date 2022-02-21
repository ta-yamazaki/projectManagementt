package com.project.management.application.service;

import com.project.management.application.repository.ProjectRepository;
import com.project.management.domain.model.project.Keyword;
import com.project.management.domain.model.project.Project;
import com.project.management.domain.model.project.ProjectList;
import com.project.management.domain.model.project.ProjectName;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public ProjectList search(Keyword keyword) {
        return projectRepository.search(keyword);
    }

    public Project findBy(ProjectName projectName) {
        return projectRepository.findBy(projectName);
    }
}
