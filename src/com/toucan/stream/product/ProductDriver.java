package com.toucan.stream.product;

import java.util.Arrays;
import java.util.List;

public class ProductDriver {
    public static void main(String[] args){
        List<Product> products =Arrays.asList(
                new Product(1, "Laptop", 40000, true),
                new Product(2, "Bagpack", 1500, true));

        long count = products.stream()
                .filter(product -> product.price() < 2000 && product.inStock())
                .peek(product -> System.out.println(product.name() + ", " + product.price()))
                .count();

        System.out.println("Count: "+count);

    }
}
