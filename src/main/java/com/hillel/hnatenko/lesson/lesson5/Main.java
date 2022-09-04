package com.hillel.hnatenko.lesson.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first team name");
        String firstTeam = scanner.nextLine();
        System.out.println("You entered: " + firstTeam);

        int firstTeamPlayer1 = -1;
        System.out.println("Please enter frags for firstTeamPlayer1");
        if (scanner.hasNextInt()) {
            firstTeamPlayer1 = scanner.nextInt();
            System.out.println("You entered number: " + firstTeamPlayer1);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }

        int firstTeamPlayer2 = -1;
        System.out.println("Please enter frags for firstTeamPlayer2");
        if (scanner.hasNextInt()) {
            firstTeamPlayer2 = scanner.nextInt();
            System.out.println("You entered number: " + firstTeamPlayer2);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }

        int firstTeamPlayer3 = -1;
        System.out.println("Please enter frags for firstTeamPlayer3");
        if (scanner.hasNextInt()) {
            firstTeamPlayer3 = scanner.nextInt();
            System.out.println("You entered number: " + firstTeamPlayer3);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }

        int firstTeamPlayer4 = -1;
        System.out.println("Please enter frags for firstTeamPlayer4");
        if (scanner.hasNextInt()) {
            firstTeamPlayer4 = scanner.nextInt();
            System.out.println("You entered number: " + firstTeamPlayer4);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }

        int firstTeamPlayer5 = -1;
        System.out.println("Please enter frags for firstTeamPlayer5");
        if (scanner.hasNextInt()) {
            firstTeamPlayer5 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("You entered number: " + firstTeamPlayer5);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }

        System.out.println("Please enter second team name");
        String secondTeam = scanner.nextLine();
        System.out.println("You entered: " + secondTeam);

        int secondTeamPlayer1 = -1;
        System.out.println("Please enter frags for secondTeamPlayer1");
        if (scanner.hasNextInt()) {
            secondTeamPlayer1 = scanner.nextInt();
            System.out.println("You entered number: " + secondTeamPlayer1);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }

        int secondTeamPlayer2 = -1;
        System.out.println("Please enter frags for secondTeamPlayer2");
        if (scanner.hasNextInt()) {
            secondTeamPlayer2 = scanner.nextInt();
            System.out.println("You entered number: " + secondTeamPlayer2);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }

        int secondTeamPlayer3 = -1;
        System.out.println("Please enter frags for secondTeamPlayer3");
        if (scanner.hasNextInt()) {
            secondTeamPlayer3 = scanner.nextInt();
            System.out.println("You entered number: " + secondTeamPlayer3);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }

        int secondTeamPlayer4 = -1;
        System.out.println("Please enter frags for secondTeamPlayer4");
        if (scanner.hasNextInt()) {
            secondTeamPlayer4 = scanner.nextInt();
            System.out.println("You entered number: " + secondTeamPlayer4);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }

        int secondTeamPlayer5 = -1;
        System.out.println("Please enter frags for secondTeamPlayer5");
        if (scanner.hasNextInt()) {
            secondTeamPlayer5 = scanner.nextInt();
            System.out.println("You entered number: " + secondTeamPlayer5);
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit(0);
        }

        int firstTeamResult =(firstTeamPlayer1 + firstTeamPlayer2 + firstTeamPlayer3 + firstTeamPlayer4 + firstTeamPlayer5);
        double firstTeamScore = (double)  firstTeamResult/ 5;
        int secondTeamResult = (secondTeamPlayer1 + secondTeamPlayer2 + secondTeamPlayer3 + secondTeamPlayer4 + secondTeamPlayer5);
        double secondTeamScore = (double)  secondTeamResult/ 5;

        if (firstTeamResult > secondTeamResult) {
              System.out.println("Перемогла команда " + firstTeam + " набравши " + firstTeamScore + " очків");
          } else if (firstTeamResult < secondTeamResult) {
              System.out.println("Перемогла команда " + secondTeam + " набравши " + secondTeamScore + " очків");
        } else {
            System.out.println("Воу воу та це ж нічия " + firstTeam  + " і " + secondTeam  + " набрали однакову кількість очків");
        }

        scanner.close();



    }
}