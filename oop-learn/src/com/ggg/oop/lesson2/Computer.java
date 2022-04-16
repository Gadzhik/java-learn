package com.ggg.oop.lesson2;

public class Computer {

    int ssd = 500;
    int ram;

    // constructor, в них отсутств. возвращаемый тип
   // 1 -> private
    // 2 -> protected
    // 3 -> public

    public Computer() {
        System.out.println("I was create!");
    }

    Computer(int newSsd) {
        ssd = newSsd;
    }

    Computer(int newSsd, int newRam) {
        ssd = newSsd;
        ram = newRam;
    }

    void load() {
        System.out.println("I'm load!");
    }

    // [модификаторы] returnValue name ([params])
    void printState() {
        System.out.println("Ssd: " + ssd);
        System.out.println("Ram: " + ram);
        System.out.println();
    }
}
