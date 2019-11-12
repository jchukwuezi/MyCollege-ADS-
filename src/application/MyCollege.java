/*
 * File name: MyCollege.java

 * Author: Joshua Chukwuezi
 * Student Number: C18709101
 * Descripiton of class: Will carry out functions - add, display, delete
 */

package application;

import java.util.Scanner;

import dataStructures.LinkedList;

public class MyCollege {
	LinkedList<Student>studentList; //creating student list
	int numberOfStudents;

	public MyCollege() //constructor
	{
		Scanner scan = new Scanner (System.in);
		studentList = new LinkedList<Student>();
			
		do {
		System.out.println("How many students would you like to add to the list (can't be more than 10)");
		numberOfStudents = scan.nextInt();
		}while (numberOfStudents > 10);
		
		for (int i=0; i<numberOfStudents; i++)
			addStudent(i);
		
		displayStudent();
		
		removeStudent();
		
		displayRemaining();
		
		
	}
	
	
	public void addStudent(int i) //method to add students to list
	{
		Scanner scan = new Scanner (System.in);
		 String number,name,code;
		 Integer year;
		 
		 System.out.println("Enter student number");
		 name = scan.nextLine();
		 
		 System.out.println("Enter student name");
		 number=scan.nextLine();
		 
		 System.out.println("Enter course code");
		 code = scan.nextLine();
		 
		 System.out.println("Enter year of entry");
		 year = scan.nextInt();
		 
		 Student aStudent = new Student (name, number , code, year);
		 
		 studentList.add(aStudent);		 
		 	 
	}
	
	public void displayStudent() //display 
	{
		if (!studentList.isEmpty())
		System.out.println(studentList.toString());
		
		else 
			System.out.println("This list is empty");
		
	}
	
	public void removeStudent()  //remove student based on number
	{
		Scanner scan = new Scanner (System.in);
		
	    String studentNumber; 
	    Student aStudent; //used to create a student
	    Student deletedStudent; //to hold memory address of deleted student
	    
	    System.out.println("Enter student number you would like to delete");
	    studentNumber = scan.nextLine();
	    
	    aStudent=new Student(studentNumber,"", "     ", 0); //student with only number is being created
	    
	    deletedStudent = studentList.remove(aStudent);
	    System.out.println(deletedStudent.getStudentNumber() + " has been deleted"); 
		
	}
	
	
	public void displayRemaining() //displaying the remaining students in the linked list
	{
		if (!studentList.isEmpty())
			System.out.println(studentList.toString());
			
			else 
				System.out.println("This list is empty");
		
	}
	
	public void removeCourse() //method to delete all students from a specified programme
	{
	   Scanner scan = new Scanner(System.in);
	   String courseCode;
	   Student aStudent;
	   
	   System.out.println("Enter the course code that students will be deleted from");
	   courseCode = scan.nextLine();
	   
	   aStudent = new Student("", "", courseCode, 0);
	   
	   //creating a student node to iterate through Linked List
	   
	   
	}
	
	
	public static void main(String[] args) {
	new MyCollege();	

	}

}
