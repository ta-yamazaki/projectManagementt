package com.project.management.domain.model.project;

/**
 * 検索キーワード
 */
public class Keyword {
    String value;

    public Keyword(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public boolean isNull() {
        return value == null;
    }

    public boolean isBlank() {
        return value.isBlank();
    }

    @Override
    public String toString() {
        return value();
    }
}
