package com.tnsif.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {
    int id;
    String name;
    float price;

    // Parameter constructor
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Javastreamexample {
    public static void main(String[] args) {

        List<Product> pl = new ArrayList<>();
        pl.add(new Product(1, "Hp", 60000));
        pl.add(new Product(2, "Lenovo", 50000));
        pl.add(new Product(3, "Dell", 80000));
        pl.add(new Product(4, "Apple", 100000));

        // Filter + map + collect
        List<Float> pl2 = pl.stream()
                .filter(p -> p.price > 30000)
                .map(p -> p.price)
                .collect(Collectors.toList());

        System.out.println(pl2);

        // Sum of prices
        double totalPrice = pl.stream()
                .collect(Collectors.summingDouble(p -> p.price));
        System.out.println("Total price of laptops: " + totalPrice);

        // Max price
        Product p2 = pl.stream()
                .max((o1, o2) -> o1.price > o2.price ? 1 : -1)
                .get();
        System.out.println("Max price: " + p2.price);

        // Min price
        Product p3 = pl.stream()
                .min((o1, o2) -> o1.price > o2.price ? 1 : -1)
                .get();
        System.out.println("Min price: " + p3.price);

        // Count products with price < 90000
        long count = pl.stream()
                .filter(p -> p.price < 90000)
                .count();
        System.out.println("Count: " + count);

        // Skip example
        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .filter(num -> num % 2 == 0)
                .skip(2)
                .forEach(num -> System.out.print(num + " "));
    }
}