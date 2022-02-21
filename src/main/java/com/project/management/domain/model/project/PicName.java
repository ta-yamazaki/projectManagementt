package com.project.management.domain.model.project;

/**
 * 案件担当者
 */
public class PicName {
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
