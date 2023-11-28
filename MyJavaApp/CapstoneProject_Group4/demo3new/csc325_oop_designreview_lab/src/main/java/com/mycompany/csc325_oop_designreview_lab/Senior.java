package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {

        private String name;
        private int age;
        private int credits;
        private double gpa;
        public Senior(String name, int age, int credits) {
            super(name, age, credits);
            this.name = name;
            this.age = age;

            if (credits >= 85) {
                this.credits = credits;
            } else {

                this.credits = 85;
            }

            this.gpa = 0.0; // Default GPA value
        }


    public double getGpa() {
        return gpa;
    }

    // Setter for GPA
    public void setGpa(double gpa) {
        this.gpa = gpa;

    }

        // toString method to print information about from Senior Class Only
        @Override
        public String toString() {
            return ("Senior Information:\n" + "Name: " + name + "\n" + "Age: " + age + " years\n" + "Credits: " + credits + "\n" +"GPA: " + gpa);
        }


    }










