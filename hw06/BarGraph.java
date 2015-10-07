//////////////////////////////////////////////////////
//Joshua Kapcsos
//October 6, 2015
//CSE 002: Fundamentals of Programming
//Bar Graph Program

//Create a program that prompts you to input the expenses for each day of the week for one week
//With this input, the program will print a simple bar graph/visualization that represents your weekly expenses
//using horizontal bars made of the * character. 

import java.util.Scanner;
    //imports scan class

public class BarGraph{
    //main method required for every Java program
    public static void main(String [] args) {
        
Scanner myScanner = new Scanner( System.in ) ;
    //declares an instance of the Scanner object and call the Scanner constructor
    //tells Scanner that an instance is being created and will take input from STDIN        

//declare variables for the amounts for each day of the week:
double Monday = 0;
double Tuesday = 0;
double Wednesday = 0;
double Thursday = 0;
double Friday = 0;
double Saturday = 0;
double Sunday = 0;

//declare a boolean to make sure the input is a positive double:
boolean notMon = true;
//prompt for the expense:
System.out.print("Expenses for Monday:    $");
//create a while loop that checks if the input is a positive double:
while (notMon) {
        if (myScanner.hasNextDouble() == false){
        System.out.print("Sorry, you did not enter an integer. Try again: $");
        myScanner.next();
        continue;
        }
        Monday = myScanner.nextDouble();
        if (Monday < 0){
        System.out.print("Please only enter positive numbers. Try again: $");
        continue;
        }
    notMon = false;
}

boolean notTues = true;    
System.out.print("Expenses for Tuesday:   $");
while (notTues) {
        if (myScanner.hasNextDouble() == false){
        System.out.print("Sorry, you did not enter an integer. Try again: $");
        myScanner.next();
        continue;
        }
        Tuesday = myScanner.nextDouble();
        if (Tuesday < 0){
        System.out.print("Please only enter positive numbers. Try again: $");
        continue;
        }
    notTues = false;
}

boolean notWed = true;    
System.out.print("Expenses for Wednesday: $");
while (notWed) {
        if (myScanner.hasNextDouble() == false){
        System.out.print("Sorry, you did not enter an integer. Try again: $");
        myScanner.next();
        continue;
        }
        Wednesday = myScanner.nextDouble();
        if (Wednesday < 0){
        System.out.print("Please only enter positive numbers. Try again: $");
        continue;
        }
    notWed = false;
}

boolean notThu = true;   
System.out.print("Expenses for Thursday:  $");
while (notThu) {
        if (myScanner.hasNextDouble() == false){
        System.out.print("Sorry, you did not enter an integer. Try again: $");
        myScanner.next();
        continue;
        }
        Thursday = myScanner.nextDouble();
        if (Thursday < 0){
        System.out.print("Please only enter positive numbers. Try again: $");
        continue;
        }
    notThu = false;
}

boolean notFri = true;    
System.out.print("Expenses for Friday:    $");
while (notFri) {
        if (myScanner.hasNextDouble() == false){
        System.out.print("Sorry, you did not enter an integer. Try again: $");
        myScanner.next();
        continue;
        }
        Friday = myScanner.nextDouble();
        if (Friday < 0){
        System.out.print("Please only enter positive numbers. Try again: $");
        continue;
        }
    notFri = false;
}

boolean notSat = true;    
System.out.print("Expenses for Saturday:  $");
while (notSat) {
        if (myScanner.hasNextDouble() == false){
        System.out.print("Sorry, you did not enter an integer. Try again: $");
        myScanner.next();
        continue;
        }
        Saturday = myScanner.nextDouble();
        if (Saturday < 0){
        System.out.print("Please only enter positive numbers. Try again: $");
        continue;
        }
    notSat = false;
}

boolean notSun = true;    
System.out.print("Expenses for Sunday:    $");
while (notSun) {
        if (myScanner.hasNextDouble() == false){
        System.out.print("Sorry, you did not enter an integer. Try again: $");
        myScanner.next();
        continue;
        }
        Sunday = myScanner.nextDouble();
        if (Sunday < 0){
        System.out.print("Please only enter positive numbers. Try again: $");
        continue;
        }
    notSun = false;
}
 

String mondayExpense = "";
String tuesdayExpense = "";
String wednesdayExpense = "";
String thursdayExpense = "";
String fridayExpense = "";
String saturdayExpense = "";
String sundayExpense = "";

int mondayCount = 1;
for (mondayCount = 1; mondayCount <= Math.round(Monday); mondayCount++){
    mondayExpense = mondayExpense + "*";
}

int tuesdayCount = 1;
for (tuesdayCount = 1; tuesdayCount <= Math.round(Tuesday); tuesdayCount++){
    tuesdayExpense = tuesdayExpense + "*";
}

int wednesdayCount = 1;
for (wednesdayCount = 1; wednesdayCount <= Math.round(Wednesday); wednesdayCount++){
    wednesdayExpense = wednesdayExpense + "*";
}

int thursdayCount = 1;
for (thursdayCount = 1; thursdayCount <= Math.round(Thursday); thursdayCount++){
    thursdayExpense = thursdayExpense + "*";
}

int fridayCount = 1;
for (fridayCount = 1; fridayCount <= Math.round(Friday); fridayCount++){
    fridayExpense = fridayExpense + "*";
}

int saturdayCount = 1;
for (saturdayCount = 1; saturdayCount <= Math.round(Saturday); saturdayCount++){
    saturdayExpense = saturdayExpense + "*";
}

int sundayCount = 1;
for (sundayCount = 1; sundayCount <= Math.round(Sunday); sundayCount++){
    sundayExpense = sundayExpense + "*";
}

System.out.println("Mon:  " + mondayExpense);
System.out.println("Tues: " + tuesdayExpense);
System.out.println("Wed:  " + wednesdayExpense);
System.out.println("Thu:  " + thursdayExpense);
System.out.println("Fri:  " + fridayExpense);
System.out.println("Sat:  " + saturdayExpense);
System.out.println("Sun:  " + sundayExpense);

double average;
average = ((Monday + Tuesday + Wednesday + Thursday + Friday + Saturday + Sunday) / 7 ) * 100;
    average = (int)average / 100.0;
System.out.println("Your average weekly expenses are: $" + average);

int weekCount = 1;
double weekly = 0;
for (weekCount = 1; weekCount <= 208; weekCount++){
    weekly =( weekly + (((Math.random()*0.40)+0.81)*average) );
}
weekly = weekly * 100;
    weekly = (int)weekly / 100.0;

System.out.println("Estimated expenditure for 4 years: $" + weekly);

    }  //end of main method
}      //end of class