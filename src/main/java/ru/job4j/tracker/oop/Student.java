package ru.job4j.tracker.oop;

public class Student {

    public void music(String lyrics) {
        System.out.println(lyrics);
    }

    public void song(String lyrics) {
        System.out.println(lyrics);
    }

    public static void main(String[] args) {
        Student daimon = new Student();
        String song = "I believe, I can fly";
        String song2 = "And you can";
        daimon.music(song);
        daimon.song(song2);
        daimon.music(song);
        daimon.song(song2);
        daimon.music(song);
        daimon.song(song2);
    }
}
