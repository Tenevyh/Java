package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest [] array= JavarushQuest.values();
        for (JavarushQuest list:array){
            System.out.println(list.ordinal());
        }
    }
}
