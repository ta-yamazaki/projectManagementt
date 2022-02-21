package com.project.management.domain.model.amount;

/**
 * 提示金額
 */
public class OfferAmount {
    int value;

    public OfferAmount() {
    }

    public OfferAmount(int value) {
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
