package com.ggg.oop.task1;

/* Создать класс, описывающий промежуток времени.
Сам промежуток времени должен задаваться 3 свойствами:
секундами, минутами и часами.
Создать метод для получения полного количества секунда в объекте
Созд 2 конструктора: 1 - принимает общее колич секунд,
2 - часы, минуты и секунды по отдельности.
Созд метод для вывода данных.
* */

public class TimeIntervalRunner {

    public static void main(String[] args) {
        TimeInterval timeInterval = createTimeInterval();

        TimeInterval timeInterval1 = new TimeInterval(timeInterval.totalSeconds());
        System.out.println(timeInterval1.totalSeconds());
        timeInterval1.print();

        TimeInterval sumIntervals = timeInterval.sum(timeInterval1);
        sumIntervals.print();
    }

    private static TimeInterval createTimeInterval() {
        TimeInterval timeInterval = new TimeInterval(30, 2, 1);
        System.out.println(timeInterval.totalSeconds());
        return timeInterval;
    }
}
