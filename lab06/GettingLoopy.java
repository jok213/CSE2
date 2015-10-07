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
        
System.out.println("Step 1:");
int counter = 1;
int counter2 = 1;
String counterVal = "";
String counterSev = "7";
while (counter < 8) {
    counterVal = counterVal + Integer.toString(counter);
    counter++;
}    
while (counter2 < 6) {
    counterSev = counterSev + "7";
    counter2++;
}    
System.out.println(counterVal + counterSev);

System.out.println("");
System.out.println("Step 2:");

int prime = 10;
int primeCount = 2;
String counterPrime = "";
while (prime < 101) {
    while (primeCount < prime && prime % primeCount != 0) {
    primeCount++;
    }
            if (primeCount == prime) {
            counterPrime = counterPrime + " " + prime;
            primeCount = 2;
            }
prime++;
}
System.out.println("WHILE LOOP:" + counterPrime);

int prime1 = 10;
int primeCount1 = 2;
String counterPrime1 = "";
for (prime1 = 10; prime1 < 101; prime1++){
    for (primeCount1 = 2; primeCount1 < prime1 && prime1 % primeCount1 != 0; primeCount1++){
        if (primeCount1 == prime1) {
            counterPrime1 = counterPrime1 + " " + prime1;
            primeCount1 = 2;
        }
    }
}
System.out.println("FOR LOOP:" + counterPrime);

int prime2 = 10;
int primeCount2 = 2;
String counterPrime2 = "";
do{
    do{
        if (primeCount2 == prime2) {
            counterPrime2 = counterPrime2 + " " + prime2;
            primeCount2 = 2;
        }
        primeCount2++;
    } while (primeCount2 < prime2 && prime2 % primeCount2 != 0);
    prime2++;
}while (prime2 < 101);

System.out.println("DO WHILE LOOP:" + counterPrime2);

    }  //end of main method
}      //end of class