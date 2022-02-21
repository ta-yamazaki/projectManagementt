package com.project.management.domain.model.amount;

import com.project.management.domain.type.text.NonValueLetter;

/**
 * 案件の金額
 */
public class Amount {
    OfferAmount offerAmount;
    ContractAmount contractAmount;

    public Amount() {
    }

    public Amount(OfferAmount offerAmount, ContractAmount contractAmount) {
        this.offerAmount = offerAmount;
        this.contractAmount = contractAmount;
    }

    public OfferAmount offer() {
        return offerAmount;
    }
    public String offerAsText() {
        return isOfferAmountExists() ? offerAmount.toString() : NonValueLetter.HYPHEN;
    }

    public ContractAmount contract() {
        return contractAmount;
    }
    public String contractAsText() {
        return isContractAmountExists() ? contractAmount.toString() : NonValueLetter.HYPHEN;
    }

    public boolean isOfferAmountExists() {
        return offerAmount != null;
    }

    public boolean isContractAmountExists() {
        return contractAmount != null;
    }

    @Override
    public String toString() {
        return "Amount{" +
                "offerAmount=" + offerAmount +
                ", contractAmount=" + contractAmount +
                '}';
    }
}
