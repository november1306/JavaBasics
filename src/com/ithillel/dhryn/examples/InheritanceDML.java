package com.ithillel.dhryn.examples;

public class InheritanceDML {
    public InheritanceDML() {
        Animal dog = new Dog();
        dog.printSounds();
        new Dog().printSounds();
    }

    public abstract class Animal {
        public abstract void printSounds();

        public void printEats() {
            System.out.println("Animal eats food");
        }
    }

    class Dog extends Animal {
        @Override
        public void printSounds() {
            System.out.println("Dog says GAVGAV");
        }

        public void doHunt() {
            System.out.println("Dogs also do hunt");
        }
    }

}
