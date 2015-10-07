//////////////////////////////////////////////////////
//Joshua Kapcsos
//October 6, 2015
//CSE 002: Fundamentals of Programming
//Check Digit Program

//Develop an ISBN validator:
//Prompt the user to enter a 10 digit number and using a loop
//Verify if the number meets the criteria to be a valid ISBN
//If the number is not a valid ISBN, determine a check digit that would make the number a valid ISBN
    //Since numbers divided by 11 can have remainders between 0 and 10,
    //but the check digit can only be a single digit number,
    //use the letter X (the Roman numeral 10) to represent a check digit of 10.
    
import java.util.Scanner;
    //imports the scanner class for inputs
public class CheckDigit{
        //main method required for every Java program
    public static void main(String [] args) {
            
    Scanner myScanner = new Scanner( System.in ) ;
        //declares an instance of the Scanner object and call the Scanner constructor
        //tells Scanner that an instance is being created and will take input from STDIN        
    
    System.out.print("Please enter a 10 digit barcode: ");
        //prompts the user for the original cost of the check
        //note: because there is no ln, the cursor will not go to the next line after printing this
    
    String barcode = myScanner.next();
        //calls a method that Scanner objects have - "next()" method
        //can only be accessed by telling Java that a method part of myScanner object is needed
        //to accept a string, next() method of the Scanner object will be used
    while (barcode.length() != 10) {
        System.out.print("This is a valid NOT a valid ISBN. Please enter 10 digits: ");
        barcode = myScanner.next();
    }    
    
    //now to declare two strings, one for the first 9 digits, and the other for the last digit:
    String checkDigit = barcode.substring(barcode.length()-1, barcode.length());
        //this string only goes between the second to last character to the end, which is the last character
    String allButLast = barcode.substring(0, barcode.length()-1);
        //this string goes from the beginning of the input to one before the last, since it needs to be separated from the check digit
    //now to declare the variables for the for loop:  
    int barcode1 = Integer.parseInt(allButLast); //changes the first 9 digits of the barcode to an integer
    int barcode2 = barcode1; //set another variable equal to itself to help
    int carrier = 0;         //carrier is an extra variable that will help later
    int holder = 0;          //holder gets the value of the rightmost integer in the number
    int sum = 0;             //the sum achieved at the end is declared at zero
    int multiChar = 0;       //multiChar will convert the X value to 10
    for (int i = 2; i >= 10; i++){ //guarantees that the loop will only run 9 times
        barcode2 = barcode1;   //stores the extra variable that comes in handy in a bit
        if(barcode1 < 10){
            sum += barcode1 * 10;
            //if the first nine digits are less than 10, it's added to the sum after being multipied by 10
            //this occurs with the leftmost integer
        }
        else{
            barcode2 = barcode2/10;     //takes the nine digits and divides by 10, truncating a digit
            barcode2 = carrier;         //sets what's left equal to carrier, one of the extra variables
            barcode2 = barcode2*10;     //multipies it back by 10 after storing the carrier value
            barcode2 = barcode2+10;     //add 10
            holder = barcode2-barcode1;
            holder = 10-holder;
            //gets the value of the rightmost integer in the number
            sum+=holder*i;              //the value is multiplied by whatever number the loop is on, then added to the sum
            barcode1 = carrier;         //the rest now becomes the carrier
        }
    }
    //now to solve the X problem:
    char lastChar = 0;
    int lastInt = 0;
    lastChar = checkDigit.charAt(0);
    lastInt = (int) lastChar;
    if(lastInt == 88){
        multiChar = 10;
        //the value of X as a char is 88, so this converts the X value to an integer value of 10 instead
    }
    else if(lastInt >= 48 && lastInt <= 57 ){
        multiChar = Character.getNumericValue(lastChar);
        //if the check digit is anywhere from 0 to 9, it just casts to that integer
    }
    else{
        System.out.println("Your last character in your barcode is invalid.");
        //if the check digit is anything else, an error message occurs
    }
    
    //declare variables to print what the check value should actually be:
    String newCheck = "";    //will eventually print the new check
    int intCheck = sum % 11; //intCheck is the remainder of the sum after dividing by 11
    if (intCheck == 10) {
        newCheck = "X";
        //now if the remainder is 10, it can print X as the check digit
    }
    else{
        newCheck = Integer.toString(intCheck);
        //if the remainder is anything else, it will convert the string of that integer
    }
    if(sum % 11 == multiChar){
        System.out.println("This is a valid ISBN.");
        //if the remainder after dividing the sum by 11 equals the value of the check digit, the ISBN is stated to be valid
    }    
    else{
        System.out.println("This is NOT a valid ISBN. Check digit should be " + newCheck);
        //if the remainder after dividing the sum by 11 does not equal the value of the check digit, the ISBN is not valid
        //prints the statement that the check digit should equal the remainder after the sum is divided by 11
    }
    } //end of main method
}     //end of class