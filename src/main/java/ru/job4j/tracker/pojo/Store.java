package ru.job4j.tracker.pojo;

public class Store {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);
        Product[] goods = new Product[3];
        goods[0] = milk;
        goods[1] = bread;
        goods[2] = egg;
        for (Product gds : goods) {
            System.out.println(gds.getName() + " - " + gds.getCount());
        }
        System.out.println("Replace milk to oil.");
        Product oil = new Product("Oil", 11);
        goods[0] = oil;
        for (Product gds : goods) {
            System.out.println(gds.getName() + " - " + gds.getCount());
        }
        System.out.println("Shown only product.count > 10");
        for (Product gds : goods) {
            if (gds.getCount() > 10) {
                System.out.println(gds.getName() + " - " + gds.getCount());
            }
        }
    }
}
