/*
 * File name: LinkedListADT.java

 * Author: Joshua Chukwuezi
 * Student Number: C18709101
 * Descripiton of class: Abstract Data Type definition for a Linked List
 */




package dataStructures;

public interface LinkedListADT <T>
	{
	   //  Adds one element to the start or end of this list
	   public void add (T element);

	   //  Removes and returns the first element from this list
	   public T remove(T element);
  
	   //  Returns true if this list contains no elements
	   public boolean isEmpty();

	   //  Returns the number of elements in this list
	   public int size();

	   //  Returns a string representation of this list
	   public String toString();
	
	 //returns through if it discovers a duplicate element in the list
	   public boolean contains (T element);
	   
	 //Returns first generic object in the list
	   public T getFirst();
	   
	  //Returns last generic object in the list
	   public T getLast();
	   
	 //Returns next generic object in the list, where the current object is passed in as a parameter
	   public T getNextGeneric(T element);
	   
	   //Still need to do part 2 and part 10 (including another function)

}
