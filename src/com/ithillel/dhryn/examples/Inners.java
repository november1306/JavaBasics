package com.ithillel.dhryn.examples;

public class Inners {

    static class AlmostAnimal {
        public void printSounds() {
            System.out.println("sounds ");
        }
        public static void eats() {
            System.out.println("eats");
        }
    }

    public static void main(String[] args) {
        AlmostAnimal animal = new AlmostAnimal();
        animal.printSounds();

        AlmostAnimal.eats();
    }
}
