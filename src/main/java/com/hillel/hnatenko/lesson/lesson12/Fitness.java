package com.hillel.hnatenko.lesson.lesson12;

public class Fitness {
    private String name;
    private int birthDay;
    private String birthMonth;
    private int birthYear;
    private String email;
    private long phoneNumber;
    public String lastname;
    public int weight;
    public String  pressure;
    public int steps;
    public int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long l) {
        this.phoneNumber = phoneNumber;
    }


    public Fitness(String name, int birthDay, String birthMonth, int birthYear, String email, long phoneNumber,
                   String lastname, int weight, String pressure, int steps) {
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


    }
}
