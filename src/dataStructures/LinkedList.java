/*
 * File name: LinkedList.java

 * Author: Joshua Chukwuezi
 * Student Number: C18709101
 * Descripiton of class: This class implements the ADT definition of a linked list using the same signatures.
 */



package dataStructures;

//This class implements the ADT definition of a linked list using the same signatures. Note that we can add extra methods
//here once all of the methods listed in the ADT interface are included.

public class LinkedList<T> implements LinkedListADT<T> {
	
	 private int count;  // the current number of elements in the list
	 private LinearNode<T> list; //pointer to the first element 
	 private LinearNode<T> last; //pointer to the last element 
	 
	 //-----------------------------------------------------------------
	 //  Creates an empty list.
	 //-----------------------------------------------------------------
	    public LinkedList()
	    {
	       this.count = 0;
	       this.last = null;
	       this.list = null;
	    }

	    
	 // Adds generic object to the end of the list only if it doesn't already exist
	    public void add (T element)
	   {      
		   LinearNode<T> node = new LinearNode<T> (element); 
            
        	
		   if (size() == 0) {  
			   	this.last = node; // This is the last and the 
			 	this.list = node; // first node *remember that list is for the first*
			 	this.count++;
		   }//end if
		   else
		     {    
			   if(contains(element) == false) 
		   {
				
				   last.setNext(node); // add node to the end of the list
				   
				  last = node; // now make this the new last node.
				  this.count++; 
			  }
		      } //end else
	   
        }
                     

	    
	    
	    
	 // Deletes any object from the list where object is passed as parameter
	public T remove(T element)
	{
		T result = null;
		 LinearNode<T> current = this.list;
		 LinearNode<T> previous = this.list;
		 
		 for (current=this.list; current != null && !current.getElement().equals(element); current=current.getNext()) 
		 {
			 previous = current;
			 
		 } //inside this loop current equals previous
	
		 
		if (current== null)
		{
			result = null;
		}
		
		
		else if (current == this.list)
		 {
			 result = this.list.getElement();
				this.list = this.list.getNext();
				count--;
		 }
		 
		 else if (current == this.last) 
		 {
			 result = this.last.getElement();
			 this.last = previous; //the last element now becomes the value of previous
			 this.last.setNext(null); //what the last element was pointing to is now null
			 count --;
		 } //outside this loop if previous now becomes the last element and result is dereferenced
		 
		 else //removing it from the in the middle
		 {
			 result = current.getElement(); //this is the element that is getting removed
			 
		    previous.setNext(current.getNext()); //bypassing the deleted element 
		 }
		
		return result;
	}

	  
	   
	  //Checking if the list is empty
	   public boolean isEmpty()
	   {
		   if (this.list == null)
			   return true;
		   else
			   return false;
	   }

	  
	  
	   // Checking if the list contains generic object
      public boolean contains(T element)
      {
    	  LinearNode<T> current = this.list; //setting current to whatever is in list
    	  boolean contain=false;
    	  
    	  for (current = this.list; current != null; current= current.getNext()) //how to move through a linked list
    	  {
    		  if (element.equals(current.getElement()))
    				  {
    			              contain = true; 
    				  }
    		
    	  }
    	  
    	  if (!contain)
    	  return false;
    	  else
    	  return true; //this will be used to keep user in a loop
    	  
      }

	public String toString() //Displays all object data
	   {
		   LinearNode<T> current = this.list;
		   String fullList = "";
		   
		   for (current = this.list; current != null; current = current.getNext())
		   {
			   fullList = fullList + "\n" + current.getElement().toString();
		   }//end for
		   
		   return fullList + "\n";
	   }


	//returns the first generic object in the list
	
	public T getFirst()
	{
		LinearNode<T> first = this.list;
		
		return  first.getElement();
	}
	
	
	public LinearNode<T> getFirstNode() //returns the first node in the list
	{
		LinearNode<T> first = this.list;
		
		return  first;
	}
	
	
	//returns the last generic object in the list
	
	public T getLast()
	{
		LinearNode<T> last= this.last;
		
		return last.getElement();
	}
	
	
	public T getNextGeneric(T element) //returns next generic object in the list, where the current object is passed in as a parameter
	{
	     LinearNode<T> node = new LinearNode<T> (element); 
	     
	     LinearNode<T> current = this.list;
	     
	     LinearNode<T> nextGeneric;
	     
	     nextGeneric = current.getNext();
	     
	     return nextGeneric.getElement();
	     
	}	
	
    
	//method to reverse the linked list
	public void reverse()
	{ 
		LinearNode<T> current = this.list; //setting current equals to the first node
		LinearNode<T> next = this.list;
		LinearNode<T> previous = null;   
		
		
		while (current != null) { //all of this will be carried out while current != null
			next = current.getNext(); 
			current.setNext(previous); //current pointer will now point to previous node
			previous = current; //previous is now pointing to whatever current is
			current = next; //moving previous up to current 
		}
		
		next=this.list; //setting next back to the first node
		this.list=this.last; 
		last=next; 
			
	}
	
	
	
	//unused methods
	public int size() {
		return count;
	}
	
    public T remove()
	   {
		return null;
	   }

    
}
