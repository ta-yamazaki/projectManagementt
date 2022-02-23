package com.project.management.domain.model.amount;

import javax.validation.constraints.Min;

/**
 * 提示金額
 */
public class OfferAmount {
    @Min(value = 0, message = "0以上の数値を入力してください")
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
