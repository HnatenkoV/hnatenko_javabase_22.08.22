package com.hillel.hnatenko.lesson.lesson12;

public class Main {
    public static void main(String[] args) {
//        Зробіть програму для фітнес трекера, яка реєструватиме нового користувача створюючи йому обліковий запис,
//        приймаючи наступні параметри:
//        Незмінні (задаються тільки при створенні облікового запису, і можуть бути отримані лише за допомогою гетерів):
//        Ім'я
//        Дата народження (окремо день, місяць, рік)
//        Емейл
//                Телефон
//        Змінювані:
//        Прізвище
//                Вага
//        Тиск
//        Кількість пройдених за день кроків
//        Створювати кожного користувача необхідно через конструктор, беручи всі поля на вхід конструктора.
//                Додати метод printAccountInfo(), при виклику якого друкувати всі дані про користувача
//        Після прийому року народження - вираховувати вік користувача у внутрішню змінну age (відштовхуючись
//        просто від 2020 року, ускладнювати тут не будемо), на яку зробити тільки геттер і виводити на екран разом з
//        іншими полями в методі printAccountInfo(); у конструкторі або геттерах/сеттерах не використовуємо виведення в консоль.
//        У main-класі створити 3-5 користувачів та роздрукувати дані кожного через виклик методу printAccountInfo();
//        для двох користувачів змінити кілька полів та роздрукувати нові дані повторно



        Fitness user1 = new Fitness("Vadim", 27, "April",1993, "vadim01@gmail.com",
                123456789, "Hnatenko", 80, "120/80", 3000);
        Fitness user2 = new Fitness("Zinedine", 23, "June",1972, "zizou@gmail.com",
                879871653, "Zidane", 100, "127/85", 5000);
        Fitness user3 = new Fitness("Lionel", 24, "June",1987, "messi@gmail.com",
                777865445, "Messi", 67, "119/90", 9000);
        Fitness user4 = new Fitness("Cristiano", 5, "February",1985, "ronaldo@gmail.com",
                989898375, "Ronaldo", 96, "117/83", 7000);

        int nowYear = 2020;
        user1.age = nowYear - user1.getBirthYear();
        user2.age = nowYear - user2.getBirthYear();
        user3.age = nowYear - user3.getBirthYear();
        user4.age = nowYear - user4.getBirthYear();


        printAccountInfo(user1);
        printAccountInfo(user2);
        printAccountInfo(user3);
        printAccountInfo(user4);

        System.out.println("user1 " + printAccountInfo(user1));
        System.out.println();
        System.out.println("user2 " + printAccountInfo(user2));
        System.out.println();
        System.out.println("user3 " + printAccountInfo(user3));
        System.out.println();
        System.out.println("user4 " + printAccountInfo(user4));

        user2.weight = 110;
        user2.steps = 11000;

        System.out.println();
        System.out.println("user2 new " + printAccountInfo(user2));
        System.out.println();

        user4.pressure = "121/90";
        user4.steps = 15000;
        System.out.println("user4 new " + printAccountInfo(user4));

    }

    static String printAccountInfo(Fitness fitness) {

        return "Ім'я: " + fitness.getName() + " " + "День нарождення: " + fitness.getBirthDay() + " " +
                "Місяць народження: " + fitness.getBirthMonth() + " " +
                "Рік народження: " + fitness.getBirthYear() + " " +
                "Емейл: " + fitness.getEmail() + " " + "Телефон: " + fitness.getPhoneNumber() + " " +
                "Прізвище: " + fitness.lastname + " " + "Вага: " + fitness.weight + " " + "Тиск: " + fitness.pressure + " " +
                "Кількість кроків: " + fitness.steps + " " + "Вік користувача: " + fitness.getAge();
    }

}
