/**
 * Name : Nikhillesh Sadassivam
 * ID : 1215175247
 * Class ID : 537
 * Subject : Software Engineering - CSE 360
 * Assignment : 2
 * Description : The Calculator Class is used to perform basic mathematical 
 * operations such as addition, subtraction, multiplication and division.
 * This class also provides the answer total and stores the history of the 
 * operations and operands used to perform the calculations.
 */



package cse360assign2;

public class Calculator {

	/**
	 * Declaring Class Variables
	 */
	private int total;
	private String history;
	
	/**
	 * Constructor to initialize the member variables for each instance of
	 * the class.
	 */
	public Calculator () {
		total = 0;  
		history = "0";
	}
	
	/**
	 * This method is used to return the value in the total variable. 
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * This method is used to add the integer value to the total variable.
	 * The operation and the operand is stored in history as a String. 
	 */
	public void add (int value) {
		
		total = total + value;
		history = history + " + " + Integer.toString(value);
	}
	
	/**
	 * This method is used to subtract the integer value to the total variable.
	 * The operation and the operand is stored in history as a String. 
	 */
	public void subtract (int value) {
		
		total = total - value;
		history = history + " - " + Integer.toString(value);
	}
	
	/**
	 * This method is used to multiply the integer value to the total variable.
	 * The operation and the operand is stored in history as a String. 
	 */
	public void multiply (int value) {
		
		total = total * value;
		history = history + " * " + Integer.toString(value);
	}
	
	/**
	 * This method is used to divide the integer value to the total variable.
	 * The operation and the operand is stored in history as a String. 
	 */
	public void divide (int value) {
		
		if (value == 0) {
			total = 0;
		}
		else {
			total = total / value;
		}
		history = history + " / " + Integer.toString(value);
	}
	
	/**
	 * This method is used to return the history of calculations performed. 
	 */
	public String getHistory () {
		return history;
	}
}
