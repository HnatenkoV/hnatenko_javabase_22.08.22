package com.hillel.hnatenko.lesson.lesson4;

public class Main {
    public static void main(String[] args) {
        int warriorLI = 13;
        int archerLI = 24;
        int riderLI = 46;

        int warriorMin = 9;
        int archerMin = 35;
        int riderMin = 12;

        double total = (860 * 1.5);
        int totalMin = (int) total;

        int attackLi = (warriorLI * 860) + (archerLI * 860) + (riderLI * 860);

        int attackMin = (warriorMin * totalMin) + (archerMin * totalMin) + (riderMin * totalMin);

        System.out.println("Загальна атака армії Лі = " + attackLi  + "\u002C" + "Загальна атака армії Мін = " + attackMin);


    }
}
