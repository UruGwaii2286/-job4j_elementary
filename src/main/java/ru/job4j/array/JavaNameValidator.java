package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = true;
        int code;
        if (!name.isEmpty() && !isDigit(name.codePointAt(0)) && isLowerLatinLetter(name.codePointAt(0))) {
            for (int i = 1; i < name.length(); i++) {
                code = name.codePointAt(i);
                if (!isLowerLatinLetter(code) && !isUpperLatinLetter(code) && !isSpecialSymbol(code) && !isDigit(code)) {
                    valid = false;
                    break;
                }
            }
        } else {
            valid = false;
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }

    public static boolean isDigit(int code) {
        return Character.isDigit(code);
    }
}