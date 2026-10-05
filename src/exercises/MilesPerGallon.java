package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {

        float miles, fuel, mpg;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no. of miles driven");
        miles = input.nextFloat();
        System.out.println("Enter the fuel amount consumed in gallons");
        fuel = input.nextFloat();
        mpg = miles/fuel;
        System.out.println("miles-per-gallon: "+mpg);
    }
}
