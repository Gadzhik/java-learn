package com.ggg.lesson10;

/**
 * 4. Посчитать количество всех точек, запятых и воскл знаков в строке
 */

public class Task4 {
    public static void main(String[] args) {
        String value = "rrrrrr.,!ggggggg.,?aaaaa!fffff";
        System.out.println(countSymbols(value));
    }

    public static int countSymbols(String value) {
        String result = value.replace(".", "")
                .replace(",", "")
                .replace("!", "");
        return value.length() - result.length();
    }

}
