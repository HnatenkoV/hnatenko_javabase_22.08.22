package com.hillel.hnatenko.lesson.lesson11;

public class Burger {
//    Зробити клас Burger, який матиме поля:
//    булочка, м'ясо, сир, зелень, майонез
//    Зробити три конструктори, які дозволятимуть робити бургери трьох видів:
//    звичайний бургер (усі компоненти)
//    дієтичний бургер (без майонезу)
//    з подвійним м'ясом
//    У кожен конструктор додати виведення в консоль складу даного варіанту бургера (
//    при створенні екземпляра бургера, який використовує даний конструктор - буде виводитися в консоль його склад).
//    Зробити клас BurgerMain, в якому створити три різні бургери. Їхній склад буде автоматично виводитися
//    на екран під час запуску програми.

    String bun;
    String cheese;
    String meat;
    String salad;
    String mayonnaise;
    boolean isDoubleMeat;

    public Burger(String bun, String cheese, String meat, String salad, String mayonnaise) {
        this.bun = bun;
        this.cheese = cheese;
        this.meat = meat;
        this.salad = salad;
        this.mayonnaise = mayonnaise;
        System.out.println("Original " + this);
    }

    public Burger(String bun, String cheese, String meat, String salad) {
        this.bun = bun;
        this.cheese = cheese;
        this.meat = meat;
        this.salad = salad;
        System.out.println("Diet " + this);
    }

    public Burger(String bun, String cheese, String meat, String salad, String mayonnaise, boolean isDoubleMeat) {
        this.bun = bun;
        this.cheese = cheese;
        this.meat = meat;
        this.salad = salad;
        this.mayonnaise = mayonnaise;
        this.isDoubleMeat = isDoubleMeat;
        System.out.println("Double meat" + this);
    }

    @Override
    public String toString() {
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", cheese='" + cheese + '\'' +
                ", meat='" + meat + '\'' +
                ", salad='" + salad + '\'' +
                ", mayonnaise='" + mayonnaise + '\'' +
                ", countMeat=" + (isDoubleMeat ? 2 : 1) +
                '}';
    }
}
