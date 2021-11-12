package ru.job4j.tracker.oop;

public class DummyDic {

    public String engToRus(String eng) {
        String word = "Неизвестное слово." + eng;
        return word;
    }

    public static void main(String[] args) {
        DummyDic dummy = new DummyDic();
        String unknown = dummy.engToRus("Okkdd");
        System.out.println(unknown);
    }
}
