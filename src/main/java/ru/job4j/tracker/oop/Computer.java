package ru.job4j.tracker.oop;

public class Computer {

    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    public Computer() {
    }

    public Computer(int ssd, String cpu) {
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu);
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer(true, 500, "Intel Core I7-10700K");
        computer1.printInfo();
        Computer computer2 = new Computer(true, 256, "AMD Ryzen 5 3600");
        computer2.printInfo();
        Computer computer3 = new Computer();
        computer3.printInfo();
        Computer first = new Computer(true, 500, "Intel Core I7-10700K");
        first.printInfo();
        Computer second = new Computer(256, "AMD Ryzen 5 3600");
        second.printInfo();
    }
}
