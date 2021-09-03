package com.firstpackage;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Take user input
        Scanner sc = new Scanner(System.in);

        // Generating random number
        int myNumber = (int)(Math.random() * 100);

        // Initializing user input
        int userNumber = 0;

        // Using Do while loop
        do {
            System.out.println("Guess My Number from 1-100");
            userNumber = sc.nextInt();
        // Using if else-if conditional statements
            if (userNumber == myNumber) {
                System.out.println("WOOHOO... You have guessed my number");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your guess is too large");
            } else {
                System.out.println("Your guess is too small");
            }
        }
            while (userNumber >= 0) ;

        // Printing my number on the screen
            System.out.println("My number was");
            System.out.println(myNumber);

    }
}

