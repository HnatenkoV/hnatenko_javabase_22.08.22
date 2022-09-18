package com.hillel.hnatenko.lesson.lesson9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Транспонуйте матрицю M x N. Розміри M та N задаються з консолі.
//        Після введення повинні автоматично створюватися два масиви розміром M x N перший та N x M другий.

        Scanner scanner = new Scanner(System.in);


        System.out.println("введіть розміри масиву: ");
        int M = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                M = scanner.nextInt();
                break;
            }
            else {
                System.out.println("wrong data, try again");
                scanner.nextLine();
            }
        }
        System.out.println("your number: " + M);

        int N = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                break;
            } if (N > M){
                System.out.println("try againe");
                scanner.nextLine();
            }
            else {
                System.out.println("wrong data, try again");
                scanner.nextLine();
            }
        }
        System.out.println("your number: " + N);


        int[][] array = new int[M][N];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 101);
            }
        }
        System.out.println("before");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        System.out.println("after");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }


        scanner .close();
    }
}
