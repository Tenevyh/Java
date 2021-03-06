/*
Построим новый жилой комплекс JavaRush Towers
Давай построим жилой комплекс из трех высоток. Для этого мы будем использовать три разных способа вывода информации:
Объявляет о результате постройки.
Объявляет о результате и указывает количество этажей.
Объявляет о результате и указывает застройщика.
Пример вывода:
Небоскреб построен.
Небоскреб построен. Количество этажей - 50
Небоскреб построен. Застройщик - JavaRushDevelopment

Для решения задания тебе нужно объявить три разных конструктора и в них выводить текст.
Метод main не участвует в тестировании.
*/

public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";
    public Skyscraper(int a){
        String skyscraper=this.SKYSCRAPER_WAS_BUILD_FLOORS_COUNT+a;
        System.out.println(skyscraper);
    }
    public Skyscraper(String sky) {
        String skyscraper=this.SKYSCRAPER_WAS_BUILD_DEVELOPER+sky;
        System.out.println(skyscraper);
    }

    public Skyscraper(){
        System.out.println(this.SKYSCRAPER_WAS_BUILD);
    }

    //напишите тут ваш код

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}

