package com.hillel.hnatenko.lesson.lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Є дві команди регбі з 25 гравців різного віку у кожній.
//        Вік беремо випадковим чином в діапазоні від 18 до 40.
//        Виведіть у двох рядках вік гравців кожної команди.
//        Порахуйте середній вік гравців кожної команди та виведіть на екран.

        int min = 18;
        int max = 40;
        final int COUNT_PLAYERS = 25;
        int[] team1 = new int[COUNT_PLAYERS];
        int[] team2 = new int[COUNT_PLAYERS];
        for (int i = 0; i < COUNT_PLAYERS; i++) {
            team1[i] = min + (int) (Math.random() * ((max-min)+1));
            team2[i] = min + (int) (Math.random() * ((max-min)+1));
        }
        System.out.println(Arrays.toString(team1));
        System.out.println(Arrays.toString(team2));

        int sumTeam1 = 0;
        int sumTeam2 = 0;

        for (int i = 0; i < COUNT_PLAYERS; i++) {
            sumTeam1 += team1[i];
            sumTeam2 += team2[i];
        }
        System.out.println("Вік гравців першої команди = " + sumTeam1);
        System.out.println("Вік гравців першої команди = " + sumTeam2);

        int averageTeam1 = sumTeam1 / 25;
        int averageTeam2 = sumTeam2 / 25;

        System.out.println("Середній вік гравців першої команди = " + averageTeam1);
        System.out.println("Середній вік гравців першої команди = " + averageTeam2);
    }
}
