package com.toucan.features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CustomerMain {

    List<Customer> customers = Arrays.asList(new Customer(1, "Spongebob"), new Customer(2, "Squidward"));
    public static void main(String[] args){
        CustomerMain cm = new CustomerMain();
        cm.getCustomer(3).ifPresent(customer -> System.out.println("Id: "+customer.getId()+", Name: "+customer.getName()));
    }

    public Optional<Customer> getCustomer(int id){
        Customer c = null;
        for(Customer customer:customers){
            if(customer.getId()==id) {
                c = customer;
            }
    }
    return Optional.ofNullable(c);
    }
}
