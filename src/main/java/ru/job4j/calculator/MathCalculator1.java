package ru.job4j.calculator;

import ru.job4j.math.MathFunction1;

public class MathCalculator1 {
    public static double sumAndMultiply(double first, double second) {
        return MathFunction1.sum(first, second)
                + MathFunction1.multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}