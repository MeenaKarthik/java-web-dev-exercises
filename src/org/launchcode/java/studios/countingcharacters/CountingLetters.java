package org.launchcode.java.studios.countingcharacters;


import java.util.*;

public class CountingLetters {

    public static void main(String[] args) {


        /*String text = "If the product of two terms is zero then common sense says at least one " +
                "of the two terms has to be zero to start with. So if you move all the terms over to " +
                "one side, you can put the quadratics into a form that can be factored allowing that " +
                "side of the equation to equal zero. Once you’ve done that, it’s pretty " +
                "straightforward from there.";*/
        System.out.println("Enter text: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine().toLowerCase();
        char[] charactersInText = text.toCharArray();
        HashMap<Character, Integer> lettersMap = new HashMap<>();
        ArrayList<Character> newArray = new ArrayList<>();

        for(char letter : charactersInText){
            if(newArray.contains(letter)){
                int count = lettersMap.get(letter)+1;
                lettersMap.put(letter, count);
            }
            else {
                if(Character.isLetter(letter)){
                    newArray.add(letter);
                    lettersMap.put(letter, 1);
                }
            }
        }

        System.out.println(newArray);
        for(Map.Entry<Character,Integer> letterMap: lettersMap.entrySet()){
            System.out.println(letterMap.getKey()+": "+letterMap.getValue());
        }




    }

}

