//////////////////////////////////////////////////////
//Joshua Kapcsos
//November 13, 2015
//CSE 002: Fundamentals of Programming
//Lab 12

//In this lab, you will create a ragged array and manipulate its data.
    //Write a method called raggedArray() that returns an array of integers that contains, randomly, between 10 and 20 member arrays.
        //Each member array, should have a random size between 10 and 20 integers.
        //Initialize all members of each member array with random integers between -1000 and 1000.
    //Write a method printArray() that accepts a two dimensional array of integers as input and prints the entire array in a visually organized way.
    //Overload a second method, printArray() that accepts a one dimensional array of integers, and prints the array.  It returns nothing.
    //Write a method findSmallest() that accepts a two dimensional array of integers as input and returns the member array with the smallest size.
    //Write a method findLargest() that accepts a two dimensional array of integers and finds the largest member of any member array, and prints its value.
        //Return the member array that it came from.
    //Finally, write a method, mostEven() that accepts a two dimensional array as input and finds the member array with the largest number of even numbers.
        //Return the member array found by this search.
    //Create a main method that uses the methods you created above to 
        //Create a ragged 2D array
        //print the 2D array
        //find the smallest member array and print it
        //find the largest member of any member array.  Print the largest member, then print the member array it came from
        //find the member array with the largest number of even members and then print it

public class Arrays{
        //main method required for every Java program
    public static void main(String [] args) {
int[][] stuff = raggedArray(); //calls method that creates a ragged array
printArray(stuff); //prints the ragged array
int[] small = findSmallest(stuff); //calls method that finds the smallest member array of the ragged array
System.out.println("Smallest member array:"); //prints "Smallest member array:"
printArray(small); //calls the method that prints the smallest member array
int[] largeArray = findLargest(stuff); //calls method that finds the largest member of any member array
System.out.println("Member array from which the largest member of any member array was found:");
printArray(largeArray); //prints the member array from which the largest member was found
int[] evenArray = mostEven(stuff); //calls the method that finds the member array with the most even members
System.out.println("Member array with the largest number of even members:");
printArray(evenArray); //prints the member array with the most even members
    } //end of method
    
public static int[][] raggedArray() {
    //method that doesn't need to accept anything and returns a two-dimensional array of integers
    int stuff[][] = new int[(int) (Math.random()*10)+10][0]; //fills the first dimension of the array with a random number from 10 to 20
    for (int i = 0; i<stuff.length; i++) {
        //for loop runs in increments of 1 until it reaches the length of the first dimension
        stuff[i] = new int[(int) (Math.random()*10)+10]; //each member array will have a random number of members from 10 to 20
        for (int j = 0; j<stuff[i].length; j++) {
            //for loop runs in increments of 1 until it fills the length of the second dimension
            stuff[i][j] = (int) (Math.random()*2000)-1000; //fills each member array with random integers from -1000 to 1000
        }
    }
    return stuff; //returns the ragged array
} //end of method

public static void printArray(int[][] stuff) {
    //method that accepts a two-dimensional array of integers and returns nothing
    for (int i = 0; i<stuff.length; i++) {
        //for loop runs in increments of 1 until it reaches the length of the first dimension
        for (int j = 0; j<stuff[i].length; j++) {
            //for loop runs in increments of 1 until it reaches the length of the second dimension, going through each member of the member array
            System.out.print(stuff[i][j] + " "); //prints each member of each member array followed by a space
        }
        System.out.println(""); //starts a new line when printing each member array
    }    
} //end of method

public static void printArray(int[] stuff) {
    //overloaded method that accepts a one-dimensional array of integers and returns nothing
    for (int i = 0; i<stuff.length; i++) {
        //for loop runs in increments of 1 until it reaches the length of the first dimension, since there is only 1 dimension
        System.out.print(stuff[i] + " "); //prints member of the array followed by a space
    }
    System.out.println(""); //ends the line
} //end of method

public static int[] findSmallest(int[][] stuff) {
    //method that accepts a two-dimensional array of integers and returns a one-dimensional array of integers
    int small[] = stuff[0]; //declare the one-dimensional array that will hold the smallest array
    for (int i = 0; i<stuff.length; i++) {
        //for loop runs in increments of 1 until it reaches the length of the first dimension, the number of member arrays in the array
        if (stuff[i].length < small.length) {
            small = stuff[i];
            //if the length of the member array is less than the previously determined smallest array, the smallest array is replaced by it
        }
    }
    return small; //returns the smallest member array
} //end of method

public static int[] findLargest(int[][] stuff) {
    //method that accepts a two-dimensional array of integers and returns a one-dimensional array of integers
    int large = stuff[0][0]; //declare the integer that will hold the largest integer of any of the member arrays
    int[] largeArray = new int[0]; //declare the array from which the largest integer is found
    for (int i = 0; i<stuff.length; i++) {
        //for loop runs in increments of 1 until it reaches the length of the first dimension, the number of member arrays in the array
        for (int j = 0; j<stuff[i].length; j++) {
            //for loop runs in increments of 1 until it reaches the length of the second dimension, going through each member of the member array
            if (stuff[i][j] > large) {
                large = stuff[i][j];
                largeArray = stuff[i];
                //if the member of the member array in question is greater than the previously determined largest value,
                //it becomes the new largest value, and the member array from which it came is recorded
            }
        }
    }
    System.out.println("Largest member of any member array:");
    System.out.println(large); //prints the largest member of the entire array
    return largeArray; //returns the member array from which the largest integer was found
} //end of method

public static int[] mostEven(int[][] stuff) {
    //method that accepts a two-dimensional array of integers and returns a one-dimensional array of integers
    int evenArray[] = stuff[0]; //declare the array that will hold the member array with the largest amount of even numbers
    int previousEven = 0; //declare the integer that holds the amount of even numbers in the previous member array that had the largest amount of even integers
    int even = 0; //declare the integer that holds the amount of even numbers of the member array in question
    for (int i = 0; i<stuff.length; i++) {
        //for loop runs in increments of 1 until it reaches the length of the first dimension, the number of member arrays
        for (int j = 0; j<stuff[i].length; j++) {
            //for loop runs in increments of 1 until it reaches the length of the second dimension, each member of the member arrays
            if (stuff[i][j] % 2 == 0) {
            even++;
            //if the member of the member array is even, the even count goes up by 1
            }
        }
        if (even > previousEven) {
            evenArray = stuff[i];
            previousEven = even;
            //if the amount of even integers in the member array is greater than the previous holder of the most even integers,
            //the member array is recorded as having the most even integers, and
            //the amount of even numbers is recorded as the new previous before moving to the next member array
        }
        even = 0; //resets the amount of even numbers to zero before moving to the next member array
    }
    return evenArray; //returns the member array with the largest amount of even integers
} //end of method

}   //end of class      