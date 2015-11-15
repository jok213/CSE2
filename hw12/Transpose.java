//////////////////////////////////////////////////////
//Joshua Kapcsos
//November 17, 2015
//CSE 002: Fundamentals of Programming
//Transpose Program

//In a new program called Transpose.java, implement matrix transposition on random matrices:  
//Begin by implementing a method called randomMatrix() that accepts two input variables:
    //These variables, width and height, are integer sizes for the matrix.
    //As output, randomMatrix() produces a two dimensional array of integers, in row-major representation,
        //whose elements are random integers between -10 and 10.
//Implement a second method called printMatrix() that prints two dimensional matrices represented in row-major format.
    //Introduce a test in this method that checks to make sure that the input matrix is rectangular.
    //Print out a warning that the matrix is not rectangular if it is indeed not rectangular.
//Next, implement a method called transposeMatrix() that:
    //takes a matrix represented by a two dimensional array in row-major format as input
    //returns a new two dimensional array in row major format that describes the transpose of that matrix.
//Finally, implement a main method that:
    //asks the user for width and height,
        //asking again (as many times as is necessary) if the user doesn’t enter integers or positive values.
    //Once these values are provided,
        //generate the matrix,
        //print the matrix,
        //then generate the transpose,
        //and print the transpose.
        
import java.util.Scanner;
    //imports the scanner class for inputs        

public class Transpose{ //public class

    public static int[][] randomMatrix(int width, int height) {
        //method that accepts two integers and returns a two-dimensional array of integers
        int[][] stuff = new int[height][width]; //declares a two-dimensional array with dimensions that match the height and width
        for (int i = 0; i<height; i++) {
            //for loop runs in increments of 1 until it reaches the height, the amount of member arrays
            for (int j = 0; j<width; j++) {
                //for loop runs in increments of 1 until it reaches the width, the integers in each member array
                stuff[i][j] = (int) ((Math.random()*22)-11);
                //each member of each member array is a random integer from -10 to 10
            }
        }
        return stuff;
        //returns the two-dimensional array that was created
    } //end of method
    
    public static void printMatrix(int[][] stuff) {
        //method that accepts a two-dimensional array of integers
        
        //test to make sure two-dimensional array is rectangular:
        int counter = stuff[0].length; //declares an integer variable that will hold the length of each member array
        for (int k = 1; k<stuff.length; k++) {
            //for loop that runs in increments of 1 until it reaches the length of the first dimension, the amount of member arrays
            if (stuff[k].length != counter) {
                System.out.println("WARNING: Array is not rectangular.");
                //if the length of the member array in question does not equal the one before it, a warning is given that it is not rectangular
            }
            counter = stuff[k].length; //the new counter becomes the length of the member array that was in question, before moving to the next
        }
        
        //part of the method that prints the two-dimensional array:
        for (int i = 0; i<stuff.length; i++) {
            //for loop that runs in increments of 1 until it reaches the length of the first dimension, the amount of member arrays
            for (int j = 0; j<stuff[i].length; j++) {
                //for loop that runs in increments of 1 until it reaches the length of the second dimension, the amount of integers in each member array
                //each element will have the same amount of characters:
                if ((stuff[i][j] > -10 && stuff[i][j] < 0) || stuff[i][j] == 10) {
                    System.out.print(" " + stuff[i][j] + " ");
                    //if the number is -9 to -1 or 10, it gets a space before and after being printed
                }    
                else if (stuff[i][j] >= 0 && stuff[i][j] < 10) {
                    System.out.print("  " + stuff[i][j] + " ");
                    //if the number is 0 to 9, it gets two spaces before being printed and one space after
                }
                else {
                    System.out.print(stuff[i][j] + " ");
                    //if the number is -10, it gets only one space after being printed
                }
            }
            System.out.println("");
            //ends the line before moving on to the next member array
        }
    } //end of method
    
