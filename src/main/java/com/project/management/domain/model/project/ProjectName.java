package com.project.management.domain.model.project;

/**
 * 案件名
 */
public class ProjectName {
    String value;

    public ProjectName(String value) {
        this.value = value;
    }


    public ProjectName() {
    }

    public boolean sameValue(ProjectName other) {
        return value.equals(other.toString());
    }

    @Override
    public String toString() {
        return value;
    }
}
