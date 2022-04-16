package com.ggg.lesson10;

/**
 *  2. Написать ф-ю, принимающую 2 параметра: строку и слово - и возвращающую true, если строка начинается и заканчивается этим словом
 */

public class Task2 {

    public static void main(String[] args) {
        String value = "shikarno some text shikarno";
        String word = "shikarno";
        System.out.println(isStartAndEnd(value, word));
    }
    private static boolean isStartAndEnd(String target, String word) {
        return target.startsWith(word) && target.endsWith(word);
    }
}

