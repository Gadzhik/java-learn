package com.ggg.oop.lesson7;

public class CompositionRunner {

    public static void main(String[] args) {
        int ramValue = 1000;
        Ram ram = new Ram(1024);
        Ssd ssd = new Ssd(512);
        Computer computer = new Computer(ram, ssd);
        computer.printState();

        Ram ram2 = new Ram(2048);
        computer.setRam(ram2);
    }
}
