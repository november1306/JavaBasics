package com.ithillel.dhryn.exceptions;

import java.io.FileReader;
import java.io.IOException;
import java.io.InvalidClassException;

public class CatchingExp {

    public static void wrongArrayIndex() {
        int[] arrayOfNumbers = {0, 1, 2};
        System.out.println(arrayOfNumbers[5]);
    }

    public static int readFromFile() throws IOException {
        int readedText = 0;
        FileReader reader = null;
        try {
            reader = new FileReader("src/XMLMessage.txt");
            readedText = reader.read();
        } catch (NullPointerException | InvalidClassException ex) {
            ex.printStackTrace();
            System.out.println("exception handled");
        } catch (IOException ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            System.out.println("finally block");
        }
        System.out.println("text after try block");
        return readedText;
    }

    public static void raiseException() throws ClassNotFoundException {
        throw new ClassNotFoundException("trying to use some Class, but it does not exist");
    }
}
