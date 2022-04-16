package com.ggg.oop.lesson7;

public class Computer {

    // создаем свои классы
    private Ram ram;
    private Ssd ssd;
    private static int counter = 0;

    // создаем конструктор принимающий Ram
    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    // добавим метод отображающий состояние
    public void printState() {
        System.out.println("Computer: ram " + ram.getValue() + " ssd " + ssd.getValue());
    }



}
