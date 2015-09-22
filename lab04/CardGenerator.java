//////////////////////////////////////////////////////
//Joshua Kapcsos
//September 18, 2015
//CSE 002: Fundamentals of Programming
//Card Generator Lab

//Write a program that will pick a random card from a deck
//Use a random number generator to select a number from 1 to 52 (inclusive).
//Each number represents one card, and the suits are grouped:
    //Cards 1-13 represent the diamonds
    //14-26 represent the clubs
    //then hearts
    //then spades.
//In all suits, card identities ascend in step with the card number:
    //14 is the ace of clubs, 
    //15 is the 2 of clubs,
    //and 26 is the king of clubs.
//After you generate a random number, create two String variables:
    //a String corresponding to the name of the suit
    //and a String corresponding to the identity of the card.
//Use if statements to assign the suit name.
//Use a switch statement to assign the card identity.
//Print out the name of the randomly selected card.

public class CardGenerator{
    //main method required for every Java program
    public static void main(String [] args) {

//Declare variables:
String cardValue = ""; //card number or name
String suit = "";      //card suit
int card = (int)(Math.random()*52)+1; //value of the card from 1 to 52
    //int card = (int)(Math.random()*(upperBound+1))+baseNum;

//set the suits based on sets of 14 numbers
//then Subtract to get back down to integers 1-13 for each suit
if (card <= 13) {
    suit = "Diamonds";
}    
if (card >= 14 && card <= 26) {
    suit = "Clubs";
    card = card - 13;
}    
if (card >= 27 && card <= 39) {
    suit = "Hearts";
    card = card - 26;
}   
if (card >= 40) {
    suit = "Spades";
    card = card - 39;
}

//switch the royal card integers to the actual names of the cards
//set the default to convert the integer of the non-royal cards to a string
//since the output will be a string
switch (card) {
    case 1:
    cardValue = "Ace";
    break;
    case 11:
    cardValue = "Jack";
    break;
    case 12:
    cardValue = "Queen";
    break;
    case 13:
    cardValue = "King";
    break;
    default:
    cardValue = Integer.toString(card);
    break;
}

//print the output
System.out.println ("You picked the " +cardValue+ " of " +suit+ ".");
    
    }   //end of main method
}       //end of class 