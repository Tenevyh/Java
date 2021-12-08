package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
В enum Month добавь 4 метода: getWinterMonths(), getSpringMonths(), getSummerMonths(), getAutumnMonths() которые будут возвращать массив с тремя месяцами.
*/

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        Month[] array1 = {Month.DECEMBER, Month.JANUARY, Month.FEBRUARY};
        return array1;
    }

    public static Month[] getSpringMonths() {
        Month[] array1 = {Month.MARCH, Month.APRIL, Month.MAY};
        return array1;
    }

    public static Month[] getSummerMonths() {
        Month[] array1 = {Month.JUNE, Month.JULY, Month.AUGUST};
        return array1;
    }

    public static Month[] getAutumnMonths() {
        Month[] array1 = {Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER};
        return array1;
    }
}