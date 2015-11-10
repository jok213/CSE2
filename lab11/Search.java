//////////////////////////////////////////////////////
//Joshua Kapcsos
//November 6, 2015
//CSE 002: Fundamentals of Programming
//Lab 11

//Write a program that performs the following tasks:
    //Create two integer arrays (array1 and array2) of size 5000.
    //Fill array1 with random integers between 0 and 100000
    //Use linear search to print out the minimum and maximum values of array1.
    //Add increasing random numbers to array2. (How you do this is an intentional puzzle).
    //Print out the minimum and maximum values of array2. (hint you can do this without serious effort at search)
    //Prompt the user to enter an int >= 0, and exit the program if they do not enter an int >= 0.
    //Use binary search to search the array for the inputted value.
    //Say if the number was found or not found.
    //If the number was not found, print out the numbers below and above the searched for number (or if there are none, state “none”)

import java.util.Scanner;
    //imports the scanner class for inputs

public class Search{
     //main method required for every Java program
  public static void main(String[] args) {
Scanner myScanner = new Scanner(System.in);
    //declares an instance of the Scanner object and call the Scanner constructor
    //tells Scanner that an instance is being created and will take input from STDIN     
int[] array1 = new int[5000]; //new array that contains 5000 ints
int[] array2 = new int[5000]; //new array that contains 5000 ints
  
  for (int i=1; i<array1.length; i++) { //this for loop will fill every element of the first array
    array1[i] = (int) (100000 * Math.random()); 
    //chooses a random number from 0 to 100000
  }

int min = 100000;  
  for (int i=1; i<array1.length; i++) { //this for loop will search every element of the first array
    if (array1[i] < min) {
		min = array1[i];
		//if the element of the array is less than the previously checked minimum, it becomes the new minimum
    }	
    }
    
int max = 0;
    for (int i=1; i<array1.length; i++) { //this for loop will search every element of the first array
    if (array1[i] > max) {
		max = array1[i];
		//if the element of the array is more than the previously checked maximum, it becomes the new maximum
    }
    }

//prints the maximum and minimum    
System.out.println("The maximum of array1 is: " +max);		
System.out.println("The minimum of array1 is: " +min);

    array2[1] = (int) (100000 * Math.random()); //fills the first element of the array with random integers from 0 to 100000
    for (int i=2; i<array2.length; i++) { //fills the rest of the elements of the array through a for loop
      array2[i] = (int) ( ((100000 - array2[i-1]) * Math.random()) + array2[i-1] );
      //fills the rest of the elements of the array with random integers from the last value to 100000
    }

//prints the maximum and minimums, which are just the last and first elements since they're in order
System.out.println("The maximum of array2 is: " +array2[array2.length-1]);
System.out.println("The minimum of array2 is: " +array2[1]); 

//prompts user to enter an int
System.out.print("Enter an int: ");

//declare variables for binary search
int low = 0; //low end of the search
int high = array2.length - 1; //high end of the search starts at the end of the array
int key = 0; //declare variable for what integer for which is being searched
int middle = 0; //middle of the search
    if (myScanner.hasNextInt() ) {
        //if input is an int, store it.
        key = myScanner.nextInt();
            //calls a method that Scanner objects have - "nextInt()" method
            //can only be accessed by telling Java that a method part of myScanner object is needed
            //to accept a string, next() method of the Scanner object will be used
        if (key >= 0 ) {
            //if the key is less than zero:
            if(key<array2[1]) {
                System.out.println(key + " was not found in the list.");
                System.out.println("The number above the key was " +array2[1]);
                System.out.println("The number below the key was none");
                System.exit(0);
                //if the integer is less than the lowest in the array, prints that it wasn't found
            }
            if(key>array2[array2.length-1]) {
                System.out.println(key + " was not found in the list.");
                System.out.println("The number above the key was none");
                System.out.println("The number below the key was " +array2[array2.length-1]);
                System.exit(0);
                //if the integer is more than the highest in the array, prints that it wasn't found
            }
            while(high >= low) { //loop runs while the top of the search is greater than the bottom of the search
                middle = (low + high) / 2; //middle of the search is the middle of the elements
                if(array2[middle] == key) { //if the middle being searched matches the integer, print that it was found and exit the loop
                    System.out.println(key + " was found in the list.");
                    break; //exits the loop
                }
                if(array2[middle] < key) { //if the middle of the search is less than the integer, change the low end of the search to one above the middle
                    low = middle + 1;
                } //search again
                if(array2[middle] > key) { //if the middle of the search is greater than the integer, change the high end of the search to one below the middle
                    high = middle - 1;
                } //search again
            }
            if(array2[middle] != key) {
                System.out.println(key + " was not found in the list.");
                System.out.println("The number above the key was " +array2[low]);
                System.out.println("The number below the key was " +array2[high]);
                //if the integer wasn't found in the loop, it prints that it wasn't found, and the integers above and below it
            }
        }
        //if the input is negative or greater than 80, an error message prompts for a new input, and the loop goes back to the beginning
    }    

  } //end of method
  
}   //end of class  