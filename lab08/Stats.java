//////////////////////////////////////////////////////
//Joshua Kapcsos
//October 16, 2015
//CSE 002: Fundamentals of Programming
//Stats Lab

//Program should:
//Ask the user to input 5 doubles, from smallest to largest.
    //Assumes that the user always types in doubles
    //Checks to make sure that the doubles are increasing
//After recording the inputs, compute using three methods:
    //the mean of the 5 doubles,
    //the median of the 5 doubles,
    //and then print out the mean and the median.
    
import java.util.Scanner;
    //imports the scanner class for inputs
    
public class Stats{
        //main method required for every Java program
    public static void main(String [] args) {
            
Scanner myScanner = new Scanner(System.in);
    //declares an instance of the Scanner object and call the Scanner constructor
    //tells Scanner that an instance is being created and will take input from STDIN   

//declare the five input variables originally at zero:
double first = 0;
double second = 0;
double third = 0;
double fourth = 0;
double fifth = 0;

//prompt the user for the first input:
System.out.print("Input first of the five doubles from smallest to largest: ");
first = myScanner.nextDouble(); //stores the first double


boolean acceptable = false;
//loop until you get acceptable input        
System.out.print("Input the second double: ");
    //prompts the user for the second double

while (!acceptable) {
    //check if the input is larger than the first.
    second = myScanner.nextDouble();
    if (second >= first) {
        //if so, store it and exit the loop by changing the boolean to true
        acceptable = true;
    }
    else {
        System.out.println("   ERROR: Your second double must be greater than the first.");
        System.out.print("Input the second double: ");
        //if the input is less than the first, an error message prompts for a new input, and the loop goes back to the beginning
    }    
}

//reset the boolean to false, and prompt for the third double:
    //same thing is done for the rest of the inputs
acceptable = false;
System.out.print("Input the third double: ");

while (!acceptable) {
    third = myScanner.nextDouble();
    if (third >= second) {
        acceptable = true;
    }
    else {
        System.out.println("   ERROR: Your third double must be greater than the second.");
        System.out.print("Input the third double: ");
    }    
}

acceptable = false;
System.out.print("Input the fourth double: ");

while (!acceptable) {
    fourth = myScanner.nextDouble();
    if (fourth >= third) {
        acceptable = true;
    }
    else {
        System.out.println("   ERROR: Your fourth double must be greater than the third.");
        System.out.print("Input the fourth double: ");
    }    
}

acceptable = false;
System.out.print("Input the fifth double: ");

while (!acceptable) {
    fifth = myScanner.nextDouble();
    if (fifth >= fourth) {
        acceptable = true;
    }
    else {
        System.out.println("   ERROR: Your fifth double must be greater than the fourth.");
        System.out.print("Input the fifth double: ");
    }    
}

//call on the average and median methods to store them as doubles in the main method:
double avg = findAvg( first, second, third, fourth, fifth );
double med = findMed( first, second, third, fourth, fifth );
//run the print method that takes the average and median variables as arguments
print( avg, med);

    } //end of main method
    
    //method to calculate the average:
    public static double findAvg( double first, double second, double third, double fourth, double fifth ){
        //take in five inputs
		double avg = (first + second + third + fourth + fifth)/5;
		    //average is the five inputs divided by five
			return avg;
			    //returns the average
    }
    
    //method to calculate the median:
    public static double findMed( double first, double second, double third, double fourth, double fifth ){
        //take in five inputs
        double med = (third);
            //median is the third of the five inputs
            return med;
                //returns the median
    }
    
    //void method to print the results:
    public static void print( double avg, double med ) {
        //takes in the average and median doubles
        System.out.println("The mean of the five numbers is " + avg + " and the median is " + med + ".");
            //prints the average and median, but only when called upon
    }

}      //end of class