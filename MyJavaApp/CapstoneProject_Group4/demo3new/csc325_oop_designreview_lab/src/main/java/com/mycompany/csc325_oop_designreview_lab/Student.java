/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {


    public int credits;
    public double gpa;

        //2 Constructors one for defaults
    public Student(String name, int age) {
        super(name, age);
        this.credits = 0; // credits default value of zero
    }

    public Student(String name, int age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public void setAddress(String address) {

    }


    public double getGpa() {
        return gpa;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

    public String toString() {
        return "Student Information:\n" +
                "Name: " + getName() + "\n" +
                "Age: " + getAge() + " years\n" +
                "Credits: " + credits + "\n" +
                "GPA: " + gpa; }
    }
    // ToDo 1: Make this class a child of Human

	// ToDo 2: Fix the resulting errors

	// ToDo 3: Add a field for GPA and create a setter and a getter
	
	// ToDo 4: Add comments to your code


//Not needed code
    //Student student = new Student("Alice", (short) 20);
//student.setGpa(3.8);
       // System.out.println(student.toString());


/*
    @Override
    public String getAddress() {

        return null;
    }

    @Override
    public void setAddress(String address) {

    }


    */
