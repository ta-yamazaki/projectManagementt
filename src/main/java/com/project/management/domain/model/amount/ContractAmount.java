package com.project.management.domain.model.amount;

/**
 * 受注金額
 */
public class ContractAmount {
    int value;

    public ContractAmount() {
    }

    public ContractAmount(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
