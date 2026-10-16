package com.toucan.stream.email;

import java.util.Arrays;
import java.util.List;

public class FilterEmail {

    public static void main(String[] args){
        List<String> emails = Arrays.asList("tayyab@gmail.com", "john@example.com", "tayyab@gmail.com", "spongebob@example.com");

        emails.stream().distinct().forEach(email -> System.out.println(email));

        long count = emails.stream().distinct().count();

        System.out.println("Unique emails count: "+count);

        emails.stream().filter(email -> email.endsWith("@example.com")).distinct().forEach(email -> System.out.println(email));
    }
}
