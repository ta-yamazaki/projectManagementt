package com.project.management.infrastructure.datasource.project;

import com.project.management.domain.model.project.Keyword;
import com.project.management.domain.model.project.Project;
import com.project.management.domain.model.project.ProjectName;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProjectMapper {
    List<Project> searchProjectList(@Param("keyword") Keyword keyword);

    Project findBy(@Param("projectName") ProjectName projectName);
}
