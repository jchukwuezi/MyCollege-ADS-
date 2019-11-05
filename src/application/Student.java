/*
 * File name: student.java
 * Author: Joshua Chukwuezi
 * Student Number: C18709101
 * Descripiton of class: Contains student data for student objects
 */



package application;

public class Student {
	private String studentNumber;
	private String name;
	private Integer entryYear;

	public Student() {}
	
	
	
	public Student(String sn, String n, Integer ey)
	{
		this.studentNumber=sn;
		this.name=n;
		this.entryYear=ey;
	}



	public String getStudentNumber() {
		return studentNumber;
	}



	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getEntryYear() {
		return entryYear;
	}



	public void setEntryYear(Integer entryYear) {
		this.entryYear = entryYear;
	}
	
	
	
	
	
	
}
