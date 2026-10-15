package exercises;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        boolean flag = true;
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";


        for(int i=1; i<=10; i++){
            numbers.add(i);
        }
        words.add("raise");
        words.add("red");
        words.add("school");
        words.add("tamil");
        words.add("eight");
        String[] sentenceArray = sentence.split(" ");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(sentenceArray));


        System.out.println(numbers);
        sum = Sum.sumOfEven(numbers);
        System.out.println("sum of all even numbers: "+sum);

        System.out.println("words: "+words);
        ArrayList<String> fivesList = Sum.wordOfFiveLetters(words);
        System.out.println("word of five letters: "+ fivesList);

        while(flag){
            System.out.println("Enter the word length for the search: ");
            int wordLength = input.nextInt();
            ArrayList<String> newList = Sum.listOfWordLength(wordLength, words);
            if (!newList.isEmpty()) {
                flag = false;
                System.out.println("word of " + wordLength + " letters: " + newList);

            }
            else System.out.println("word length doesn't match!");
        }

        System.out.println("list: "+list);
        fivesList = Sum.wordOfFiveLetters(list);
        System.out.println("word of five letters: "+ fivesList);




    }

}
