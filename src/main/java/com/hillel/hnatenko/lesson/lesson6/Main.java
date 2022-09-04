package com.hillel.hnatenko.lesson.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       int counter = 0;
        for (int i = 1; i <= 155; i++) {
            if ((i / 10 == 4) || (i / 10 == 9) || (i % 10 == 4) || (i % 10 == 9) || ((i % 100)/10 == 4)) {
                continue;
            }
            System.out.println(i);
            counter++;
        }

        System.out.println("counter shuttle: " + counter);


    }
}
