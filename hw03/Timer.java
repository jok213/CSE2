//////////////////////////////////////////////////////
//Joshua Kapcsos
//September 12, 2015
//CSE 002: Fundamentals of Programming
//Timer Program

//Premise: The user has made plans to go to dinner with friends at a certain time
//Program should:
    //prompt the user for the current time and dinner time
    //calculate the amount of time remaining until they eat dinner
//Assume that the user uses military time (0 - 23 hours),
//and input is in the form of an int (HHMM) where the first two digits represent the hour and the second two digits represent the minutes.
//Don't worry about the time being on different days.

//To use Scanner class, it must be imported otherwise the compiler will generate error messages
//This must be the first statement after comments:
import java.util.Scanner;

public class Timer{
    //main method required for every Java program
    public static void main(String[] args) {
        
Scanner myScanner = new Scanner( System.in );
    //declares an instance of the Scanner object and call the Scanner constructor
    //tells Scanner that an instance is being created and will take input from STDIN

System.out.print("Enter the current time in the form HHMM: ");
    //prompts the user for the current time
    //note: because there is no ln, the cursor will not go to the next line after printing this

int currentTime = myScanner.nextInt();
    //calls a method that Scanner objects have - "nextInt()" method
    //can only be accessed by telling Java that a method part of myScanner object is needed
    //to accept an int, nextInt() method of the Scanner object will be used
    //e.g., my Scanner.nextInt()
    
System.out.print("Enter the dinner time in the form HHMM: ");
int dinnerTime = myScanner.nextInt();
    //prompts the user for the dinner time and accept the input
 
//I need to split the hours and the minutes and do the math for each separately
//I have to declare them first: 
int currentHour;   //current hour
int currentMinute; //current minutes of the hour
int dinnerHour;    // hour of dinner
int dinnerMinute;  //minutes after the hour for dinner
int hours;         //hours until dinner
int minutes;       //minutes until dinner

currentHour = currentTime / 100;
dinnerHour = dinnerTime / 100;
    //hours equals the current time divided by 100, since the minutes will be truncated from the integer
currentMinute = currentTime % 100;
dinnerMinute = dinnerTime % 100;
    //minutes equals the remainder after dividing the current time by 100

hours = dinnerHour - currentHour;
   //hours until dinner is the current hour subracted from the dinner hour 
minutes = dinnerMinute - currentMinute;
    //minutes until dinner is the current minute subracted from the dinner minute

//Here's the tricky part:
//This can easily result in negative amounts of minutes
//Solution:
if (minutes < 0) {
    hours = hours - 1;
    minutes = 60 + minutes;
    //this if-then statement basically carries the negative minutes to the hour:
    //if the minutes are negative,
    //subtract one from the hour,
    //and change the minutes to 60 plus the amount of minutes (which will be subtracted since it's negative)
}

//print out the output
System.out.println ("You have " +hours+ " hours and " +minutes+ " minutes until dinner.");

    }   //end of main method
}       //end of class 