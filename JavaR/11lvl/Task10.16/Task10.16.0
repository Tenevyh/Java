/*
Прогноз погоды
У класса City есть два поля - название города и текущая температура воздуха. Также в классе Solution есть метод showWeather: он выводит в консоли информацию о погоде в городе, который передан в качестве аргумента метода. Реализуй метод showWeather, который должен выводить в консоли информацию в таком формате: В городе "название города" сегодня температура воздуха "температура в городе"
В методе main один раз нужно вызвать метод showWeather с нужным аргументом.

Пример вывода:
В городе Дубай сегодня температура воздуха 40
*/


public class Solution {

    public static void showWeather(City city) {
        City obj=new City(city.getName(), city.getTemperature());
        String a=obj.getName();
        int b=obj.getTemperature();
        System.out.println("В городе "+ a+" сегодня температура воздуха "+b);
    }

    public static void main(String[] args) {
        City city=new City("Moscow",5);
        showWeather(city);
    }
}
