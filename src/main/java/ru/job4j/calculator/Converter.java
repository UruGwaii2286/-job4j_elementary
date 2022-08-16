package ru.job4j.calculator;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float inOne = 140;
        float expectedOne = 2;
        float outOne = Converter.rubleToEuro(inOne);
        boolean passedOne = expectedOne == outOne;
        System.out.println("140 rubles are 2. Test result : " + passedOne);
        float inTwo = 120;
        float expectedTwo = 3;
        float outTwo = Converter.rubleToDollar(inTwo);
        boolean passedTwo = expectedTwo == outTwo;
        System.out.println("120 rubles are 2. Test result : " + passedTwo);
    }
}
