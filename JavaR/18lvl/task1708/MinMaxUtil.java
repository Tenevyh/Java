/*
Минимальное и максимальное
В этой задаче тебе предстоит создать универсальный инструмент для поиска минимальных и максимальных чисел.
В классе MinMaxUtil создай публичные статические методы min() и max(), которые в качестве аргументов принимают целочисленные (тип int) значения и возвращают минимальное и максимальное из них соответственно.

Каждый из методов должен быть перегружен так, чтобы была возможность вызвать метод с двумя, тремя, четырьмя и пятью параметрами.
В общем, необходимо создать 8 методов, — 4 для min() и 4 для max().
Все аргументы методов должны быть типа int.
*/

public class MinMaxUtil {
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int min(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }

    public static int min(int a, int b, int c, int d) {
        if (a < b && a < c && a < d) {
            return a;
        } else if (b < a && b < c && b < d) {
            return b;
        } else if (c < a && c < b && c < d) {
            return c;
        } else {
            return d;
        }
    }

    public static int min(int a, int b, int c, int d, int e) {
        if (a < b && a < c && a < d && a < e) {
            return a;
        } else if (b < a && b < c && b < d && b < e) {
            return b;
        } else if (c < a && c < b && c < d && c < e) {
            return c;
        } else if (d < a && d < b && d < c && d < e) {
            return d;
        } else {
            return e;
        }
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static int max(int a, int b, int c, int d) {
        if (a > b && a > c && a > d) {
            return a;
        } else if (b > a && b > c && b > d) {
            return b;
        } else if (c > a && c > b && c > d) {
            return c;
        } else {
            return d;
        }
    }

    public static int max(int a, int b, int c, int d, int e) {
        if (a > b && a > c && a > d && a > e) {
            return a;
        } else if (b > a && b > c && b > d && b > e) {
            return b;
        } else if (c > a && c > b && c > d && c > e) {
            return c;
        } else if (d > a && d > b && d > c && d > e) {
            return d;
        } else {
            return e;
        }
    }
}