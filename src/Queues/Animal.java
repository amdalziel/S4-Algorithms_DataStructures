package Queues;

import java.util.Date;

public class Animal {

    private String name;
    private Boolean isCat;
    private Date intakeDate;


    public Animal(String name, Boolean isCat) {
        this.name = name;
        this.isCat = isCat;
        this.intakeDate = new Date();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getCat() {
        return isCat;
    }

    public void setCat(Boolean cat) {
        isCat = cat;
    }

    public Date getIntakeDate() {
        return intakeDate;
    }

    public void setIntakeDate(Date intakeDate) {
        this.intakeDate = intakeDate;
    }


    @Override
    public String toString() {
        return "Name: " + this.name + ", Animal Type: " + (this.getCat() ? "cat" : "dog") + ", Intake Date: " + this.intakeDate;
    }

}
