package ru.job4j.tracker.pojo;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Daomon Naziuta ");
        license.setModel("Mazda ");
        license.setCode("xx1x2w" );
        license.setCreated(new Date());
        System.out.println(license.getOwner() + license.getModel() + license.getCode());
    }
}
