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
        //calls a method that Scanner objects have - "nextInt()" method
        //can only be accessed by telling Java that a method part of myScanner object is needed
        //to accept an int, nextInt() method of the Scanner object will be used
        //e.g., my Scanner.nextInt()
    
    String lastChar = barcode.substring(barcode.length()-1, barcode.length());
    String allButLast = barcode.substring(0, barcode.length()-1);
    int barcode1 = Integer.parseInt(allButLast);
    int barcode2 = barcode1;
    int carrier = 0;
    int holder = 0;
    int sum = 0;
    int multiChar = 0;
    for (int i=10; i>1; i--){
        barcode2 = barcode1;
        if(barcode1<10){
            sum+=barcode1*2;
        }
        else{
            barcode2 = barcode2/10;
            barcode2 = carrier;
            barcode2 = barcode2*10;
            barcode2 = barcode2+10;
            holder = barcode2-barcode1;
            holder = 10-holder;
            //Gets the value of the rightmost integer in the number.
            sum+=holder*i;
            barcode1 = carrier;
        }
    }
    if(lastChar==88){
        multiChar = 10;
    }
    else if(lastChar>=48&&lastChar<=57){
        multiChar = Integer.parseInt(lastChar);
    }
    else{
        System.out.println("Your last character in your barcode is invalid.");
    }
    if (sum % 11 == multiChar){
        System.out.println("This is a valid ISBN.");
    }
    if (sum % 11 != multiChar){
        System.out.println("This is NOT a valid ISBN. Check digit should be " + sum % 11);
    }
}
}