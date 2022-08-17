package ru.job4j.calculator;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double one = (a + b + c) / 2;
        double two = one * (one - a) * (one - b) * (one - c);
        double tree = Math.sqrt(two);
        return tree;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(7, 8, 9);
        System.out.println("area (7, 8, 9) = " + rsl);
    }
}
