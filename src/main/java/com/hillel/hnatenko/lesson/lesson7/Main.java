package com.hillel.hnatenko.lesson.lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Є дві команди регбі з 25 гравців різного віку у кожній.
//        Вік беремо випадковим чином в діапазоні від 18 до 40.
//        Виведіть у двох рядках вік гравців кожної команди.
//        Порахуйте середній вік гравців кожної команди та виведіть на екран.

        int[] team1 = new int[25];
        int[] team2 = new int[25];
        for (int i = 0; i < 25; i++) {
            team1[i] = (int) (18 + Math.random() * 41);
            team2[i] = (int) (18 + Math.random() * 41);
        }
        System.out.println(Arrays.toString(team1));
        System.out.println(Arrays.toString(team2));

        int sumTeam1 = 0;
        int sumTeam2 = 0;

        for (int i = 0; i < 25; i++) {
            sumTeam1 += team1[i];
            sumTeam2 += team2[i];
        }


    }
}
