package com.hillel.hnatenko.lesson.lesson10;

public class Person {

    //        Зробити клас Person та в ньому метод personInfo()
//        На вхід передавати йому чотири параметри: ім'я, прізвище, місто, телефон
//        Всередині методу формувати рядок у форматі:
//        Зателефонувати громадянину + ІМ'Я ПРІЗВИЩЕ + із міста + МІСТО можна за номером + ТЕЛЕФОН
//        Метод має повертати String
//        У main-методі зробити три виклики методу personInfo, щоразу передаючи нову людину;
//        Повинен вийти висновок такого типу:
//        Зателефонувати громадянинові Will Smith з міста New York можна за номером 2936729462846.
//        Зателефонувати громадянинові Jackie Chan з міста Shanghai можна за номером 12312412412.
//        Зателефонувати до громадян Sherlock Holmes з міста London можна за номером 37742123513.



    public static void main(String[] args) {
//        String name = "Will";
//        String surname = "Smith";
//        String town = "New York";
//        long number = Long.parseLong("2936729462846L");


        String personFirst = personInfo("Jackie", "Chan", "Shanghai", Long.parseLong("12312412412"));
        String personSecond = personInfo("Sherlock", "Holmes", "London", Long.parseLong("37742123513"));
        String personThird = personInfo("Will", "Smith", "New York", Long.parseLong("2936729462846"));


        System.out.println(personFirst);
        System.out.println(personSecond);
        System.out.println(personThird);
    }

    static String personInfo(String name, String surname, String town, long number) {
        return "Зателефонувати громадянину " + name + " " + surname + " із міста " + town + " можна за номером " + number;
    }

}
