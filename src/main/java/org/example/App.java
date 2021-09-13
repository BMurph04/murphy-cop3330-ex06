/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Brendon Murphy
 */
package org.example;
import java.util.Scanner;
import java.util.Calendar;


public class App 
{
    public static void main( String[] args )
    {
        //input
        Scanner input = new Scanner(System.in);

        System.out.println("What is your current age?");
        String ageCurrentString = input.nextLine();

        System.out.println("At what age would you like to retire?");
        String ageRetireString = input.nextLine();

        //conversions and processing
        int ageCurrentInt = Integer.parseInt(ageCurrentString);
        int ageRetireInt = Integer.parseInt(ageRetireString);

        int yearsLeft = ageRetireInt - ageCurrentInt;

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int yearRetire = year + yearsLeft;

        //output
        if(ageRetireInt < ageCurrentInt){
            System.out.println("You can already retire!");
        }
        else {
            System.out.println("You have " + yearsLeft + " years left until you can retire.");
            System.out.println("It's " + year + ", so you can retire in " + yearRetire + ".");
        }


    }
}
