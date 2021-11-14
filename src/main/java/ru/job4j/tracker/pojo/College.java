package ru.job4j.tracker.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setInitials("Mark Rurikov");
        student.setGroup(100);
        student.setCreatedDate(new Date());
        System.out.println(
                "Initials: " + student.getInitials() +
                        " Group: " + student.getGroup() +
                        " Date: " + student.getCreatedDate()
        );
    }
}

