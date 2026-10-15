package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] numbers = {1, 1, 2, 3, 5, 8};
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = sentence.split(" ");
        String[] sentences = sentence.split("\\.");

        // for-each
        for(int number : numbers){
            if(number%2 == 1)
                System.out.println(number);
        }

        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(sentences));


    }
}
