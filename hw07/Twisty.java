//////////////////////////////////////////////////////
//Joshua Kapcsos
//October 14, 2015
//CSE 002: Fundamentals of Programming
//Twisty Program

//Write a program that asks the user for two integers: Length and Width.
    //Length is to specify how many characters the pattern should spread, horizontally, across the screen.
    //Width should specify how many characters the pattern should spread, vertically, across the screen.
    
import java.util.Scanner;
    //imports the scanner class for inputs
    
public class Twisty{
        //main method required for every Java program
    public static void main(String [] args) {
            
Scanner myScanner = new Scanner(System.in);
    //declares an instance of the Scanner object and call the Scanner constructor
    //tells Scanner that an instance is being created and will take input from STDIN   

int length = 0;
boolean acceptable = false;
//loop until you get acceptable input (i.e. if it's an int)        
System.out.print("Input your desired length: ");
    //prompts the user for a number from 0 to 100
    //this will be the size of the square measured by the number of stars
    //note: because there is no ln, the cursor will not go to the next line after printing this

while (!acceptable) {
    //check if the input is an int.
    if (myScanner.hasNextInt() ) {
        //if so, store it.
        length = myScanner.nextInt();
            //calls a method that Scanner objects have - "nextInt()" method
            //can only be accessed by telling Java that a method part of myScanner object is needed
            //to accept a string, next() method of the Scanner object will be used
        if (length >= 0 && length <= 80) {
        acceptable = true;
        //if the input is positive and no more than 80, it is accepted, and the loop is exited by changing the boolean to true
        }
        else if (length < 0 || length > 80) {
        System.out.println("   ERROR: Your length must be from 0 to 80");
        System.out.print("Input your desired length: ");
        continue;
        //if the input is negative or greater than 80, an error message prompts for a new input, and the loop goes back to the beginning
        }    
    }
    else {
        //if not an int, trash it.  This does not assign the output of 
        //next() to anything. The output is just discarded.
        System.out.println("   ERROR: Please type in an integer");
        System.out.print("Input your desired length: ");
        myScanner.next();
    }
}

int width = 0;
boolean acceptable1 = false;
//loop until you get acceptable input (i.e. if it's an int)        
System.out.print("Input your desired width: ");
    //prompts the user for a number from 0 to 100
    //this will be the size of the square measured by the number of stars
    //note: because there is no ln, the cursor will not go to the next line after printing this

while (!acceptable1) {
    //check if the input is an int.
    if (myScanner.hasNextInt() ) {
        //if so, store it.
        width = myScanner.nextInt();
            //calls a method that Scanner objects have - "nextInt()" method
            //can only be accessed by telling Java that a method part of myScanner object is needed
            //to accept a string, next() method of the Scanner object will be used
        if (width >= 0 && width <= length) {
        acceptable1 = true;
        //if the input is positive and less than the length, it is accepted, and the loop is exited by changing the boolean to true
        }
        else if (width < 0 || width > length) {
        System.out.println("   ERROR: Please input an integer smaller than the length.");
        System.out.print("Input your desired width: ");
        continue;
        //if the input is negative or more than the length, an error message prompts for a new input, and the loop goes back to the beginning
        }    
    }
    else {
        //if not an int, trash it.  This does not assign the output of 
        //next() to anything. The output is just discarded.
        System.out.println("   ERROR: Please type in an integer");
        System.out.print("Input your desired width: ");
        myScanner.next();
    }
}

//declare variables:
int lengthCounter = 0; //makes sure that the length of each line will not exceed the length input
String pattern = "";   //stores what is printed on each line
for(int i = 0; i < width; i++){
    //runs from 0 to the width, adding 1 each time
    //determines that the number of lines is equal to the width input
    for (int k = 0; k <= (length / (2*width)); k++) {
        //for loop runs from 0 to the amount of patterns that are needed, adding one each time
        //amount of patterns is the length divided by two times the width
        for (int j = 0; (j < 2*width) && (lengthCounter < length); j++){
            //for loop runs from 0 to two times the width, adding 1 each time, or until the length of the line has reached the length input
            //determines that the amount of characters per pattern is equal to twice the width
            if (j == width + i ) {
                pattern += "\\";
                //if the character's place is equal to the width plus the line number, a \ is added
            }
            else if ( j == i || j == (2*width) - 1 - i ) {
                pattern += "#";
                //if the character's place is equal to the line number, it creates the first diagonal of # symbols
                //if the character's place is equal twice the width minus the line number, it creates the second diagonal of # symbols
            }
            else if (j == width - 1 - i ) {
                pattern += "/";
                //if the character's place is the width minus the line number, a / is needed
            }
            else {
                pattern += " ";
                //everything else gets an empty space
            }
            lengthCounter++;
            //the length counter adds one to itself each time a character is added,
            //so that the condition in the above loop can stop the line from exceeding the length input
        } //this is looped until each single pattern is ended
    } //this is looped until the total number of patterns per line is ended
    //now to print each line:
    System.out.println(pattern);
    //now to reset each line's value for the next line:
    pattern = "";
    lengthCounter = 0;
}            //this is looped for each line until the width value is reached

    }  //end of main method
}      //end of class
