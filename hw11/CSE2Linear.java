//////////////////////////////////////////////////////
//Joshua Kapcsos
//November 10, 2015
//CSE 002: Fundamentals of Programming
//CSE2 Linear program

//Program should:
//Prompt the user to enter 15 ints for students’ final grades in CSE2.
    //Check that the user only enters ints, and print an error message if the user enters anything other than an int.
    //Print a different error message for an int that is out of the range from 0-100,
    //and finally a third error message if the int is not greater than or equal to the last int.
//Print the final input array.
//Prompt the user to enter a grade to be searched for.
    //Use linear search to find the entered grade.
    //Indicate if the grade was found or not, and print out the number of iterations used.
//Scramble the sorted array randomly,
// print out the scrambled array.
//Prompt the user again to enter an int to be searched for,
//and use linear search to find the grade.
//Indicate if the grade was found or not, and how many iterations it took.
    
import java.util.Random;    
import java.util.Scanner;
    //imports the scanner class for inputs

public class CSE2Linear{
      //main method required for every Java program
  public static void main(String[] args) {
Scanner myScanner = new Scanner(System.in);
    //declares an instance of the Scanner object and call the Scanner constructor
    //tells Scanner that an instance is being created and will take input from STDIN
    
//prompts the user for 15 integers for the final grades    
System.out.print("Enter 15 ints for final grades in CSE2: ");

//declare an array of integers to hold the grades
int[] grades = new int[15];

    for (int i = 0; i < 15; i++) { //loop runs for each element of the array
    boolean acceptable = false; //set a boolean to false so that the loop can be exited when appropriate
        while (!acceptable) { //while loop runs while the boolean is false
            //check if the input is an int.
            if (myScanner.hasNextInt() ) {
                //if so, store it.
                grades[i] = myScanner.nextInt();
                    //calls a method that Scanner objects have - "nextInt()" method
                    //can only be accessed by telling Java that a method part of myScanner object is needed
                    //to accept a string, next() method of the Scanner object will be used
                if (grades[i] >= 0 && grades[i] <= 100) { //if the element is between 0 and 100:
                    if (i>=1) { //if the element is greater than the first element of the array:
                        if (grades[i - 1] <= grades[i]) { //if the grade is greater than or equal to the last:
                            acceptable = true; //accept the grade and exit the loop
                        }
                        else { //if the element is less than 0 or greater than 100, send an error and prompt for a new one:
                            System.out.println("   ERROR: Final grades must be inputted in increasing order.");
                            System.out.print("Input final grade: ");
                        }
                    }
                    else if (i==0) { //if it's the first element of the array, it doesn't need to be greater than or equal to the previous
                        acceptable = true;
                    }
                }
                else if (grades[i] < 0 || grades[i] > 100) { //if the grade is less than 0 or more than 100, prompt for a new one
                System.out.println("   ERROR: Final grades must be from 0 to 100.");
                System.out.print("Input final grade: ");
                continue;
                }    
            }
            else {
                //if not an int, trash it.  This does not assign the output of 
                //next() to anything. The output is just discarded.
                System.out.println("   ERROR: Final grade must be an integer.");
                System.out.print("Input final grade: ");
                myScanner.next();
            }
        }
    }
    
    System.out.println("Sorted:");
    for (int i=0; i<grades.length; i++) { //for loop runs from 0 to the amount of grade values in the array, in increments of 1
      System.out.print(grades[i]+" ");
      //prints the element of the array followed by a space
    }
      System.out.println(""); //prints blank line
    
    //prompt user to enter a grade that will be searched:
    System.out.print("Enter a grade to search for: ");
    int key = myScanner.nextInt(); //accepts grade to be searched
    linearSearch(key, grades); //calls method that searches linearly for it
    shuffle(grades); //calls method that randomly shuffles the grades
    System.out.print("Enter a grade to search for: "); //prompts user to enter a grade that will be searched
    int key2 = myScanner.nextInt(); //accepts grade to be searched
    linearSearch(key2, grades); //calls method that searches linearly for it
    
}

public static void linearSearch(int key, int[] grades) {
    //method that takes an array of ints and linearly searches for the key
    int i = 0; //declare a variable for the loop
    boolean found = false; //declare a boolean that will allow the loop to be exited
    for (i=0; i<grades.length; i++) { //this for loop will search every element of the array
        if (grades[i] == key) {
		    System.out.println(key + " was found in the list with " +i+ " iterations.");
		    found = true;
		    break;
		    //if the element of the array is equal to the key, print that it has been found with the amount of iterations i
		    //the loop is then exited with a break
		}
    }
    if (!found) {
        System.out.println(key + " was not found in the list with " +(i-1)+ " iterations.");
        //if the previous loop runs without changing the boolean to true, meaning the key was not found,
        //then print that it was not found with the amount of iterations i (from the previous loop)
    }

}

public static int[] shuffle(int[] grades) {
      //method that takes an array of ints and returns an array of scrambled elements
      System.out.println("Scrambled:");
      //prints "Scrambled:"
      for (int i=0; i<grades.length; i++) { //for loop runs from 0 to the amount of cards in the array, in increments of 1
	//find a random member to swap with by taking an integer of multipying the amount of grades in the array to a random number from 0 to 1
	int target = (int) (grades.length * Math.random() );

	//swap the values
	int temp = grades[target];
	grades[target] = grades[i];
	grades[i] = temp;
    }
    for (int i=0; i<grades.length; i++) {
        System.out.print(grades[i]+" ");
      //prints the element of the array followed by a space
    }
    System.out.println(""); //prints a blank line
    return grades;
    //returns the new array of shuffled cards
}  //end of method

} //end of class