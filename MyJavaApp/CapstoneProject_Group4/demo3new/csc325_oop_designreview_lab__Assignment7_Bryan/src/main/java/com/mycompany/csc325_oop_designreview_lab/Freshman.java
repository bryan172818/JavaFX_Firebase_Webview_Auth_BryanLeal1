package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {

    // Declare instance variables for name, age, and credits
    private String name;
    private int age;
    private int credits;
    private double gpa;

    // Constructor for the Freshman class
    public Freshman(String name, int age, int credits) {
        super(name, age, credits);
        this.name = name;
        this.age = age;
        this.credits = credits;
        this.gpa = 0.0; // Default GPA value
    }

    // toString method to print information about the Freshman class Only
    @Override
    public String toString() {
        return ("Freshman Information:\n" + "Name: " + name + "\n" + "Age: " + age + " years\n" + "Credits: " + credits + " credits\n" + "GPA: " + gpa);
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    // Setter for GPA
    public void setGpa(double gpa) {
        this.gpa = gpa;

    }
}
