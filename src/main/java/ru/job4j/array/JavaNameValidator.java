package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = true;
        if (name.isEmpty()) {
          valid = false;
        } else {
            for (int i = 0; i < name.length(); i++) {
                int code = name.codePointAt(i);
                char c = name.charAt(0);
                if (isDigit(code) && !isSpecialSymbol(code) && !isLowerLatinLetter(code) && !isUpperLatinLetter(code)) {
                    valid = false;
                    break;
                }
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 || code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 || code <= 122;
    }

    public static boolean isDigit(int code) {
        return Character.isDigit(code);
    }
}