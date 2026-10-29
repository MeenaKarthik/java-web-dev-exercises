package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student meena = new Student("Meena",1,1,4.0);
        Student madhav = new Student("Madhav",2);

        System.out.println("Madhav's score: ");
        System.out.println("# of credits: "+madhav.getNumberOfCredits());
        System.out.println("gpa: "+madhav.getGpa());

        System.out.println("\nMeena's score: ");
        System.out.println("# of credits: "+meena.getNumberOfCredits());
        System.out.println("gpa: "+meena.getGpa());


    }
}