    public static int[][] transposeMatrix(int[][] stuff) {
        //method that accepts a two-dimensional array of integers and returns a two-dimensional array of integers
        int width = stuff.length; //the width of the new array is the height of the input
        int height = stuff[0].length; //the height of the new array is the width of the input
        int[][] transpose = new int[height][width]; //declare a new array that has the swapped dimensions
        for (int i = 0; i<transpose.length; i++) {
            //for loop runs in increments of 1 until it reaches the height value, the amount of member arrays
            for (int j = 0; j<transpose[i].length; j++) {
                //for loop runs in increments of 1 until it reaches the width value, each integer in the member array
                transpose[i][j] = stuff[j][i];
                //the transposed array only switches the coordinates of the original array, and this fills the transposed array as such
            }    
        }
        return transpose;
        //returns the transposed array
    } //end of method

    public static void main(String [] args) {
    //main method required for every Java program
        
        Scanner myScanner = new Scanner(System.in);
            //declares an instance of the Scanner object and call the Scanner constructor
            //tells Scanner that an instance is being created and will take input from STDIN
        boolean acceptable = false; //declare a boolean for the integer tests
        int width = 0;              //declare a width variable
        int height = 0;             //declare a height variable
        System.out.print("Enter the width of the matrix: "); //prompts user for a width of the matrix
        while (!acceptable) {
        //check if the input is an int.
            if (myScanner.hasNextInt() ) {
            //if so, store it.
                width = myScanner.nextInt();
                //calls a method that Scanner objects have - "nextInt()" method
                //can only be accessed by telling Java that a method part of myScanner object is needed
                    if (width > 0) {
                        acceptable = true;
                        //if the input is positive, it is accepted, and the loop is exited by changing the boolean to true
                    }
                    else if (width <= 0) {
                        System.out.println("   ERROR: Your width must be positive.");
                        System.out.print("Input your desired width: ");
                        continue;
                        //if the input is negative or zero, an error message prompts for a new input, and the loop goes back to the beginning
                    }    
            }
            else {
                //if not an int, trash it.  This does not assign the output of 
                //next() to anything. The output is just discarded.
                System.out.println("   ERROR: Please type in an integer.");
                System.out.print("Input your desired width: ");
                myScanner.next();
            }
        }
        acceptable = false; //change the boolean back to false for the next input test
        System.out.print("Enter the height of the matrix: "); //prompts user for a height of the matrix
        while (!acceptable) {
        //check if the input is an int.
            if (myScanner.hasNextInt() ) {
            //if so, store it.
                height = myScanner.nextInt();
                //calls a method that Scanner objects have - "nextInt()" method
                //can only be accessed by telling Java that a method part of myScanner object is needed
                    if (height > 0) {
                        acceptable = true;
                        //if the input is positive, it is accepted, and the loop is exited by changing the boolean to true
                    }
                    else if (height <= 0) {
                        System.out.println("   ERROR: Your height must be positive.");
                        System.out.print("Input your desired height: ");
                        continue;
                        //if the input is negative or zero, an error message prompts for a new input, and the loop goes back to the beginning
                    }    
            }
            else {
                //if not an int, trash it.  This does not assign the output of 
                //next() to anything. The output is just discarded.
                System.out.println("   ERROR: Please type in an integer.");
                System.out.print("Input your desired height: ");
                myScanner.next();
            }
        }
        int[][] stuff = randomMatrix(width, height); //declares an array by calling on the method that creates a random matrix from the width and height inputs
        System.out.println("Original matrix:"); //prints "Original matrix:"
        printMatrix(stuff); //calls on the method that tests for and prints a two-dimensional rectangular matrix
        int[][] transpose = transposeMatrix(stuff); //declares a matrix by calling on the method that tranposes the original matrix
        System.out.println("Transposed matrix:"); //prints "Tranposed matrix:"
        printMatrix(transpose); //calls on the method that tests for and prints a two-dimensional rectangular matrix
    } //end of main method
    
} //end of class