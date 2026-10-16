package com.toucan.features;

public class OrderStatusLabel {

    public static String label(OrderStatus status){

        return switch(status){
            case Pending pn -> "Order placed — awaiting processing";
            case Processing ps -> "Your order is being prepared";
            case Shipped(String trackingNumber) -> "Your order has shipped (Tracking: " + trackingNumber + ")";
            case Delivered d -> "Your order has been delivered";
            case Cancelled(String reason) -> "Order cancelled: " + reason;

        };
    }

    public static void main(String[] args){
        OrderStatus status = new Processing();
        System.out.println(label(status));
    }
}
