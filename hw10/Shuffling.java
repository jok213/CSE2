//////////////////////////////////////////////////////
//Joshua Kapcsos
//October 31, 2015
//CSE 002: Fundamentals of Programming
//Shuffling program

//Program should:
//Be given a deck of 52 cards, represented by the array cards of Strings
//Print out all the cards in the deck,
//shuffle the whole deck of cards,
//then print out the cards in the deck, all shuffled,
//then pick out a hand (pick randomly 5 cards of deck) and print them out.

//The method printArray(list):
    //takes an array of Strings and prints out each element, separated by a space “ “
//The method shuffle(list):
    //shuffles the elements of the list by continuously randomize an index number of list (that is not zero)
    //and swaps the element at that index with the first element (at index 0).
    //Swap however many times you like, but choose > 50 times since you want the deck of 52 cards well shuffled.
//The method randomizeHand(list) is very self-explanatory:
    //pick out 5 Strings of array list and return them as an array of 5 Strings.
    //Warning: make sure your program does not pick the same item twice!!!

import java.util.Scanner;
    //imports the scanner class for inputs
    
  public class Shuffling{
      //main method required for every Java program
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in); //creates an example of the scanner
    String[] suitNames={"C","H","S","D"}; //suits club, heart, spade or diamond  
String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"}; //array of strings that hold the rank numbers
String[] cards = new String[52]; //there are 52 elements in the array that holds the cards
String[] hand = new String[5];   //there are 5 elements in the array that holds the randomized hand
for (int i=0; i<52; i++){ //this loop runs from 0 to 51 in increments of 1, for all of the cards
  cards[i]=rankNames[i%13]+suitNames[i/13];
  //assigns each element in the array a suit and a rank, creating all of the cards
}
printArray(cards);                      //calls the method that prints the array of cards
shuffle(cards);                         //calls the method that shuffles the array of cards
printArray(cards);                      //calles the method that prints the array of shuffled cards
hand = randomizeHand(cards);            //the array "hand" equals the return of the method that creates a randomized hand of 5 cards
printArray(hand);                       //calls the method that prints the randomized hand
  }
  
  public static void printArray(String[] hand) {
      //method that takes an array of strings and then prints it
      for (int i=0; i<hand.length; i++) { //for loop runs from 0 to the amount of card values in the array, in increments of 1
      System.out.print(hand[i]+" ");
      //prints the element of the array followed by a space
      }
      System.out.println("");
      //prints an empty line
  } //end of main method

  public static String[] shuffle(String[] cards) {
      //method that takes an array of strings and returns an array of shuffled elements
      System.out.println("Shuffled");
      //prints "Shuffled"
      for (int i=0; i<cards.length; i++) { //for loop runs from 0 to the amount of cards in the array, in increments of 1, so there are 52 shuffles
	//find a random member to swap with by taking an integer of multipying the amount of cards in the array to a random number from 0 to 1
	int target = (int) (cards.length * Math.random() );

	//swap the values
	String temp = cards[target];
	cards[target] = cards[i];
	cards[i] = temp;
    }
    return cards;
    //returns the new array of shuffled cards
  }  //end of method
  
  public static String[] randomizeHand(String[] cards) {
      //method that takes an array of strings and returns a randomized hand of 5 cards
      System.out.println("Randomized hand!");
      //prints "Randomized hand!"
      String [] randomHand = new String[5]; 
      //this array of strings will have 5 elements for the randomized hand
      randomHand[0] = cards[(int) (cards.length * Math.random()) ]; 
      //the first card is chosen randomly from the array of 52 shuffled cards
      for (int i=1; i<5; i++){ //the rest of the five cards are going to be chosen in a for loop that makes sure they aren't repeated
          boolean acceptable = false; 
          //boolean that will eventually exit the loop when it becomes true
          do{ //this do-while loop chooses a random card and then checks if it has already been chosen
          randomHand[i] = cards[(int) (cards.length * Math.random()) ]; 
          //chooses a random card from the array of shuffled cards
            for (int k=0; k<i; k++) { //this for loop runs from the cards that have previously been chosen
                if (randomHand[i] == randomHand[k]) {
                    randomHand[i] = cards[(int) (cards.length * Math.random()) ];
                    continue;
                    //if the random card chosen matches whichever previous card is being evaluated in the loop,
                    //the loop goes back to the beginning to choose a different random card
                }
                else {
                    acceptable = true;
                    //if the random card does not match whichever previous card is being evaluated in the loop,
                    //the boolean is changed to true, exiting the loop
                }
            }  
          } 
          while(!acceptable);
          //allows the loop to be exited when the random card does not match the previously chosen random cards
      }
      return randomHand;
      //returns the array of five randomized cards
  } //end of method
  
}   //end of class
