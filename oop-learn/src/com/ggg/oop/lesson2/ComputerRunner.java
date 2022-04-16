package com.ggg.oop.lesson2;

public class ComputerRunner {

    public static void main(String[] args) {
        int value = 5;
        Computer computer = new Computer();
        computer.printState();

        Computer computer1 = new Computer(1024);
        computer1.printState();

        Computer computer2 = new Computer(2024, 512);
        computer2.printState();
       }

}
