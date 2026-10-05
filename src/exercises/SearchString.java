package exercises;

import java.util.Scanner;
public class SearchString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by her sister " +
                "on the bank, and of having nothing to do: once or twice she had peeped " +
                "into the book her sister was reading, but it had no pictures or conversations " +
                "in it, 'and what is the use of a book,' thought Alice 'without pictures or " +
                "conversation?'";
        String toSearch;
        boolean found;

        System.out.println(sentence);
        System.out.println("Enter a term to search for within this sentence");
        toSearch = input.nextLine();

        found = sentence.toLowerCase().contains(toSearch.toLowerCase());
        System.out.println("Search term found: "+found);

        if(found){
            int startIndex = sentence.indexOf(toSearch);
            System.out.println("startIndex: "+startIndex);
            System.out.println("length: "+toSearch.length());
            sentence = sentence.replaceFirst(toSearch, "");
            System.out.println(sentence);
        }
        
    }
}
