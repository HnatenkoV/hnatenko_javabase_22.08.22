package com.hillel.hnatenko.lesson.lesson13;

public class Main {
    public static void main(String[] args) {

//    Зробіть клас MusicStyles, який міститиме метод playMusic()
//    Зробіть його спадкоємців: PopMusic, RockMusic і ClassicMusic.
//    Спадкоємці повинні реалізовувати метод playMusic().
//    У мейн-класі створіть музичні гурти для кожного стилю
//    За допомогою методу for each викличте у всіх спадкоємців MusicStyles метод playMusic()
//
//    MusicStyles Maroon5 = new PopMusic();
//    MusicStyles Coldplay = new RockMusic();
//    MusicStyles FranzSchubert = new ClassicMusic();
//
//    Maroon5.playMusic();
//    Coldplay.playMusic();
//    FranzSchubert.playMusic();

        MusicStyles[] styles = {
                new PopMusic("Maroon5"),
                new RockMusic("Coldplay"),
                new ClassicMusic("FranzSchubert")
        };

        for (MusicStyles MusicStyles : styles) {
            MusicStyles.playMusic();
        }

    }
}
