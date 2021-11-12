package ru.job4j.tracker.oop;

public class Computer {

    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    public Computer() {
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
        Computer computer2 = new Computer(true, 256, "AMD Ryzen 5 3600");
        Computer computer3 = new Computer();
        computer1.printInfo();
        computer2.printInfo();
        computer3.printInfo();
    }
}
