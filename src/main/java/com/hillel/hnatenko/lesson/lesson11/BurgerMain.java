package com.hillel.hnatenko.lesson.lesson11;

public class BurgerMain extends Burger {
    public BurgerMain(String bun, String cheese, String meat, String salad, String mayonnaise) {
        super(bun, cheese, meat, salad, mayonnaise);
    }

    public BurgerMain(String bun, String cheese, String meat, String salad) {
        super(bun, cheese, meat, salad);
    }

    public BurgerMain(String bun, String cheese, String meat, String salad, String mayonnaise, boolean isDoubleMeat) {
        super(bun, cheese, meat, salad, mayonnaise, isDoubleMeat);
    }

    public static void main(String[] args) {
        BurgerMain original = new BurgerMain("sesame", "gouda", "chicken","green", "provence");
        Burger diet = new Burger("sesame", "gouda", "chicken","green");
        Burger freeMeat = new Burger("sesame", "gouda", "chicken","green", "provence", true);


    }
}
