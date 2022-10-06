package com.hillel.hnatenko.lesson.lesson15;

public enum DrinksMachine {
    COFFEE("КАВА"),
    TEA("ЧАЙ"),
    LEMONADE("ЛИМОНАД"),
    MOJITO("МОХІТО"),
    SODA("МИНЕРАЛКА"),
    COCA_COLA("КОКА_КОЛА");

    private String tittle;

    DrinksMachine(String tittle) {
        this.tittle = tittle;
    }

}
