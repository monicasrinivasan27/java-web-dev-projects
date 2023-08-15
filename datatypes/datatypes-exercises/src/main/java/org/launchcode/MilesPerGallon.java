package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the number of miles you have driven:");
        Double milesDriven = input.nextDouble();
        System.out.println("What is the the amount of gas you have consumed (in gallons):");
        Double gallonConsumed=input.nextDouble();
        System.out.println("The miles per gallon consumed is :"+ milesDriven/gallonConsumed);
    }
}

