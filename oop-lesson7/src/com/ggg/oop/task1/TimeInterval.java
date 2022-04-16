package com.ggg.oop.task1;

public class TimeInterval {

    // Добавляем константы
    private static final int SECONDS_IN_MINUTE = 60;
    private static final int MINUTES_IN_HOUR = 60;

    private int seconds;
    private int minutes;
    private int hours;

    // созд конструктор, кот принимает общее колич секунд и разбивает его
    public TimeInterval(int totalSeconds) {
        // 3750
        this.hours = totalSeconds / 3600;
        // остаток от деления = 150
        this.minutes = totalSeconds % 3600 / 60;
        this.seconds = totalSeconds % 3600 % 60;
    }

    // создаем конструкторы
    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    // Создать метод для получения полного количества секунда в объекте
    public int totalSeconds() {
        return seconds + minutes * SECONDS_IN_MINUTE + hours * SECONDS_IN_MINUTE * MINUTES_IN_HOUR;
    }

    // метод для суммирования всех временных интервалов
    // суммируем текущий таймИнтервал(sum) с переданным(seconds)
    public TimeInterval sum(TimeInterval seconds) {
        return new TimeInterval(this.totalSeconds() + seconds.totalSeconds());
    }

    // Созд метод для вывода данных
    public void print() {
        System.out.println("H: " + hours + ", M: " + minutes + ", S: " + seconds);
    }
}
