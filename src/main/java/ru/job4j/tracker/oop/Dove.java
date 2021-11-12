package ru.job4j.tracker.oop;

public class Dove {

    private String food;
    private String name;

    public void show() {
        System.out.println(this.name + this.food);
    }

    public void eat(String grain){
        this.food = grain;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("Larkin is eating");
        Dove larkin = new Dove();
        larkin.eat("Peas");
        larkin.giveNick("Larkin: ");
        larkin.show();
        System.out.println("Bark is eating");
        Dove bark = new Dove();
        bark.eat("Corn");
        bark.giveNick("Bark: ");
        bark.show();
    }
}
