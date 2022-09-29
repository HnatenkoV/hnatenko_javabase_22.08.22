package com.hillel.hnatenko.lesson.lesson12;

public class Fitness {
    private final String name;
    private final int birthDay;
    private final String birthMonth;
    private final int birthYear;
    private final String email;
    private final long phoneNumber;
    public String lastname;
    public int weight;
    public String  pressure;
    public int steps;
    int nowYear = 2020;
    public int age;

    public String getName() {
        return name;
    }

    public int getBirthDay() {
        return birthDay;
    }


    public String getBirthMonth() {
        return birthMonth;
    }


    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }


    public Fitness(String name, int birthDay, String birthMonth, int birthYear, String email, long phoneNumber, String lastname, int weight, String pressure, int steps, int age) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.lastname = lastname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.age = nowYear - birthYear;
    }
}