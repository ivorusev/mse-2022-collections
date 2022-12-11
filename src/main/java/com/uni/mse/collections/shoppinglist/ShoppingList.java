package com.uni.mse.collections.shoppinglist;

import java.util.*;

public class ShoppingList {

    private final List<Product> shoppingList = new ArrayList<>();

    private static final Comparator<Product> BY_PRICE = Comparator.comparingInt(p -> Math.round(p.getPrice()));

    private static final Comparator<Product> BY_NAME = Comparator.comparing(Product::getName);

    public void addProduct(Product product) {
        shoppingList.add(product);
    }

    public List<Product> getSortedByPrice() {
        Collections.sort(shoppingList, BY_PRICE);
        return shoppingList;
    }

    public List<Product> getSortedByName() {
        Collections.sort(shoppingList, BY_NAME);
        return shoppingList;
    }

    public void printList() {
        shoppingList.forEach(System.out::println);
    }

    public void printExpensiveItems() {
        shoppingList.stream().filter((p) -> p.getPrice() > 1000).forEach(System.out::println);
    }

    public Optional<Float> getSum() {
        return shoppingList.stream().map(Product::getPrice).reduce(Float::sum);
    }
}
