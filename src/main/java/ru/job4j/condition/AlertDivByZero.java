package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-1);
    }

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }
        if (number < 0) {
            System.out.println("This is negative number.");
        }
    }

    public static class SqArea {
        public static double square(int p, double k) {
            double h = p / (2 * (k + 1));
            double l = h * k;
            double s = l * h;
            return s;
        }

        public static void main(String[] args) {
            double result1 = SqArea.square(4, 1);
            double result2 = SqArea.square(6, 2);
            System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
            System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
        }
    }
}
