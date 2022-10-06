package com.hillel.hnatenko.lesson.lesson15;

import java.util.Arrays;
import java.util.Scanner;

//Інструменти для використання:
//        1) enum (напої)
//        2) константи (ціни)
//        3) static (загальна вартість)
//        4) switch (вибір напою)
//
//        Завдання:
//
//        #1 зробіть enum DrinksMachine, який вміє робити КАВУ, ЧАЙ, ЛИМОНАД, МОХІТО, МИНЕРАЛКУ, КОКА_КОЛУ;
//        #2 Зробіть клас Drinks, де константами задайте ціну напою;
//        #3 Зробіть підрахунок кількості виготовлених напоїв та загальної суми, яку повинен заплатити клієнт;
//        #4 Зробіть спосіб приготування кожного напою;
//        #5 Зробіть switch-case оператор, який буде робити напій (викликаючи відповідний метод) в залежності від вибору клієнта;
//        #6 Додайте можливість вибору напою для користувача і залежно від вибору робіть йому напій;
//        #7 Користувач повинен мати можливість замовити кілька напоїв
//        #8 І насамкінець клієнт має побачити, скільки грошей він повинен заплатити;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int totalPrise = 0;


    public static void main(String[] args) {
        run();
        System.out.println(DrinksCount.counter);
        System.out.println(totalPrise);
        scanner.close();
    }
    public static void run() {


        System.out.println("Оберіть напій із списку:\n" +
                "    COFFEE(\"КАВА\") - 55грн.,\n" +
                "    TEA(\"ЧАЙ\") - 30грн.,\n" +
                "    LEMONADE(\"ЛИМОНАД\") - 70грн.,\n" +
                "    MOJITO(\"МОХІТО\") - 75грн.,\n" +
                "    SODA(\"МИНЕРАЛКА\") - 32грн.,\n" +
                "    COCA_COLA(\"КОКА_КОЛА\") - 35грн.;");

        while (true) {
            DrinksMachine drinksMachine = getDrink();
            if (drinksMachine == null) {
                return;
            }

            switch (drinksMachine) {
                case COFFEE:
                    System.out.print("Ви вибрали каву! з ціною " + Drinks.CoffeePrise + "грн.");
                    totalPrise += Drinks.CoffeePrise;
                    break;
                case TEA:
                    System.out.print("Ви вибрали чай! з ціною " + Drinks.TeaPrise + "грн.");
                    totalPrise += Drinks.TeaPrise;
                    break;
                case LEMONADE:
                    System.out.print("Ви вибрали лимонад! з ціною " + Drinks.LemonadePrise + "грн.");
                    totalPrise += Drinks.LemonadePrise;
                    break;
                case MOJITO:
                    System.out.print("Ви вибрали мохіто! з ціною " + Drinks.MojitoPrise + "грн.");
                    totalPrise += Drinks.MojitoPrise;
                    break;
                case SODA:
                    System.out.print("Ви вибрали мінералку! з ціною " + Drinks.SodaPrise + "грн.");
                    totalPrise += Drinks.SodaPrise;
                    break;
                case COCA_COLA:
                    System.out.print("Ви вибрали кокаколу! з ціною " + Drinks.CocaColaPrise + "грн.");
                    totalPrise += Drinks.CocaColaPrise;
                    break;
            }
        }
    }

        private static DrinksMachine getDrink() {
            System.out.println(" виберіть напій");
            while (true) {
                String str = scanner.next().toUpperCase();

                if(str.equals("STOP")) {
                    return null;
                }

                for (DrinksMachine value : DrinksMachine.values()) {
                    if(str.equals(value.toString())) {
                        return DrinksMachine.valueOf(str);
                    }

                }
            }
        }

    }






