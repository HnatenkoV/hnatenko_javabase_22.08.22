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
            team1[i] = 18 + (int) (Math.random() * ((40-18)+1));
            team2[i] = 18 + (int) (Math.random() * ((40-18)+1));
        }
        System.out.println(Arrays.toString(team1));
        System.out.println(Arrays.toString(team2));

        int sumTeam1 = 0;
        int sumTeam2 = 0;

        for (int i = 0; i < 25; i++) {
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
