package exercises;

import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {

        float length, width, area;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        length = input.nextFloat();
        System.out.println("Enter the width of the rectangle");
        width = input.nextFloat();
        area= length*width;
        System.out.println("Area of the rectangle: "+area);

    }
}

