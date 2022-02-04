package com.ithillel.dhryn.scrabble;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

/**
 * input: aajkccce
 * <p>
 * output:
 * ACE, CACA, CAECA, CAKE, CECA, JACK, JAKE, KAE, KEA
 */

public class ScrabbleMain {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        //read phrase from console
        String phrase = "aajkccce";
        System.out.println("input phrase of characters");
        Scanner scanner = new Scanner(System.in);
        phrase = scanner.nextLine();

        //Map of charecter count
        //  a -> 2
        //  j -> 1
        //  k -> 1
        //  c -> 3
        //  e->1
        HashMap<Character, Integer> phraseCharCount = getCharacterCountMap(phrase);

        //read from dictionary line by line
        BufferedReader reader = new BufferedReader(new FileReader("attachments/dictionary.txt"));
        String word;
        boolean canMakeWord = true;
        while ((word = reader.readLine()) != null) {
            // check if we can make word
            System.out.println(word);
        }
    }

    private static HashMap<Character, Integer> getCharacterCountMap(String phrase) {
        HashMap<Character, Integer> phraseCharCount = new HashMap<>();
        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.charAt(i);
            if (phraseCharCount.containsKey(ch)) {
                int oldCount = phraseCharCount.get(ch);
                int newCount = oldCount + 1;
                phraseCharCount.put(ch, newCount);
            } else
                phraseCharCount.put(ch, 1);
        }
        System.out.println(phraseCharCount);
        return phraseCharCount;
    }

}
