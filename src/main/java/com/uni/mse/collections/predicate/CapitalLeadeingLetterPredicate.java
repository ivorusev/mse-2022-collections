package com.uni.mse.collections.predicate;

import java.util.function.Predicate;

public class CapitalLeadeingLetterPredicate implements Predicate<String> {

    @Override
    public boolean test(String s) {
        char firstLetter = s.charAt(0);
        boolean result = 65 <= firstLetter && firstLetter <= 90;
        return result;
    }

}
