package org.launchcode.java.studios.countingcharacters;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadStringFromFile {

    public static void main(String[] args) {

        File file = new File("input.txt");
        System.out.println("Looking for: "+file.getAbsolutePath());
        String text = "";

        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                text = text + line + "\n";

            }
            scanner.close();

            System.out.println("File contents: ");
            System.out.println(text);

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
