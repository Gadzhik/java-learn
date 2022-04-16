package com.ggg.oop.lesson9;

import com.ggg.oop.lesson7.Computer;

public class StaticRunner {

    public static void main(String[] args) {
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        System.out.println(Computer.getCounter());
    }

}
