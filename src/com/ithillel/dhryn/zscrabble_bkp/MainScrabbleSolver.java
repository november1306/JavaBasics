package com.ithillel.dhryn.zscrabble_bkp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class MainScrabbleSolver {
    public static void main(String[] args) throws IOException {
        String phrase;

        //user input phrase
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a pool of letters");
        phrase = scanner.nextLine().toUpperCase();


        //create Map with  phrase characters and theirs count
        HashMap<Character, Integer> phraseCountMap = getCharacterCountMap(phrase);

        //read words from dictionary one by one
        BufferedReader reader = new BufferedReader(new FileReader("dictionary.txt"));
        String word;
        boolean canMakeWord = true;
        while ((word = reader.readLine()) != null) {
            canMakeWord = word.length() > 2;

            //create char count map for each word we read from file


            //compare phrase char count with word ch count
            canMakeWord = isWordInPhrase(word, phrase);
            if (canMakeWord)
                System.out.println(word);
        }

        scanner.close();
        reader.close();
    }

    private static boolean isWordInPhrase(String word, String phrase) {
        boolean canMakeWord = true;
        HashMap<Character, Integer> wordCountMap = getCharacterCountMap(word);
        HashMap<Character, Integer> phraseCountMap = getCharacterCountMap(phrase);
        for (Character ch : wordCountMap.keySet()) {
            int wordChCount = wordCountMap.get(ch);
            int phraseChCount = phraseCountMap.containsKey(ch) ?
                    phraseCountMap.get(ch) : 0;
            if (wordChCount > phraseChCount) {
                canMakeWord = false;
            }
        }
        return canMakeWord;
    }


    private static HashMap<Character, Integer> getCharacterCountMap(String text) {
        HashMap<Character, Integer> lettersCountMap = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (lettersCountMap.containsKey(ch)) {
                int count = lettersCountMap.get(ch);
                lettersCountMap.put(ch, count + 1);
            } else
                lettersCountMap.put(ch, 1);
        }
        return lettersCountMap;
    }
}
