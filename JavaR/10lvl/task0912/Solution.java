/*
Проверка URL-адреса
*/
//Простая схема URL-адреса выглядит так:
//<сетевой протокол>://<название ресурса>.<домен>
public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    //Метод checkProtocol(String) проверяет, какой сетевой протокол (http или https) у URL-адреса, полученного входящим параметром, и возвращает результат проверки — строку название сетевого протокола.
    public static String checkProtocol(String url) {
        boolean urlPrefix = url.startsWith("https");
        boolean urlPrefix1 = url.startsWith("http");
        if (urlPrefix) {
            url = "https";
        }else {

            if (urlPrefix1) {
                url = "http";
            }
        }
        if (urlPrefix == false && urlPrefix1 == false) {
            url="неизвестный";
        }
        return url;

    }

    public static String checkDomain(String url) {
        //checkDomain(String) проверяет, какой домен (com, net, org или ru) у URL-адреса, полученного входящим параметром, и возвращает результат проверки — строку название домена.
        //Если URL-адрес начинается не с http или https, то результат будет — "неизвестный". Если URL-адрес заканчивается не на com, net, org или ru, то результат будет — "неизвестный".
        boolean urlPostfix = url.endsWith("com");
        if (urlPostfix) {
            url = "com";
        }
        boolean urlPostfix1 = url.endsWith("net");
        if (urlPostfix1) {
            url = "net";
        }
        boolean urlPostfix2 = url.endsWith("org");
        if (urlPostfix2) {
            url = "org";
        }
        boolean urlPostfix3 = url.endsWith("ru");
        if (urlPostfix3) {
            url = "ru";
        }
        if (urlPostfix == false && urlPostfix1 == false && urlPostfix2 == false && urlPostfix3 == false) {
            url = "неизвестный";
        }
        return url;


    }
}
