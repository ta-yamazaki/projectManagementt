package com.project.management.domain.model.project;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

/**
 * 案件名
 */
public class ProjectName {
    @NotEmpty(message = "入力してください")
    @Length(max = 100, message = "100文字以内で入力してください")
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
