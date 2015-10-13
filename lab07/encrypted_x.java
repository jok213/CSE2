//////////////////////////////////////////////////////
//Joshua Kapcsos
//October 9, 2015
//CSE 002: Fundamentals of Programming
//Encrypted X Lab

//Program should:
//Prompt user for input between 0 and 100 (and reprompt elsewise)
//Use input to create a box with dimesions equal to the input
//And encrypt an X into the box by removing stars where the X would be

import java.util.Scanner;
    //imports the scanner class for inputs
    
public class encrypted_x{
        //main method required for every Java program
    public static void main(String [] args) {
            
Scanner myScanner = new Scanner(System.in);
    //declares an instance of the Scanner object and call the Scanner constructor
    //tells Scanner that an instance is being created and will take input from STDIN   

int input = 0;
boolean acceptable = false;
//loop until you get acceptable input (i.e. if it's an int)        
System.out.print("Please enter a number from 0 to 100: ");
    //prompts the user for a number from 0 to 100
    //this will be the size of the square measured by the number of stars
    //note: because there is no ln, the cursor will not go to the next line after printing this

while (!acceptable) {
    //check if the input is an int.
    if (myScanner.hasNextInt() ) {
        //if so, store it.
        input = myScanner.nextInt();
            //calls a method that Scanner objects have - "nextInt()" method
            //can only be accessed by telling Java that a method part of myScanner object is needed
            //to accept a string, next() method of the Scanner object will be used
        if (input >= 0 && input <= 100) {
        acceptable = true;
        //if the input lies within 0 to 100, it is accepted, and the loop is exited by changing the boolean to true
        }
        else if (input < 0 || input > 100) {
        System.out.println("   ERROR: your input is not from 0 to 100");
        System.out.print("Please enter a number from 0 to 100: ");
        continue;
        //if the input lies outside of 0 to 100, an error message prompts for a new input, and the loop goes back to the beginning
        }    
    }
    else {
        //if not an int, trash it.  This does not assign the output of 
        //next() to anything. The output is just discarded.
        System.out.println("   ERROR: your input is not an integer");
        System.out.print("Please enter a number from 0 to 100: ");
        myScanner.next();
    }
}     

//declare variables:
String star = ""; //stores what is printed on each line
for(int i = 0; i < input; i++){
    //runs from 0 to the input, adding 1 each time
    //determines that the number of lines is equal to the input
    for(int j = 0; j < input; j++){
        //runs from 0 to the input, adding 1 each time
        //determines that the amount of characters per line is equal to the input
        if (j == i || j == input - 1 - i) {
            star += " ";
            //if the character in the line is equal to the line's number or the end of the line minus the line's number,
            //a blank will be added to the line in order to create the X
        }
        else {
            star += "*";
            //for everything else, an asterisk is added, since it's not part of the X
        }
    }
    //each line must be printed out before continuing the outer loop that moves to the next line:
    System.out.println(star);
    //must reset the line's value for each line:
    star = "";
}

    } //end of main method
}     //end of class