package com.example.simplethymeleafproject.util;

public final class MarkConverter {

    public static String createMark(Integer number) {
        if (number > 89) {
            return "A";
        } else if (number > 74) {
            return "B";
        } else if (number > 59) {
            return "C";
        } else if (number > 49) {
            return "D";
        } else {
            return "F";
        }
    }
}
