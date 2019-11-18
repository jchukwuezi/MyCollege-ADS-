/*
 * File name: MyCollege.java

 * Author: Joshua Chukwuezi
 * Student Number: C18709101
 * Descripiton of class: Will carry out functions - add, display, delete
 */

package application;

import java.util.Scanner;

import dataStructures.LinearNode;
import dataStructures.LinkedList;

public class MyCollege {
	LinkedList<Student> studentList; // creating student list
	int numberOfStudents;

	public MyCollege() // constructor
	{
		Scanner scan = new Scanner(System.in);
		studentList = new LinkedList<Student>();

		{
			System.out.println("How many students would you like to add to the list (can't be more than 10)");
			numberOfStudents = scan.nextInt();
		}
		while (numberOfStudents > 10);

		for (int i = 0; i < numberOfStudents; i++)
			addStudent(i);

		displayStudent();

		removeStudent();

		displayStudent();

		removeCourse();

		displayStudent();
		
		reverseList();

	}

	public void addStudent(int i) // method to add students to list
	{
		Scanner scan = new Scanner(System.in);
		String number, name, code;
		Integer year;

		System.out.println("Enter student number");
		number = scan.nextLine();

		System.out.println("Enter student name");
		name = scan.nextLine();

		System.out.println("Enter course code");
		code = scan.nextLine();

		System.out.println("Enter year of entry");
		year = scan.nextInt();

		Student aStudent = new Student(number, name, code, year);

		studentList.add(aStudent);

	}

	public void displayStudent() // display
	{
		if (!studentList.isEmpty())
			System.out.println(studentList.toString());

		else
			System.out.println("This list is empty");

	}

	public void removeStudent() // remove student based on number
	{
		Scanner scan = new Scanner(System.in);

		String studentNumber;
		Student aStudent; // used to create a student
		Student deletedStudent; // to hold memory address of deleted student

		System.out.println("Enter student number you would like to delete");
		studentNumber = scan.nextLine();

		aStudent = new Student(studentNumber, "", "     ", 0); // student with only number is being created

		deletedStudent = studentList.remove(aStudent);
		if (deletedStudent == null)
			System.out.println("Sorry no such student has been found");

		System.out.println(deletedStudent.getStudentNumber() + " has been deleted");

	}

	public void removeCourse() // method to delete all students from a specified programme
	{
		Scanner scan = new Scanner(System.in);
		String courseCode;
		Student aStudent = null, deletedStudent = null;

		System.out.println("Enter the course code that students will be deleted from");
		courseCode = scan.nextLine();

		aStudent = new Student("", "", courseCode, 0);

		// creating a student node to iterate through Linked List
		LinearNode<Student> currentStudent, nodeToDelete = null;
		do {
			nodeToDelete = null; // setting it to null
			for (currentStudent = studentList.getFirstNode(); currentStudent != null; currentStudent = currentStudent
					.getNext()) // looping through linked list
			{
				if (courseCode.equalsIgnoreCase(currentStudent.getElement().getCourseCode())) // comparing the course
																								// code
				{
					nodeToDelete = currentStudent; // storing the node that is being deleted
				}
			}

			if (nodeToDelete != null) {
				deletedStudent = studentList.remove(nodeToDelete.getElement()); // removing the memory address of that
																				// node

				if (deletedStudent != null) {
					System.out.println(deletedStudent.getName() + " was deleted from the list"); // printing the
																									// students
																									// from the code
																									// that
																									// have been deleted
				}

			}

			/*
			 * if (deletedStudent != null) { System.out.println(deletedStudent.getName() +
			 * " was deleted from the list"); // printing the students // from the code that
			 * // have been deleted }
			 */

		} while (nodeToDelete != null); // this loop will occur while theres something to be deleted

	}
	
	public void reverseList() //method to reverse the linked list
	{
		studentList.reverse();
		
		//creating a node to iterate through the list
		LinearNode<Student> currentStudent;
		
		System.out.println("Reversed student list ...");
		System.out.println(studentList.toString());
		
		/*
		for (currentStudent = studentList.getFirstNode(); currentStudent != null; currentStudent = currentStudent.getNext()) //loop to go through linked list				
		{
			displayStudent();
		}
		*/
		
	}
	
	

	public static void main(String[] args) {
		new MyCollege();

	}

}
