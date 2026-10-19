package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {

        //The keys should be the IDs and the values should be the names.
        HashMap<Integer,String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter IDs (or Enter to finish): ");

        //Get student IDs and names
        do{
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if(!newStudent.isEmpty()){
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                students.put(newID, newStudent);
                // Read in the newline before looping back
                input.nextLine();
            }
        } while(!newStudent.isEmpty());

        //print class roster
        System.out.println("\nClass roster: ");

        for(Map.Entry<Integer,String> student : students.entrySet()){
            System.out.println(student.getValue()+ "'s ID: "+student.getKey());
        }
        System.out.println("No. of students: "+ students.size());
    }
}
