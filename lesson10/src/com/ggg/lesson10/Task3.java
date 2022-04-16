package com.ggg.lesson10;

/**
 * 3. Написать ф-ю, принимающую в качестве параметров имя, фамилию и отчество и возвращ. инициалы.
 * в формате Ф.И.О. Учесть, что входные параметры могут быть в любом регистре, а результирующая строка должна быть в верхнем.
 */

public class Task3 {

    public static void main(String[] args) {
        String result = format("Sam", "Dever", "Beaver");
        System.out.println(result);
    }

    public static String format(String firstName, String lastName, String patronymicName) {
        char firstNameChar = firstName.toUpperCase().charAt(0);
        char lastNameChar = lastName.toUpperCase().charAt(0);
        char patronymicNameChar = patronymicName.toUpperCase().charAt(0);

        // Еще один варианты вывода в UpperCase
//        char firstNameChar = Character.toUpperCase(firstName.charAt(0));
//        char lastNameChar = Character.toUpperCase(lastName.charAt(0));
//        char patronymicNameChar = Character.toUpperCase(patronymicName.charAt(0));

        return firstNameChar + "." + lastNameChar + "." + patronymicNameChar;
        // Еще один вариант вывода записи (вывод в режиме форматирования)
        //return String.format("%s.%s.%s", firstNameChar, lastNameChar, patronymicNameChar);
    }
}
