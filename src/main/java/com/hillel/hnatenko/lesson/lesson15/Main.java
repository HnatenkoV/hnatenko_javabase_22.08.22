package com.hillel.hnatenko.lesson.lesson15;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;

import static com.hillel.hnatenko.lesson.lesson15.DrinksMachine.*;

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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            DrinksMachine drinksMachine = null;
            DrinksMachine[] drinksMachines = DrinksMachine.values();
            System.out.println("Оберіть напій із списку:\n" +
                    "    COFFEE(\"КАВА\") - 55грн.,\n" +
                    "    TEA(\"ЧАЙ\") - 30грн.,\n" +
                    "    LEMONADE(\"ЛИМОНАД\") - 70грн.,\n" +
                    "    MOJITO(\"МОХІТО\") - 75грн.,\n" +
                    "    SODA(\"МИНЕРАЛКА\") - 32грн.,\n" +
                    "    COCA_COLA(\"КОКА_КОЛА\") - 35грн.;");
            while (true) {
                String userValue = scanner.nextLine().toUpperCase();
                for (DrinksMachine type : drinksMachines) {
                    if (userValue.equals(type.toString())) {
                        drinksMachine = type;
                        break;
                    }
                }
                if (drinksMachine != null) {
                    break;
                } else {
                    System.out.println("Wrong data, try again!");
                }
            }

            int prise = 0;
            switch (drinksMachine) {
                case COFFEE:
                    System.out.print("Ви вибрали каву! з ціною " + Drinks.CoffeePrise + "грн.");
                    break;
                case TEA:
                    System.out.print("Ви вибрали чай! з ціною " + Drinks.TeaPrise + "грн.");
                    break;
                case LEMONADE:
                    System.out.print("Ви вибрали лимонад! з ціною " + Drinks.LemonadePrise + "грн.");
                    break;
                case MOJITO:
                    System.out.print("Ви вибрали мохіто! з ціною " + Drinks.MojitoPrise + "грн.");
                    break;
                case SODA:
                    System.out.print("Ви вибрали мінералку! з ціною " + Drinks.SodaPrise + "грн.");
                    break;
                case COCA_COLA:
                    System.out.print("Ви вибрали кокаколу! з ціною " + Drinks.CocaColaPrise + "грн.");
                    break;
            }


        } while (true);




    }


}



