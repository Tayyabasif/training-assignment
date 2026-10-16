package com.toucan.features;

public class PaymentResponseMain {

    public static void main(String[] args){
        displayPaymentResponse(new PaymentReponse("UPI", "USD", 2000));
    }

    public static void displayPaymentResponse(PaymentReponse pr){
        System.out.println("Type: "+pr.type()+", Currency: "+pr.currency()+", Amount: "+pr.amount());
    }
}
