package org.launchcode;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of Rectangle:");
        Double length = input.nextDouble();
        System.out.println("What is the Width  of Rectangle:");
        Double width=input.nextDouble();
        System.out.println("Area of a Rectangle is :"+ length*width);
    }
}
