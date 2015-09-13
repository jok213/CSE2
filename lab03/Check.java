//////////////////////////////////////////////////////
//Joshua Kapcsos
//September 11, 2015
//CSE 002: Fundamentals of Programming
//Check lab

//Premise:
//User has gone out to dinner with friends. After they receive the bill, they decide to split the check evenly
//Program should:
//Use the Scanner class to obtain from the user:
    //the original cost of the check
    //the percentage tip they wish to pay
    //the number of ways the check will be split
//Then determine how much each person in the group needs to spend in order to pay the check.

//In order to use Scanner class, it must be imported otherwise the compiler will generate error messages
//This must be the first statement after comments:
import java.util.Scanner;

public class Check{
    //main method required for every Java program
    public static void main(String[] args) {
        
Scanner myScanner = new Scanner( System.in ) ;
    //declares an instance of the Scanner object and call the Scanner constructor
    //tells Scanner that an instance is being created and will take input from STDIN
        
System.out.print("Enter the original cost of the check in the form xx.xx: ");
    //prompts the user for the original cost of the check
    //note: because there is no ln, the cursor will not go to the next line after printing this

double checkCost = myScanner.nextDouble();
    //calls a method that Scanner objects have - "nextInt()" method
    //can only be accessed by telling Java that a method part of myScanner object is needed
    //to accept an int, nextInt() method of the Scanner object will be used
    //e.g., my Scanner.nextInt()
    
System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
double tipPercent = myScanner.nextDouble();
tipPercent  /= 100; //We want to convert the percentage into a decimal value
    //prompts the user for the tip percentage that they wish to pay and accept the input
    
System.out.print("Enter the number of people who went out to dinner: ");
int numPeople = myScanner.nextInt();
    //prompts the user for the number of people that went out to dinner and accept the input
    
//print out the output, since all the input needed from the user is here
    //output the amount that each member of the group needs to spend in order to pay the check
double totalCost;
double costPerPerson;
int dollars,   //whole dollar amount of cost 
      dimes, pennies; //for storing digits
          //to the right of the decimal point 
          //for the cost$ 
totalCost = checkCost * (1 + tipPercent);
costPerPerson = totalCost / numPeople;
//get the whole amount, dropping decimal fraction
dollars=(int)costPerPerson;
//get dimes amount, e.g., 
// (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
//  where the % (mod) operator returns the remainder
//  after the division:   583%100 -> 83, 27%5 -> 2 
dimes=(int)(costPerPerson * 10) % 10;
pennies=(int)(costPerPerson * 100) % 10;
System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);

//Note: Java has an easier, but more sophisticated, way than used here to print doubles in a nice format.

    }   //end of main method
}   //end of class