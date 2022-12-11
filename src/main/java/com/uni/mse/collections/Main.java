package com.uni.mse.collections;

import com.uni.mse.collections.predicate.CapitalLeadeingLetterPredicate;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> isStartingWithCapital = (String s) -> s.charAt(0) >= 65 && s.charAt(0) <= 90;
        System.out.println(isStartingWithCapital.test("test"));
    }
}