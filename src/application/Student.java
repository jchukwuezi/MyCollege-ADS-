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
	private String courseCode;
	private Integer entryYear;

	//constructors
	public Student() {}
	
	
	
	public Student(String sn, String n, String cc, Integer ey)
	{
		this.studentNumber=sn;
		this.name=n;
		this.courseCode=cc;
		this.entryYear=ey;
		
		/*if (!(courseCode.substring(0,2).equalsIgnoreCase("DT"))) //if course code doesn't start with DT then it is set to error 
				{
                       courseCode= "ERROR";		
                       
                       System.out.println("course code as been set to error because it doesn't begin with DT");
				}
		
		if ((entryYear < 2013) || (entryYear > 2019))
		{
			entryYear = 0000;
			
			System.out.println("entry year has been set to 0000 because it was after 2019/before 2013");
		}
		*/
		
		
		
		
	}


    //getters and setters
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
   
	
	
	public String getCourseCode() {
		return courseCode;
	}



	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}



	public String toString() {
		return "Student Number : " + studentNumber + "\nName : " + name + "\nEntry Year : " + entryYear + "\nCourse Code : " + courseCode ;
	}
	
	
	
	public boolean equals(Object otherObject) //comparing two students by student number
	{
		Student otherStudent = (Student) otherObject;
		boolean check = false;
		
		if (this.studentNumber.equalsIgnoreCase(otherStudent.getStudentNumber()))
		{
		  check = true;
		}
		
		else
			check = false;
		
		return check;
		
	}
	
	public boolean isGreaterThan(Object otherObject) //seeing if one student number is greater than the other using compareTo method
	{
		boolean check = false;
		int compare;
		
		Student otherStudent = (Student) otherObject;
		
		compare = this.studentNumber.compareToIgnoreCase(otherStudent.getStudentNumber());
		
		if (compare > 0) //if student number is greater
		check = true;
		
		else //if student number is less than
		check = false;
		
        return check;
	}
	
	public boolean isLessThan(Object otherObject) //seeing if one student number is less than the other using compareTo method
	{
		boolean check= false;
		int compare;
	
        Student otherStudent = (Student) otherObject;
		
		compare = this.studentNumber.compareToIgnoreCase(otherStudent.getStudentNumber());
		
		if (compare < 0) //if number is less than
		check = true;
		
		else //if number is greater than 
		check = false;	
		
		return check;
	
	}
	
	
}
