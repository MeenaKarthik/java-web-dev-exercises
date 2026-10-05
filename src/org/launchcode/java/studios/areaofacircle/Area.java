package org.launchcode.java.studios.areaofacircle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double radius, area;
        while(true) {
            System.out.println("Enter a radius: ");
            try {
                radius = input.nextDouble();
                if (radius > 0) {
                    area = Circle.getArea(radius);
                    System.out.println("The area of a circle of radius " + radius + " is: " + area);
                    break;
                } else {
                    System.out.println("Radius must be greater than 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                input.next();
            }
        }
    }
}
