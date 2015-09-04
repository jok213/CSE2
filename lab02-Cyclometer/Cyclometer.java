//////////////////////////////////////////////////////
//Joshua Kapcsos
//September 4, 2015
//CSE 002: Fundamentals of Programming
//Cyclometer Lab

//Bicycle cyclometers measure speed, distance, etc.
//Record two kinds of data:
    //time elapsed in seconds
    //number of rotations of the front wheel during that time

//For two trips, given time and rotation count, this program should do the following things:
    //print the number of minutes for each trip
    //print the number of counts for each tirp
    //print the distance of each trip in miles
    //print the distance for the two trips combined

public class Cyclometer {
    	// main method required for every Java program
   	public static void main(String[] args) {
//our input data

int secsTrip1=480; //This variable is the time elapsed in seconds of the first trip
int secsTrip2=3220; //This variable is the time elapsed in seconds of the second trip
int countsTrip1=1561; //This variable is the number of rotations of the front wheel during the first trip
int countsTrip2=9037; //This variable is the number of rotations of the front wheel during the second trip

//our intermediate variables and output data
double wheelDiameter=27.0, //This variable is a double and defines the diameter of the bicycle wheel
PI=3.14159, //This variable defines the number pi
feetPerMile=5280, //This variable defines the number of feet in a mile
inchesPerFoot=12, //This variable defines the number of inches in a foot
secondsPerMinute=60; //This variable defines the number of seconds per minute
double distanceTrip1, distanceTrip2, totalDistance; 
    //These variables are doubles,
    //and define the distance of each trip,
    //as well as the total distance traveled

//now to print the numbers stored in the variables that store the seconds and counts
    //The length of time in minutes is simply the seconds of each trip divided by the amount of seconds in a minute
System.out.println("Trip 1 took " +
    (secsTrip1/secondsPerMinute) +" minutes and had "+
    countsTrip1+" counts.");
System.out.println("Trip 2 took " +
    (secsTrip2/secondsPerMinute) +" minutes and had "+
    countsTrip2+" counts.");

//compute the values for the distances
distanceTrip1=countsTrip1*wheelDiameter*PI;
    //Above gives distance in inches
    //(for each count, a rotation of the wheel travels
    //the diameter in inches times PI)
distanceTrip1/=inchesPerFoot*feetPerMile; //Gives distance in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    //This is a more complicated way of giving the distance in miles
    //by multiplying the revolutions of the wheel by its diameter and by pi,
    //and then dividing by the inches in a foot and the feet in a mile
totalDistance=distanceTrip1+distanceTrip2;
    //simply added the distances of each trip here
    
//Now to print out the desired output data:
System.out.println("Trip 1 was "+distanceTrip1+" miles"); //prints distance of Trip 1
System.out.println("Trip 2 was "+distanceTrip2+" miles"); //prints distance of Trip 2
System.out.println("The total distance was "+totalDistance+" miles"); //prints total distance

	}  //end of main method   
} //end of class
