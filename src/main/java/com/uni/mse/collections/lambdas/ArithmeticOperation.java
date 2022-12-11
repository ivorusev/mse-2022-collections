package com.uni.mse.collections.lambdas;

@FunctionalInterface
public interface ArithmeticOperation<T> {

    T calculate(T firstNumber, T secondNumber);
}
