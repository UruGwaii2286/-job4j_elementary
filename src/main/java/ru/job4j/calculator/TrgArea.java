package ru.job4j.calculator;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double one = a + b + c;
        double two = one / 2;
        double three = two - a;
        double four = two - b;
        double five = two - c;
        double six = three * four * five;
        double seven = two * six;
        double eight = Math.sqrt(seven);
        return eight;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(7, 8, 9);
        System.out.println("area (7, 8, 9) = " + rsl);
    }
}
