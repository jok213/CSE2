//////////////////////////////////////////////////////
//Joshua Kapcsos
//September 20, 2015
//CSE 002: Fundamentals of Programming
//Poker Hand Check Program

//Program should:
//Randomly drew five cards, each from a different shuffled deck
//Detect whether the five cards contain a pair, two pair, or three of a kind
//If none of these special hands exist, report that you have a "high card hand"
//Simulate the drawing of the cards with randomly assigned variables

public class PokerHandCheck{
    //main method required for every Java program
    public static void main(String [] args) {

//Card 1:    
//Declare variables:
String cardValue1 = ""; //card number or name
String suit1 = "";      //card suit
int card1 = (int)(Math.random()*52)+1; //value of the card from 1 to 52
    //int card = (int)(Math.random()*(upperBound+1))+baseNum;

//set the suits based on sets of 14 numbers
//then Subtract to get back down to integers 1-13 for each suit
if (card1 <= 13) {
    suit1 = "Diamonds";
}    
if (card1 >= 14 && card1 <= 26) {
    suit1 = "Clubs";
    card1 = card1 - 13;
}    
if (card1 >= 27 && card1 <= 39) {
    suit1 = "Hearts";
    card1 = card1 - 26;
}   
if (card1 >= 40) {
    suit1 = "Spades";
    card1 = card1 - 39;
}

//switch the royal card integers to the actual names of the cards
//set the default to convert the integer of the non-royal cards to a string
//since the output will be a string
switch (card1) {
    case 1:
    cardValue1 = "Ace";
    break;
    case 11:
    cardValue1 = "Jack";
    break;
    case 12:
    cardValue1 = "Queen";
    break;
    case 13:
    cardValue1 = "King";
    break;
    default:
    cardValue1 = Integer.toString(card1);
    break;
}

//Card 2:
//Declare variables:
String cardValue2 = ""; //card number or name
String suit2 = "";      //card suit
int card2 = (int)(Math.random()*52)+1; //value of the card from 1 to 52
    //int card = (int)(Math.random()*(upperBound+1))+baseNum;

//set the suits based on sets of 14 numbers
//then Subtract to get back down to integers 1-13 for each suit
if (card2 <= 13) {
    suit2 = "Diamonds";
}    
if (card2 >= 14 && card2 <= 26) {
    suit2 = "Clubs";
    card2 = card2 - 13;
}    
if (card2 >= 27 && card2 <= 39) {
    suit2 = "Hearts";
    card2 = card2 - 26;
}   
if (card2 >= 40) {
    suit2 = "Spades";
    card2 = card2 - 39;
}

//switch the royal card integers to the actual names of the cards
//set the default to convert the integer of the non-royal cards to a string
//since the output will be a string
switch (card2) {
    case 1:
    cardValue2 = "Ace";
    break;
    case 11:
    cardValue2 = "Jack";
    break;
    case 12:
    cardValue2 = "Queen";
    break;
    case 13:
    cardValue2 = "King";
    break;
    default:
    cardValue2 = Integer.toString(card2);
    break;
}

//Card 3:
//Declare variables:
String cardValue3 = ""; //card number or name
String suit3 = "";      //card suit
int card3 = (int)(Math.random()*52)+1; //value of the card from 1 to 52
    //int card = (int)(Math.random()*(upperBound+1))+baseNum;

//set the suits based on sets of 14 numbers
//then Subtract to get back down to integers 1-13 for each suit
if (card3 <= 13) {
    suit3 = "Diamonds";
}    
if (card3 >= 14 && card3 <= 26) {
    suit3 = "Clubs";
    card3 = card3 - 13;
}    
if (card3 >= 27 && card3 <= 39) {
    suit3 = "Hearts";
    card3 = card3 - 26;
}   
if (card3 >= 40) {
    suit3 = "Spades";
    card3 = card3 - 39;
}

//switch the royal card integers to the actual names of the cards
//set the default to convert the integer of the non-royal cards to a string
//since the output will be a string
switch (card3) {
    case 1:
    cardValue3 = "Ace";
    break;
    case 11:
    cardValue3 = "Jack";
    break;
    case 12:
    cardValue3 = "Queen";
    break;
    case 13:
    cardValue3 = "King";
    break;
    default:
    cardValue3 = Integer.toString(card3);
    break;
}

//Card 4:
//Declare variables:
String cardValue4 = ""; //card number or name
String suit4 = "";      //card suit
int card4 = (int)(Math.random()*52)+1; //value of the card from 1 to 52
    //int card = (int)(Math.random()*(upperBound+1))+baseNum;

//set the suits based on sets of 14 numbers
//then Subtract to get back down to integers 1-13 for each suit
if (card4 <= 13) {
    suit4 = "Diamonds";
}    
if (card4 >= 14 && card4 <= 26) {
    suit4 = "Clubs";
    card4 = card4 - 13;
}    
if (card4 >= 27 && card4 <= 39) {
    suit4 = "Hearts";
    card4 = card4 - 26;
}   
if (card4 >= 40) {
    suit4 = "Spades";
    card4 = card4 - 39;
}

//switch the royal card integers to the actual names of the cards
//set the default to convert the integer of the non-royal cards to a string
//since the output will be a string
switch (card4) {
    case 1:
    cardValue4 = "Ace";
    break;
    case 11:
    cardValue4 = "Jack";
    break;
    case 12:
    cardValue4 = "Queen";
    break;
    case 13:
    cardValue4 = "King";
    break;
    default:
    cardValue4 = Integer.toString(card4);
    break;
}

//Card 5:
//Declare variables:
String cardValue5 = ""; //card number or name
String suit5 = "";      //card suit
int card5 = (int)(Math.random()*52)+1; //value of the card from 1 to 52
    //int card = (int)(Math.random()*(upperBound+1))+baseNum;

//set the suits based on sets of 14 numbers
//then Subtract to get back down to integers 1-13 for each suit
if (card5 <= 13) {
    suit5 = "Diamonds";
}    
if (card5 >= 14 && card5 <= 26) {
    suit5 = "Clubs";
    card5 = card5 - 13;
}    
if (card5 >= 27 && card5 <= 39) {
    suit5 = "Hearts";
    card5 = card5 - 26;
}   
if (card5 >= 40) {
    suit5 = "Spades";
    card5 = card5 - 39;
}

//switch the royal card integers to the actual names of the cards
//set the default to convert the integer of the non-royal cards to a string
//since the output will be a string
switch (card5) {
    case 1:
    cardValue5 = "Ace";
    break;
    case 11:
    cardValue5 = "Jack";
    break;
    case 12:
    cardValue5 = "Queen";
    break;
    case 13:
    cardValue5 = "King";
    break;
    default:
    cardValue5 = Integer.toString(card5);
    break;
}

//now that the five cards have been chosen, we need to determine if there are any pairs
//declare variables
String Result = ""; //will eventually print the result
int pair = 0;       //counts the number of pairs

//use an if statement to determine if the strings of each card value are equal
//if the strings are equal, it adds one to the integer that counts pairs
if (cardValue1.equals(cardValue2)) {
    pair++;
}
if (cardValue1.equals(cardValue3)) {
    pair++;
}
if (cardValue1.equals(cardValue4)) {
    pair++;
}    
if (cardValue1.equals(cardValue5)) {
    pair++;
}
if (cardValue2.equals(cardValue3)) {
    pair++;
}    
if (cardValue2.equals(cardValue4)) {
    pair++;
}    
if (cardValue2.equals(cardValue5)) {
    pair++;
}
if (cardValue3.equals(cardValue4)) {
    pair++;
}
if (cardValue3.equals(cardValue5)) {
    pair++;
}
if (cardValue4.equals(cardValue5)) {
    pair++;
}

//use a switch so that one and two pairs have different cases that print different results
//the default covers if there are no pairs (the high card hand)
switch (pair) {
    case 1:
    Result = "You have a pair!";
    break;
    case 2:
    Result = "You have two pairs!";
    break;
    default:
    Result = "You have a high card hand!";
    break;
}    

//declare a variable to check for three of a kind
boolean triple = false; //determines if it is true or false that there is a triple

//now to determine if there are any triples, I check the equality of all combinations of three cards
//if there is a triple, the boolean changes to true
if (cardValue1.equals(cardValue2) && cardValue2.equals(cardValue3)) {
    triple = true;
}
if (cardValue1.equals(cardValue2) && cardValue2.equals(cardValue4)) {
    triple = true;
}
if (cardValue1.equals(cardValue2) && cardValue2.equals(cardValue5)) {
    triple = true;
}
if (cardValue1.equals(cardValue3) && cardValue3.equals(cardValue4)) {
    triple = true;
}
if (cardValue1.equals(cardValue3) && cardValue3.equals(cardValue5)) {
    triple = true;
}
if (cardValue2.equals(cardValue3) && cardValue3.equals(cardValue4)) {
    triple = true;
}
if (cardValue2.equals(cardValue3) && cardValue3.equals(cardValue5)) {
    triple = true;
}
if (cardValue3.equals(cardValue4) && cardValue4.equals(cardValue5)) {
    triple = true;
}

//if the boolean is true, the result changes to print that there are three of a kind
//if not, the default from the previous switch statement still prints that there's a high card hand
if (triple) {
    Result = "You have three of a kind!";
}    

//print the output
System.out.println("Your random cards were:");
System.out.println("    the " +cardValue1+ " of " +suit1+ ".");
System.out.println("    the " +cardValue2+ " of " +suit2+ ".");
System.out.println("    the " +cardValue3+ " of " +suit3+ ".");
System.out.println("    the " +cardValue4+ " of " +suit4+ ".");
System.out.println("    the " +cardValue5+ " of " +suit5+ ".");
System.out.println("");
System.out.println(Result);

    }  //end of main method
}      //end of class