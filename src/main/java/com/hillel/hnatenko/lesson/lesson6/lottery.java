package com.hillel.hnatenko.lesson.lesson6;

import java.util.Scanner;

public class lottery {
    public static void main(String[] args) {

        int number = (int) (Math.random() * 11);
        System.out.println(number);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть цифру від 0 до 10");
        for (int i = 0; i < 3; i++) {
            System.out.println("спроба " + (i + 1));
            do {
                if (scanner.hasNextInt()) {
                    int answer = scanner.nextInt();
                    if (answer == number) {
                        System.out.println("ви виграли");
                        break;
                    } else {
                        System.out.println("ви програли");
                    }
                } else {
                    System.out.println("WRONG DATA, TRY AGAIN");
                    scanner.nextLine();
                }
            } while (true);
        }

        }

    }
