/**
 * Name : Nikhillesh Sadassivam
 * ID : 1215175247
 * Class ID : CSE 360 
 * Assignment : 1
 * Description : The OrderedIntList Class has an array of size 10. It inserts 
 * and stores up to 10 non-duplicate values in ascending order and prints them
 * when required.
 */


package cse360assign1;

public class OrderedIntList {
	
	/**
	 * Declaring Class Variables
	 */
	private int[] array;  // array to store the values
	private int count; // counter to keep track of maximum length
	
	/**
	 * Constructor to initialize the member variables for each instance of
	 * the class.
	 */
	OrderedIntList (){
		array = new int[10];
		count = 0;
	}
	
	/**
	 * This method is used to insert non-duplicate values into the array and 
	 * limit the size to the first 10 values in ascending order.
	 *  
	 * @param newValue is the new Value to be inserted into the array.
	 */
	public void insert (int newValue) {
		int newValueIndex = 0;
		
		for (int index = 0; index < count; index++, newValueIndex++) {
			if(newValue <= array[index]) {
				break;
			}
		}
		
		if( newValueIndex < count && newValue < array[newValueIndex] ) {
			for (int index = ((count == array.length)? count - 1 : count);
			index > newValueIndex;index--) {
				
				array[index] = array[index - 1];
			}
			
			array[newValueIndex]= newValue;
			count = (++count < array.length)? count : array.length;
		}
		else if(newValueIndex == count && count < array.length) {
			array[newValueIndex] = newValue;
			count = (++count < array.length)? count : array.length;
		}
		
	}
	
	/**
	 * This method is used to print the array with tab space between the values
	 * and print only 5 values per line. 
	 */
	public void print () {
		
		for (int index = 0; index < count; index++) {
			
			if ( index % 5 == 0 ) {
				System.out.println();
			}
			
			System.out.print(array[index] + "\t");	
		}
	}

}
