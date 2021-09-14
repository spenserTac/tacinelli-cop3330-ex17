/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Spenser Tacinelli
 */

import java.util.Scanner;

public class Exercise_17{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        String temp_m_or_f = scanner.nextLine();
        int m_or_f = Integer.parseInt(temp_m_or_f);

        System.out.print("How many ounces of alcohol did you have? ");
        String temp_ounces = scanner.nextLine();
        int ounces = Integer.parseInt(temp_ounces);

        System.out.print("What is your weight, in pounds? ");
        String temp_weight = scanner.nextLine();
        int weight = Integer.parseInt(temp_weight);

        System.out.print("How many hours has it been since your last drink? ");
        String temp_hours = scanner.nextLine();
        int hours = Integer.parseInt(temp_hours);

        double bac_result = (m_or_f == 1) ? ((ounces * 5.14) / (weight * 0.66)) - 0.015 * hours : ((ounces * 5.14) / (weight * 0.73)) - 0.015 * hours; // male : female

        System.out.println("Your BAC is " + String.format("%.6f", bac_result));
        String output = (bac_result > 0.08) ? "It is not legal for you to drive." : "It is legal for you to drive.";
        System.out.println(output);
    }
}