//////////////////////////////////////////////////////
//Joshua Kapcsos
//October 31, 2015
//CSE 002: Fundamentals of Programming
//Lab 10

//Write a program that performs the following tasks:
    //1)    Create an array of Strings named students of a randomized size from 5 to 10.    
    //2)    Ask the user to fill up the array with different Strings using a Scanner.
    //3)    Create a second array named midterm of the same size as students.
    //4)    Fill in the array midterm with randomized integers in the range 0 to 100, using math.random().
    //5)    Print out the members of the two array such that each line has a member of students and grades    

import java.util.Scanner;
    //imports the scanner class for inputs
    
public class Array{
        //main method required for every Java program
    public static void main(String [] args) {
            
Scanner myScanner = new Scanner(System.in);
    //declares an instance of the Scanner object and call the Scanner constructor
    //tells Scanner that an instance is being created and will take input from STDIN   
    
String[] student; //array named students that holds strings

int numStudents = (int)(Math.random()*6)+5; //determines the random amount of students from 5 to 10
student = new String[numStudents]; //allocates the array to hold the previously determined number of students

System.out.println("Please enter " +numStudents+ " student names:"); //prompts for the students' names

for ( int i = 0; i < numStudents; i++ ) {
    student[i] = myScanner.next();
    //this for loop runs for each student, recording each name and stopping when i reaches the amount of students
}

System.out.println("");
System.out.println("Here are the midterm grades of the " +numStudents+ " students above:");

int[] midterm = new int[numStudents]; //second array that will hold the midterm grades
for ( int i = 0; i < numStudents; i++) { //runs until the number of students is reached
    midterm[i] = (int)(Math.random()*101); //determines the random midterm grade for each student, from 0 to 100
    System.out.println(student[i] + ": " +midterm[i]); //prints the student's name and his/her midterm grade
}

    
    }  //end of main method
}      //end of class