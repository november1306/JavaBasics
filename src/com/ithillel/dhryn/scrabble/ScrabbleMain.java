package com.ithillel.dhryn.scrabble;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * input: taaac
 * <p>
 * output:
 * ACT, ACTA, CAT
 */

public class ScrabbleMain {
    public static void main(String[] args) throws IOException {

        //read phrase from console
        String phrase = "taaac";
        System.out.println("input phrase of characters");
        Scanner scanner = new Scanner(System.in);
        phrase = scanner.nextLine();
        phrase = phrase.toUpperCase();

        //Map of charecter count
        //  t -> 1
        //  a -> 3
        //  c -> 1
        HashMap<Character, Integer> phraseCharCount = getCharacterCountMap(phrase);

        //read from dictionary line by line
        FileReader fileReader = new FileReader("attachments/dictionary.txt");
        BufferedReader reader = new BufferedReader(fileReader);

        String word;
        boolean canMakeWord;
        while ((word = reader.readLine()) != null) {
            // check if we can make word
            canMakeWord = true;
            HashMap<Character, Integer> wordCharCount = getCharacterCountMap(word);
            for (char ch : wordCharCount.keySet()) {
                int wordChCount = wordCharCount.get(ch);
                int phraseChCount = phraseCharCount.containsKey(ch) ?
                        phraseCharCount.get(ch) : 0;
                if (wordChCount > phraseChCount)
                    canMakeWord = false;
            }
            if (canMakeWord && word.length() > 2)
                System.out.println("YES we can " + word);
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
        return phraseCharCount;
    }

}
