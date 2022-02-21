package com.project.management.application.repository;

import com.project.management.domain.model.project.Keyword;
import com.project.management.domain.model.project.Project;
import com.project.management.domain.model.project.ProjectList;
import com.project.management.domain.model.project.ProjectName;

public interface ProjectRepository {
    ProjectList search(Keyword keyword);
    Project findBy(ProjectName projectName);
}
