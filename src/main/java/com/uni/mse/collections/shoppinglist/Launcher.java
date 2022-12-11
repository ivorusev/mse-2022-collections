package com.uni.mse.collections.shoppinglist;

public class Launcher {
    public static void main(String[] args) {
        Product macbook = new Product(6500, "Macbook Pro", 1);
        Product milk = new Product(3, "Milk", 2);
        Product iphone = new Product(2800, "iPhone", 3);

        ShoppingList list = new ShoppingList();
        list.addProduct(macbook);
        list.addProduct(milk);
        list.addProduct(iphone);

        list.getSortedByPrice();
        list.printExpensiveItems();

        System.out.println(list.getSum());
    }
}
