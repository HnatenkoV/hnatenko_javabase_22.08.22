package com.hillel.hnatenko.lesson.lesson14;

public class IPhones implements Smartphones{

    @Override
    public void call() {
        System.out.println("iPhones call...");
    }

    @Override
    public void sms() {
        System.out.println("iPhones sms...");
    }

    @Override
    public void internet() {
        System.out.println("iPhones internet...");
    }
}
