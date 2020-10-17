/** 
 * Importing Scanner to be used for user input 
*/
import java.util.Scanner;

public class WeightOnPlanets
{
    public static void main(String[] args)
    {
        /** 
         * Creating variables 
        */
        double usersWeight;
        double duration;

        /** 
         * creating variable for Earth distance traveled 
        */
        double distanceTraveledEarth;
        /** 
         * creating Named Constants for Earth
        */
        double EARTH_GRAVITY = 9.8;
        double EARTH_VELOCITY = 29.8;

        /**
         *  variables for Mercury
        */
        double mercuryWeight;
        double percentageMercuryToEarth;
        double distanceTraveledMercury;
        /**
         *  creating Named Constants for Mercury 
        */
        double MERCURY_GRAVITY = 3.7;
        double MERCURY_VELOCITY = 47.4;

        /**
         *  variables for Venus 
        */
        double venusWeight;
        double percentageVenusToEarth;
        double distanceTraveledVenus;
        /** 
         * creating Named Constants for Venus 
        */
        double VENUS_GRAVITY = 8.9;
        double VENUS_VELOCITY = 35.0;

        /**
         *  variables for Venus 
        */
        double marsWeight;
        double percentageMarsToEarth;
        double distanceTraveledMars;
        /**
         *  creating Named Constants for Mars 
        */
        double MARS_GRAVITY = 3.7;
        double MARS_VELOCITY = 24.1;

        /**
         *  Creating a Scanner object to read input. 
        */
        Scanner keyboard = new Scanner(System.in);

        /**
         *  Get the user's weight 
        */
        System.out.print("Please enter your weight in kg on Earth: ");
        usersWeight = keyboard.nextDouble();

        /**
         *  Get duration of the trip from user (Mercury) 
        */
        System.out.print("Please enter the duration, in hours, of the trip: ");
        duration = keyboard.nextDouble();

        /**
         *  Calculations for Distance traveled (Earth)
        */
        distanceTraveledEarth = (duration * EARTH_VELOCITY) * 60 * 60;

        /**
         *  Calculations for Mercury weight 
        */
        mercuryWeight = MERCURY_GRAVITY * (usersWeight / EARTH_GRAVITY);
        percentageMercuryToEarth = (MERCURY_GRAVITY / EARTH_GRAVITY) * 100;
        distanceTraveledMercury = (duration * MERCURY_VELOCITY) * 60 * 60;

        /**
         *  Calculations for Venus weight 
        */
        venusWeight = VENUS_GRAVITY * (usersWeight / EARTH_GRAVITY);
        percentageVenusToEarth = (VENUS_GRAVITY / EARTH_GRAVITY) * 100;
        distanceTraveledVenus = (duration * VENUS_VELOCITY) * 60 * 60;

        /**
         *  Calculations for Mars weight 
        */
        marsWeight = MARS_GRAVITY * (usersWeight / EARTH_GRAVITY);
        percentageMarsToEarth = (MARS_GRAVITY / EARTH_GRAVITY) * 100;
        distanceTraveledMars = (duration * MARS_VELOCITY) * 60 * 60;

        /**
         * Displaying weight, and percentage for the planets(Mercury, Venus, and Mars).
         */
        System.out.print("Your weight on Mercury is " + mercuryWeight + " kg, which is \n");
        System.out.print(percentageMercuryToEarth + " percent of your weight on Earth.\n");

        System.out.print("Your weight on Venus is " + venusWeight + " kg, which is \n");
        System.out.print(percentageVenusToEarth + " percent of your weight on Earth.\n");

        System.out.print("Your weight on Mars is " + marsWeight + " kg, which is \n");
        System.out.print(percentageMarsToEarth + " percent of your weight on Earth.\n");

        /**
         * Displaying the distance traveled for the planets (Mercury, Venus, Earth, and Mars).
         */
        System.out.print("In " + duration + " hours, Mercury will travel " + distanceTraveledMercury + " km.\n");
        System.out.print("In " + duration + " hours, Venus will travel " + distanceTraveledVenus + " km.\n");
        System.out.print("In " + duration + " hours, Earth will travel " + distanceTraveledEarth + " km.\n");
        System.out.print("In " + duration + " hours, Mars will travel " + distanceTraveledMars + " km.\n");
    }
}