package com.project.management.domain.model.client;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

/**
 * クライアント名称
 */
public class ClientName {
    @NotEmpty(message = "入力してください")
    @Length(max = 100, message = "100文字以内で入力してください")
    String value;

    public ClientName() {
    }

    public ClientName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
