//////////////////////////////////////////////////////
//Joshua Kapcsos
//September 12, 2015
//CSE 002: Fundamentals of Programming
//Block Program

//Program should:
    //prompt the user for the length, width, and height of a block
    //calculate the volume of the block and the surface area.

//To use Scanner class, it must be imported otherwise the compiler will generate error messages
//This must be the first statement after comments:
import java.util.Scanner;

public class Block{
    //main method required for every Java program
    public static void main(String[] args) {

Scanner myScanner = new Scanner( System.in );
    //declares an instance of the Scanner object and call the Scanner constructor
    //tells Scanner that an instance is being created and will take input from STDIN
    
System.out.print("Enter the length of the block: ");
    //prompts the user for the length of the block
    //note: because there is no ln, the cursor will not go to the next line after printing this

double length = myScanner.nextDouble();
    //calls a method that Scanner objects have - "nextInt()" method
    //can only be accessed by telling Java that a method part of myScanner object is needed
    //to accept an int, nextInt() method of the Scanner object will be used
    //e.g., my Scanner.nextInt()
    
System.out.print("Enter the width of the block: ");
double width = myScanner.nextDouble();
    //prompts the user for the width of the block and accepts the input
    
System.out.print("Enter the height of the block: ");
double height = myScanner.nextDouble();
    //prompts the user for the height of the block and accepts the input
    
//I need to output the volume and surface area of the block, so those variables must be declared:
double volume;
double surfacearea;

//now to calculate each:
volume = length * width * height;
    //Volume is length times width times height
surfacearea = (length*height*2) + (length*width*2) + (width*height*2);
    //Surface area is the area of each face
    //Since the opposing faces are the same, I only need to calculate three of them and multiply each by two
    
//print the output
System.out.println("The volume of the block of dimensions " +length+ " x " +width+ " x " +height+ " is " +volume+ ".");
System.out.println("The surface area of the block is " +surfacearea);
    
    }   //end of main method
}       //end of class