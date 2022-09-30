package com.hillel.hnatenko.lesson.lesson14;


//    Зробіть інтерфейс Smartphones, який має містити методи call(), sms(), internet()
//    Зробіть класи, які його імплементують: Androids, iPhones.
//    Андроїди повинні також імплементувати LinuxOS, айфони повинні імплементувати iOS
//    Створіть екземпляри кожного виду у мейн-класі

public class Main {
    public static void main(String[] args) {

        Androids androids = new Androids();
        androids.call();
        androids.sms();
        androids.internet();
        androids.haveLinux();
        System.out.println();

        IPhones iPhones = new IPhones();
        iPhones.call();
        iPhones.sms();
        iPhones.internet();
        iPhones.haveIos();

    }
}
