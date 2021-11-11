package ru.job4j.tracker.oop;

public class Jukebox {

    public void music(int position){
        if (position == 1){
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2){
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        int pos1 = 1;
        Jukebox track1 = new Jukebox();
        track1.music(pos1);
        int pos2 = 2;
        Jukebox track2 = new Jukebox();
        track2.music(pos2);
        int pos3 = 24;
        Jukebox unknown = new Jukebox();
        unknown.music(pos3);
    }
}
