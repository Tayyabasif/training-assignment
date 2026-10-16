package com.toucan.features;

import java.util.Objects;

public record PaymentReponse(String type, String currency, double amount) {

    public PaymentReponse{

        Objects.requireNonNull(type, "Type cannot be null");
        Objects.requireNonNull(currency, "Currency cannot be null");

        if(amount<0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }

    }
}
