package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christina Persaud
 */

public class App 
{
    public static void main( String[] args )
    {

        Scanner scan1 = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? ");
        String question1 = scan1.nextLine();

        if (question1.equals("y")) {
            Scanner scan2 = new Scanner(System.in);
            System.out.print("Are the battery terminals corroded? ");
            String question2 = scan2.nextLine();
            if (question2.equals("y")) {
                System.out.print("Clean terminals and try starting again. ");
            } else {
                System.out.print("Replace cables and try again. ");
            }
        }

        else {
        Scanner scan3 = new Scanner(System.in);
        System.out.print("Does the car make a slicking noise? ");
        String question3 = scan3.nextLine();
        if (question3.equals("y")){
            System.out.print("Replace the battery. ");
        }
        else{
            Scanner scan4 = new Scanner(System.in);
            System.out.print("Does the car crank up but fail to start?");
            String question4 = scan4.nextLine();
            if (question4.equals("y")){
                System.out.print("Check spark plug connections. ");
            }
            else{
                Scanner scan5 = new Scanner(System.in);
                System.out.print("Does the engine start and then die? ");
                String question5 = scan5.nextLine();
                if (question5.equals("y")){
                    Scanner scan6 = new Scanner(System.in);
                    System.out.print("Does you car have fuel injection? ");
                    String question6 = scan6.nextLine();
                    if (question6.equals("y")){
                        System.out.print("Get it in for service. ");
                    }
                    else{
                        System.out.print("Check to ensure the choke is opening and closing. ");
                    }
                }
                else{
                    System.out.print("This should not be possible. ");
                }
            }
        }
    }

    }
}
