package com.toucan.features;

public sealed interface OrderStatus
        permits Pending, Processing, Shipped, Delivered, Cancelled {
}

record Pending() implements OrderStatus {}
record Processing() implements OrderStatus {}
record Shipped(String trackingNumber) implements OrderStatus {}
record Delivered() implements OrderStatus {}
record Cancelled(String reason) implements OrderStatus {}


//use a sealed interface to model the possible OrderStatus outcomes and a pattern-matching switch to convert each outcome into a user-facing label.