package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class App
{
    public static void main( String[] args )

    {
        int length, width, feet, gallon = 0;
        System.out.println("What is the length of the room in feet?");
        Scanner input = new Scanner(System.in);
        length = input.nextInt();
        System.out.println("What is the width of the room in feet?");
        width = input.nextInt();
        feet = length * width;
        gallon = feet / 350;
        if (feet % 350 != 0)
        {
            gallon++;
        }
        System.out.println("You will need to purchase " + gallon + " gallons of paint to cover " + feet + " square feet.");
    }
}
