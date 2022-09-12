package com.hillel.hnatenko.lesson.lesson8;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


//        Зробити два масиви з 7 цифр, заповнених випадковими цифрами (від 0 до 9).
//
//        Перший масив - це числа, які загадані фірмою-організатором лотереї.
//
//        Другий масив - це числа, які вгадав гравець.
//
//        Після того, як обидва масиви заповнені цифрами, потрібно відсортувати їх за зростанням будь-яким способом.
//
//        У відсортованих масивах визначити кількість збігів, тобто чисел у двох масивах з однаковим індексом;
//        Наприклад:
//        first[3] повинен дорівнювати second[3], як показано нижче.
//
//        Приклад виведення в консоль (збіглися 1й, 4й та 6й елементи):
//
//          [0, 1, 4, 5, 5, 8, 9]
//          [1, 1, 2, 3, 5, 6, 9]
//
//        Кількість збігів: 3

        int max = 9;
        final int COUNT_PLAYERS = 7;
        int[] array1 = new int[COUNT_PLAYERS];
        int[] array2 = new int[COUNT_PLAYERS];

        for (int i = 0; i < COUNT_PLAYERS; i++) {
            array1[i] = (int) (Math.random() * (max + 1));
            array2[i] = (int) (Math.random() * (max + 1));

        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println();

        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        int counter = 0;
        for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array2[i])
                    counter++;
            }
         System.out.println("Кількість збігів: " + counter);
    }
}


