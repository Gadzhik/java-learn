package com.ggg.oop.lesson7;

public class Ram {

    // все поля должны быть private
    private int value;

    // создаем конструктор для создания Ram
    // this - используется, когда мы хотим обратиться ко всему, что есть в классе(к любым методам и полям)
    public Ram(int value) {
        this.value = value;
    }

    // генерируем метод Get для поля value
    public int getValue() {
        return value;
    }

    // генерируем метод Set для поля value
    public void setValue(int value) {
        this.value = value;
    }
}
