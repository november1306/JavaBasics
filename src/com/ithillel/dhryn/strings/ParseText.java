package com.ithillel.dhryn.strings;

import java.util.Arrays;
import java.util.List;

public class ParseText {
    public static void main(String[] args) {

        String text =
                "все любят джаву.    даже те, кто не   знал, про. ее: существование.";


        while (text.contains("  "))
            text = text.replace("  ", " ");
        text = text.trim();

        List<String> wordsList;
        wordsList = Arrays.asList(text.split(" "));
        System.out.println(wordsList);
        String currentWord;
        boolean endOfSentence = false;
        for (int i = 0; i < wordsList.size(); i++) {
            currentWord = wordsList.get(i);

            if (endOfSentence) {
                currentWord = currentWord.substring(0, 1).toUpperCase() + currentWord.substring(1);
                wordsList.set(i, currentWord);
                endOfSentence = false;
            }
            if (currentWord.endsWith("."))
                endOfSentence = true;
        }
        String fixedText = String.join(" ", wordsList);
        System.out.println(fixedText);
    }
}
