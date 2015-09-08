///////////////////////////////////////////////////////////////////////////////////////////////////
//Joshua Kapcsos
//September 5, 2015
//CSE 002: Fundamentals of Programming
//Arithmetic Java Program

//Premise:
//You go shopping at Walmart’s,
//and want to compute the cost of the items you bought,
//including the PA sales tax of 6%.

//Things this program should accomplish:
//Total cost of each kind of item; sales tax for that total cost
//Total cost of purchases (before tax)
//Total actually paid for this transaction, including sales tax.

//define a class
public class Arithmetic {
//add main method required for every Java program
    public static void main(String[] args) {

//our input data
    //Number of pairs of socks
int nSocks=3;
    //Cost per pair of socks
    //(‘$’ is part of the variable name)
double sockCost$=2.58;

    //Number of drinking glasses
int nGlasses=6;
    //Cost per glass
double glassCost$=2.29;

    //Number of boxes of envelopes
int nEnvelopes=1;
    //cost per box of envelopes
double envelopeCost$=3.25;

    //PA sales tax
double taxPercent=0.06;

//I need to declare these variables first though:
double totalSockCost$;       //total cost of socks
double totalGlassCost$;      //total cost of glasses
double totalEnvelopeCost$;   //total cost of envelopes
double taxSocks$;            //tax on the pairs of socks
double taxGlass$;            //tax on the glasses
double taxEnvelope$;         //tax on the envelope
double totalCost$;           //total cost of all items before tax
double totalTax$;            //total tax of all items
double totalCostTax$;        //total cost of all items after tax

//I can start by printing the item being bought,
//How many of the item is being bought,
//And the cost per item.
System.out.println("Pairs of socks are being purchased.");
System.out.println("There are " +nSocks +" pairs of socks being purchased.");
System.out.println("Each pair of socks costs $" +sockCost$ +".");
System.out.println("Glasses are being purchased.");
System.out.println("There are " +nGlasses +" glasses being purchased.");
System.out.println("Each glass costs $" +glassCost$ +".");
System.out.println("Envelopes are being purchased.");
System.out.println("There is " +nEnvelopes +" envelope being purchased.");
System.out.println("Each envelope costs $" +envelopeCost$ +".");

//Compute the total cost before tax and sales tax of the items:
//Total costs are the number of each item multiplied by the cost of each item.
//Total tax is the total cost of each item multiplied by the PA tax percent, 6%.
    //In order to keep the values at two decimal places,
    //I multiply each value by 100, convert to an integer, and then divide by 100.0
totalSockCost$=nSocks*sockCost$;
taxSocks$=totalSockCost$*taxPercent*100;
    taxSocks$=(int)taxSocks$/100.0;
totalGlassCost$=nGlasses*glassCost$;
taxGlass$=totalGlassCost$*taxPercent*100;
    taxGlass$=(int)taxGlass$/100.0;
totalEnvelopeCost$=nEnvelopes*envelopeCost$;
taxEnvelope$=totalEnvelopeCost$*taxPercent*100;
    taxEnvelope$=(int)taxEnvelope$/100.0;

//Print the total costs before tax and taxes of each item:
System.out.println("The total cost of socks before tax is $" +totalSockCost$ +".");
System.out.println("The total sales tax on socks is $" +taxSocks$ +".");
System.out.println("The total cost of glasses before tax is $" +totalGlassCost$ +".");
System.out.println("The total sales tax on glasses is $" +taxGlass$ +".");
System.out.println("The total cost of envelopes before tax is $" +totalEnvelopeCost$ +".");
System.out.println("The total sales tax on envelopes is $" +taxEnvelope$ +".");

//Compute the total cost before taxes, total tax, and total cost after taxes:
//Total cost is adding the three costs of each item.
//Total tax is adding the three taxes of each item.
//Total cost including tax is adding the total cost to the total tax.
totalCost$=(totalSockCost$+totalGlassCost$+totalEnvelopeCost$)*100;
    totalCost$=(int)totalCost$/100.0;
totalTax$=(taxSocks$+taxGlass$+taxEnvelope$)*100;
    totalTax$=(int)totalTax$/100.0;
totalCostTax$=(totalCost$+totalTax$)*100;
    totalCostTax$=(int)totalCostTax$/100.0000000;

//Print the total cost before taxes, total tax, and total cost after taxes:
System.out.println("The total cost of all items before sales tax is $" +totalCost$ +".");
System.out.println("The total sales tax of all items is $" +totalTax$ +".");
System.out.println("The total cost to be paid, including sales tax, is $" +totalCostTax$ +".");
    }
    
}