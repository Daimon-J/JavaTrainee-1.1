package ru.job4j.tracker.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printMethod() {
        System.out.println(" Active: " + active +
                " Status: " + status +
                " Message: " + message
        );
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        Error error2 = new Error(true, 1, "Passed");
        Error error3 = new Error(false, 0, "Not passed");
        error1.printMethod();
        error2.printMethod();
        error3.printMethod();

    }
}
