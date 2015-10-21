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

System.out.print("Please enter the number of characters you would like to be examined in the string: ");
int amount = myScanner.next();



}

    public static boolean all( String string ) {
        for ( int i = 0, i <= string.length(), i++ )
            if ( boolean isLetter(string.charAt(i)) ) {
                return true;
            }
            else if ( !isLetter(string.charAt(i)) ) {
                return false;
            }
    }
    
    public static boolean some( String string, int amount ) {
        for ( int i = 0, i <= amount, i++) {
            if ( boolean isLetter(string.charAt(i)) ) {
                return true;
            }
            else if ( !isLetter(string.charAt(i)) ) {
                return false;
            }
        }
    }
}