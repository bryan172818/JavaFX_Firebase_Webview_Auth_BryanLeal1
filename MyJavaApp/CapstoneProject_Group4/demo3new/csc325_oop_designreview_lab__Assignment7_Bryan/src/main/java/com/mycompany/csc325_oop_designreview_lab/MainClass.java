/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

	public static void main(String[] args) {
		// ToDo 5: Fix the error

		// ToDo 6: Fix the constructor of the Student class

		// Todo 7: Create two classes for Freshman and Senior

		// ToDo 8: The senior class should have a minimum of 85 credits

		// ToDo 9: Add a toString method for the Student class
		// ToDo 10: Add a toString method for the Freshman class

		//Student 1 is just a regular student not a freshman or senior //Credits is 0 by default
		Student std1= new Student("James", 20);
		// ToDo 11: Add a toString method for the Senior class

		Student std2= new Freshman("James", 20, 12); // name, age, credits

		Senior std3 = new Senior("John", 30, 90);

		// ToDo 12: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
		// ToDo 12: Set the GPA of the student using the scanner and user input.

		// array to store the students
		Student[] students = {std1, std2, std3};

		Scanner scanner = new Scanner(System.in);

		for (Student student : students) {
			System.out.print("Enter GPA for " + student.getName() + ": ");
			double gpa = scanner.nextDouble();
			student.setGpa(gpa);
		}

		// Print the student information
		for (Student student : students) {
			System.out.println();
			System.out.println(student.toString());
		}

		System.out.println();
		System.out.println();

		//Original system statements
		System.out.println(std1);

		System.out.println(std2);

		// ToDo 13: add comments and explain your code

		// ToDo 14: submit using a pull request.
	}

}

