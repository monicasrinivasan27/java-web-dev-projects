package studios.areaofacircle;

import java.util.Scanner;
import studios.areaofacircle.Circle;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        Double radius = input.nextDouble();
    //    Double area= 3.14*radius*radius;
        System.out.println("The area of a circle of radius "+ radius+ " is: " + Circle.getArea(radius));
    }
}