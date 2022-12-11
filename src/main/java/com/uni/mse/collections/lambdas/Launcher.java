package com.uni.mse.collections.lambdas;

public class Launcher {

    public static void main(String[] args) {
        ArithmeticOperation<Integer> summer = Integer::sum;
        ArithmeticOperation<Integer> multiply = (Integer a, Integer b) -> a * b;
        System.out.println(summer.calculate(2, 3));
        System.out.println(multiply.calculate(9, 9));
    }

}
