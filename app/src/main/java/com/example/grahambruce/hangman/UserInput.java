package com.example.grahambruce.hangman;

import java.util.Scanner;

/**
 * Created by grahambruce on 28/06/2017.
 */

public class UserInput {



    public static String getUserWord(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().toLowerCase();
    }

    public static char getUserChar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please pick a letter:");
        String input = sc.nextLine().toLowerCase();
        while(!input.matches("[a-z]+")){
            System.out.println("Please enter a valid character");
            input = sc.nextLine().toUpperCase();
        }
        char choice = input.charAt(0);
        return choice;
    }

    public static boolean getUserBoolean(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Keep going? yes or no");
        if (sc.nextLine().equals("yes")) {
            System.out.println("yes");
            return true;

        } else {
            System.out.println("no");

            return false;
        }
    }

}
