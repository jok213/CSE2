//////////////////////////////////////////////////////
//Joshua Kapcsos
//October 2, 2015
//CSE 002: Fundamentals of Programming
//Getting Loopy Lab

//Program should:
//Simple loop that generates a sequence of numbers up to 7.
//Use another loop to print out multiple 7s

public class GettingLoopy{
    //main method required for every Java program
    public static void main(String [] args) {
        
//declare variables        
int counter = 1;         //counts from 1 to 7
int counter2 = 1;        //counts from 1 to 5 for the string of sevens
String counterVal = "";  //will print the digits 1 to 7
String counterSev = "7"; //will print string of sevens
while (counter < 8) {
    counterVal += Integer.toString(counter);
    counter++;
    //each time the counter goes up, it adds itself to the string until it terminates at 8
}    
while (counter2 < 6) {
    counterSev += "7";
    counter2++;
    //each time the counter goes up, it adds "7" to the string until it terminates at 6
}

//print the results:
System.out.println("Step 1:");
System.out.println(counterVal + counterSev);

//print a blank line and Step 2:
System.out.println("");
System.out.println("Step 2:");

//declare variables for the while loop:
int prime = 10;           //counts possible primes from 10 to 100
int primeCount = 2;       //counts possible factors from 2 to the possible prime in question
String counterPrime = ""; //stores the primes to be printed
while (prime < 101) {
    while (primeCount < prime && prime % primeCount != 0) {
    primeCount++;
    //inner while loop makes sure each divisor has a remainder, as a prime should
    //counts up to one before itself, since dividing by itself will not have a remainder
    }
            if (primeCount == prime) {
            counterPrime += " " + prime;
            primeCount = 2;
            //if the previous count makes it all the way to itself, that means none of the possible factors were factors,
            //and the number in question is indeed a prime,
            //so it stores in the string and then resets the primeCount to 2 for the next possible prime,
            //and if it does not make it all the way to itself, then it had at least one factor, and this statement is skipped
            }
prime++;
//when the loop runs again, it will test the next number to see if it is a prime
}
//print the results:
System.out.println("WHILE LOOP:" + counterPrime);

//declare variables for the for loop:
int prime1 = 10;           //counts possible primes from 10 to 100
int primeCount1 = 2;       //counts possible factors from 2 to the number in question
String counterPrime1 = ""; //stores the primes to be printed
for (prime1 = 10; prime1 < 101; prime1++){
    //this for loop will run from 10 to 100, the possible primes, adding one each time
    for (primeCount1 = 2; primeCount1 < prime1 && prime1 % primeCount1 != 0; primeCount1++){
        //this for loop will run from 2 to one before the number in question, stopping if a remainder isn't found
        if (primeCount1 == prime1) {
            counterPrime1 += " " + prime1;
            primeCount1 = 2;
            //if the previous loop makes it all the way to itself, that means none of the possible factors were factors,
            //and the number in question is indeed a prime,
            //so it stores in the string and then resets the primeCount to 2 for the next possible prime,
            //and if it does not make it all the way to itself, then it had at least one factor, and this statement is skipped, going back to the outer loop
        }
    }
}
//print the results:
System.out.println("FOR LOOP:" + counterPrime);

//declare variables for do-while loop:
int prime2 = 10;           //counts possible primes from 10 to 100
int primeCount2 = 2;       //counts possible primes from 2 to the number in question
String counterPrime2 = ""; //stores the primes to be printed
do{
    do{
        if (prime2 % primeCount2 != 0){
        primeCount2++;
        }
        //if there isn't a remainder, the count for the factor goes up
        else {
        prime2++;
        //if there is a remainder, then the number isn't a prime, and the next number is considered
        }    
    } while (primeCount2 < prime2); //this do-while loop only runs until the number being tested as a factor reaches the number being tested as a prime
    if (prime2 < 101) {
    counterPrime2 += " " + prime2;
    //the numbers that reach the end of the previous loop that are less than 101 are stored as primes
    }
    prime2++;
    //one added to the number in question will be the next number that is tested if it is prime
    primeCount2 = 2;
    //the first possible factor gets reset to 2
} while (prime2 < 100); //this do-while loop only runs until the first prime after the number in question reaches 100,
                        //but that prime was truncated due to the previous if statement

//print the results:
System.out.println("DO WHILE LOOP:" + counterPrime2);

//print a blank line and Step 3:
System.out.println("");
System.out.println("Step 3:");

//declare variables for step 3:
int smileCount = (int)(Math.random()*196 + 5); //random integer from 5 to 200 that determines how many smileys will be printed
String smile = "";                             //stores the smiles that will be printed
for (int j = smileCount; j >= 0; j -= 20){
    //this for loop runs from the random number (between 5 to 200) to 0, subtracting 20 from the random number each time
    //tells the code how many lines will be printed
    int k = j; //k holds the remaining value of the random number without changing j, since k will be a count in the next loop
    for (int i = 1; i <= 20 && k > 0; i++, k--){
        //this loop runs under two conditions, and it stops whenever one becomes false:
            //1 to 20, adding one each time
            //k, the remainder of the random number, reaches zero, which happens in the last line that gets printed
        smile += "ツ";
        //each time the loop runs, a smiley is added to the printout
    }
    //now to print each line of smiles:
    System.out.println(smile);
    //now to reset the line of smiles to nothing so that the loop can run again
    smile = "";
}

    }  //end of main method
}      //end of class