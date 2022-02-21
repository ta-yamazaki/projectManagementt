package com.project.management.domain.model.client;

/**
 * クライアント名称
 */
public class ClientName {
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
