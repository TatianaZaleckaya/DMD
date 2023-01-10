package oop;

import java.sql.Time;

/** Создать класс, описывающий промежуток времению
 * Сам промежуток времени должен задаваться тремя свойствами:
 * секундами, минутами, часамию
 * Создать метод для получения полного количества секунд в объекте
 * Создать два конструктора: первый принимает общее количество секунд, второй часы, минуты и секунды по отдельности.
 * Создать метод для вывода данных
 */
public class TimeIntervalRunner {

    public static void main(String[] args) {

        TimeInterval timeInterval = new TimeInterval(30, 2, 1);
        System.out.println(timeInterval.totalSeconds());

        TimeInterval timeInterval2 = new TimeInterval(timeInterval.totalSeconds());
        System.out.println(timeInterval2.totalSeconds());
        timeInterval2.print();


        TimeInterval sumIntervals = timeInterval.sum(timeInterval2);

        sumIntervals.print();
    }
}
