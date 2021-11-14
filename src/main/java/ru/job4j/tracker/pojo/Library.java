package ru.job4j.tracker.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", 434);
        Book book2 = new Book("Head First", 567);
        Book book3 = new Book("Four Sisters", 324);
        Book[] library = new Book[3];
        library[0] = book1;
        library[1] = book2;
        library[2] = book3;
        for (Book lb : library) {
            System.out.println(lb.getName() + " - " + lb.getPages());
        }
        System.out.println("Repalce books------------------|");
        Book temp = library[0];
        library[0] = library[2];
        library[2] = temp;
        for (Book lb : library) {
            System.out.println(lb.getName() + " - " + lb.getPages());
        }
        System.out.println("Print book ----------------|");
        for (Book lb : library) {
            if ("Clean Code".equals(lb.getName())){
                System.out.println(lb.getName() + " - " + lb.getPages());
            }
        }
    }
}
