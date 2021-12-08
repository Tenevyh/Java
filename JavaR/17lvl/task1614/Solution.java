package com.javarush.task.pro.task16.task1614;

import java.time.Instant;

/* 
Конец времен
В классе Solution реализуй три метода:

в методе getMaxFromMilliseconds верни максимальный Instant, который можно получить с помощью метода ofEpochMilli(long milliseconds);
в методе getMaxFromSeconds верни максимальный Instant, который можно получить с помощью метода ofEpochSecond(long seconds);
в методе getMaxFromSecondsAndNanos верни максимальный Instant, который можно получить с помощью метода ofEpochSecond(long seconds, long nanos).
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        Instant max=Instant.ofEpochMilli(Long.MAX_VALUE);

        return max;
    }

    static Instant getMaxFromSeconds() {
        Instant max=Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
        return max;
    }

    static Instant getMaxFromSecondsAndNanos() {
        Instant max=Instant.ofEpochSecond(Instant.MAX.getEpochSecond(), 999999999);
        return max;
    }
}
