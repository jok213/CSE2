//////////////////////////////////////////////////////
//Joshua Kapcsos
//October 20, 2015
//CSE 002: Fundamentals of Programming
//Area Program

//Program should:
//calculate the area of three different shapes:
    //a rectangle,
    //a triangle,
    //and a circle.
//Let the user choose which shape they want by typing the words “rectangle”, “triangle” or “circle” (without caps).
//Then, have the user enter the values of the dimension(s) appropriate for each shape in the form of doubles.
    //If the user enters an invalid shape:
        //state that it is not an acceptable shape,
        //indicate what the available shapes are,
        //and then ask for input again.
    //The program will not give up until an acceptable string is provided.
    //Remember to use .equals() to evaluate string equality.
//There should be four methods besides the main method:
    //one for each shape
    //and one to accept input and check that it is valid. 
//The input method will be called to accept the numerical input from the user.
    //If a double is not provided, It should ask again until a double provided.
//The question of which of the other three methods gets called depends on which shape the user chose.
    //If, for example, the user chose a triangle, the program should then
        //ask them to enter the height and the length of the base and print out the area.
        //If the user enters a non-double as the height print an error message and ask them to try again, using the input method.

import java.util.Scanner;
    //imports the scanner class for inputs
    
public class Area{
        //main method required for every Java program
    public static void main(String [] args) {
            
Scanner myScanner = new Scanner(System.in);
    //declares an instance of the Scanner object and call the Scanner constructor
    //tells Scanner that an instance is being created and will take input from STDIN

//
//prompt the user for the shape being calculated
String input = ""; //variable that holds the shape
System.out.println("For which shape would you like to calculate the area?");
System.out.print("Please enter either 'rectangle', 'triangle', or 'circle': ");
int shape = check( myScanner.next() ); //calls the method that records which shape is being calculated

//If shape equals 1, a rectangle is being calculated
if ( shape == 1 ) {
    System.out.print("Please enter the value of the length as a double: ");
    double length = input( myScanner.next() ); //checks to make sure the length is a double
    System.out.print("Please enter the value of the width as a double: ");
    double width = input( myScanner.next() );  //checks to make sure the width is a double
    System.out.println("The area of the rectangle is " + rectArea( length, width ) );
    //calls on the method that calculates the rectangle's area and then prints it
}
//If shape equals 2, a triangle is being calculated
else if (shape == 2 ) {
    System.out.print("Please enter the value of the base as a double: ");
    double base = input( myScanner.next() );  //checks to make sure the base input is a double
    System.out.print("Please enter the value of the height as a double: ");
    double height = input( myScanner.next() );//checks to make sure the height input is a double
    System.out.println("The area of the triangle is " + triArea( base, height ) );
    //calls on the method that calculates the triangle's area and then prints it
}
//If shape equals 3, a circle is being calculated
else if (shape == 3 ) {
    System.out.print("Please enter the value of the radius as a double: ");
    double radius = input( myScanner.next() ); //checks to make sure the radius input is a double
    System.out.println("The area of the circle is " + circArea( radius ) );
    //calls on the method that calculates the circle's area and then prints it
}

    }  //end of main method
    
    //this method will check to make sure the strings from the scanner contain the words "rectangle", "triangle", or "circle"
    public static int check( String input1 ) { //takes a string as the input
        Scanner myScanner = new Scanner(System.in); //makes it possible to record a new input after reprompting
        boolean acceptable = false; //set the original boolean to false to set up the loop
        int output = 0; //output is originally zero
        while (!acceptable) { //this while loop runs until acceptable becomes true
            if ( input1.equals("rectangle") ) {
                acceptable = true;
                    output = 1;
                    //if the input is rectangle, the output is 1 and the loop is exited
                }    
            else if ( input1.equals("triangle") ) {
                acceptable = true;
                    output =  2;
                    //if the input is triangle, the output is 2 and the loop is exited
                }
            else if ( input1.equals("circle") ) {
                acceptable = true;
                    output = 3;
                    //if the input is circle, the output is 3 and the loop is exited
                }
            else { 
                System.out.println("   ERROR: Your shape is invalid. Valid shapes are rectangle, triangle, and circle.");
                System.out.print("Input your desired shape: ");
                input1 = myScanner.next();
                //if input does not match one of the valid shapes, the user is reprompted and the loop continues
                }
        }
        return output; //returns the integer that corresponds to whatever shape's area is being calculated
    } //end of method
    
    //will check to make sure that the dimension inputs are doubles
    public static double input( String input2 ) {
        Scanner myScanner = new Scanner(System.in); //takes a new input when reprompted
        boolean acceptable = false; //set the boolean that controls the loop to false
        double input3 = 0; //this possibly modified output will return the result of this method
        while (!acceptable) { //this loop runs until acceptable becomes true
            try {
            Double.parseDouble(input2);
            acceptable = true;
            input3 = Double.parseDouble(input2);
            //if the string is parsable into a double, the loop is exited by changing the boolean to true, and the double is recorded
            } catch (NumberFormatException e) {
            System.out.println("   ERROR: You must enter a double");
                System.out.print("Input the dimension: ");
                input2 = myScanner.next();
            //if the string is not parsable into a double, an error message occurs and the user is reprompted  
            } 
        }    
    return input3; //returns the value after this method makes sure it's a double
    } //end of method
    
    //this method calculates the area of a rectangle
    public static double rectArea( double length, double width ) { //it takes length and width, and it returns a double
        double area = (length * width); //the area of a rectangle is the length multiplied by the width
        return area; //the area is returned when the method is called
    } //end of method
    
    //this method calculates the area of a triangle
    public static double triArea( double base, double height ) { //it takes the base and height, and it returns a double
        double area = ( (base * height)/2); //the area of a triangle is the base multiplied by the height, divided by 2
        return area; //the area is returned when the method is called
    } //end of method
    
    //this method calculates the area of a circle
    public static double circArea( double radius ) { //it takes the radius, and it returns a double
        double area = ( Math.PI * radius * radius ); //the area of a circle is pi times the square of the radius
        return area; //the area is returned when the method is called
    } //end of method
    
}      //end of class