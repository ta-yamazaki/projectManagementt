package com.project.management.domain.model.project;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

/**
 * 案件担当者
 */
public class PicName {
    @NotEmpty(message = "入力してください")
    @Length(max = 40, message = "40文字以内で入力してください")
    String value;

    public PicName() {
    }

    public PicName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
