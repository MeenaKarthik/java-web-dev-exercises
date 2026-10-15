package exercises;

import java.util.ArrayList;

public class Sum {
    public static int sumOfEven(ArrayList<Integer> numbers){
      int sum = 0;
      for(Integer number: numbers){
          if(number%2 == 0)
             sum += number;
      }
      return sum;
    }

    public static ArrayList<String> wordOfFiveLetters(ArrayList<String> words){
        ArrayList<String> fivesList = new ArrayList<>();
        for(String word : words){
            if(word.length() == 5){
                fivesList.add(word);
            }
        }
        return fivesList;
    }

    public static ArrayList<String> listOfWordLength(int wordLength, ArrayList<String> words){
         ArrayList<String> newList = new ArrayList<>();
         for(String word: words){
             if(word.length() == wordLength){
                 newList.add(word);
             }
         }
         return newList;
    }
}
