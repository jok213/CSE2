//////////////////////////////////////////////////////
//Joshua Kapcsos
//October 20, 2015
//CSE 002: Fundamentals of Programming
//String Analysis Program

//Program should:
//process a string by examining all the characters,
//or just a specified number of characters in the string,
//and determine if they are letters.

//Let the user enter a string and choose if he or she wants to examine all the characters or just a certain number
//There should be two methods with the same name that both return a boolean:
    //One of the methods should accept just a string
    //and the other should accept a string and an int.
        //In the method that accepts an int, the int tells you how many characters to check.
        //If the int is greater than the number of characters in the string stop when you get to the end of the string.
        
//Notes:
//stringName.charAt(int i) returns the character in position i of the string
//You can check if a character is a letter by:
    //using the isLetter() method of the Character class
    //or by using >= and <= signs to compare the character against other characters.
        //‘a’ defines the lower end of a range, with ‘z’ at the higher end of the range.
        //All chars in between are also letters, so ‘a’<=’b’ and ‘b’<=’z’.
        //So if it is between ‘a’ and ‘z’, it must be a letter.
//Make sure to check that all input is valid, and ask again if it’s not.

import java.util.Scanner;
    //imports the scanner class for inputs
    
public class StringAnalysis{
        //main method required for every Java program
    public static void main(String [] args) {
            
Scanner myScanner = new Scanner(System.in);
    //declares an instance of the Scanner object and call the Scanner constructor
    //tells Scanner that an instance is being created and will take input from STDIN

//
//prompt the user for the string:
System.out.print("Please enter the string that you would like to evaluate: ");
String string = myScanner.next();

//prompt the user for the amount of characters to be examined
System.out.print("Please enter the number of characters you would like to be examined in the string, or input 'all' to evaluate the entire string: ");
String amount = myScanner.next();

boolean acceptable = false;
while (!acceptable) { //this loop runs until acceptable becomes true
    if ( amount.equals("all") ) {
        System.out.println( all(string) );
        acceptable = true;
        //prints the truth values of the characters by calling the all method
    }
    else {  
            try {
            Integer.parseInt(string);
            acceptable = true;
            amount = Integer.parseInt(amount);
            System.out.println( some(string, amount) );
            //if the string is parsable into an integer, the loop is exited by changing the boolean to true, and the integer is recorded
            //prints the truth values of the characters by calling the some method
            } catch (NumberFormatException e) {
            System.out.println("   ERROR: You must enter an integer or 'all' ");
                System.out.print("Please enter the number of characters you would like to be examined in the string, or input 'all' to evaluate the entire string: ");
                amount = myScanner.next();
            //if the string is not parsable into a double, an error message occurs and the user is reprompted  
            } 
        }
}        

} //end of main method

    //this method returns a boolean when the entire string is evaluated
    public static boolean all( String string ) { //returns a boolean and takes a string
        for ( int i = 0, i <= string.length(), i++ ) { //this loop runs until it reaches the number of characters in the string
            if ( boolean isLetter(string.charAt(i)) ) {
                return true;
                //if the character being evaluated is a letter, the method returns true
            }
            else if ( !isLetter(string.charAt(i)) ) {
                return false;
                //if the character being evaluated is not a letter, the method returns false
            }
        }
    } //end of method    
    
    //this method returns a boolean when a certain number of characters in the string is being evaluated
    public static boolean some( String string, int amount ) { //returns a boolean and takes a string and an integer
        for ( int i = 0, i <= amount, i++ ) { //this loop runs until it reaches the number of characters desired
            if ( boolean isLetter(string.charAt(i)) ) {
                return true;
                //if the character being evaluated is a letter, the method returns true
            }
            else if ( !isLetter(string.charAt(i)) ) {
                return false;
                //if the character being evaluated is not a letter, the method returns false
            }
        }
    } //end of method
}