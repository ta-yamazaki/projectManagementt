package com.project.management.domain.model.project;

import java.util.List;

/**
 * 案件のリスト
 */
public class ProjectList {
    List<Project> list;

    public ProjectList(List<Project> list) {
        this.list = list;
    }

    public List<Project> list() {
        return list;
    }

    public int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return "ProjectList{" +
                "list=" + list +
                '}';
    }
}
