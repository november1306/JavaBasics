package com.ithillel.dhryn.scrabble;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * input: taaac
 * <p>
 * output:
 * ACT, ACTA, CAT
 */

public class ScrabbleMain {
    public static void main(String[] args) {

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

        //read from dictionary to ArrayList
        List<String> wordsList = new LinkedList<>();
        String fileName = "attachments\\dictionary.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            try {
                wordsList = readWords(reader);
            } finally {
                reader.close();
            }
        } catch (IOException ex) {
            System.err.println(" problem reading file from " + System.getProperty("user.dir") + "\\" + fileName);
            ex.printStackTrace();
        }

        searchWordsExistInPhrase(phrase, wordsList);
    }

    private static List<String> readWords(BufferedReader reader) throws IOException {
        List<String> wordsList = new LinkedList<>();
        String word;
        while ((word = reader.readLine()) != null) {
            wordsList.add(word);
        }
        return wordsList;
    }

    public static void searchWordsExistInPhrase(String phrase, List<String> wordsList) {
        HashMap<Character, Integer> phraseCharCount = getCharacterCountMap(phrase);
        for (String word : wordsList) {
            HashMap<Character, Integer> wordCharCount = getCharacterCountMap(word);
            boolean canMakeWord = true;
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
