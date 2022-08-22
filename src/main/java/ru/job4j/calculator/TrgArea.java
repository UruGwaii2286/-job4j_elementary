package ru.job4j.calculator;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(7, 8, 9);
        System.out.println("area (7, 8, 9) = " + rsl);
    }
}
