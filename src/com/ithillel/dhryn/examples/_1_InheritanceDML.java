package com.ithillel.dhryn.examples;

import java.util.List;

public class _1_InheritanceDML {
    public _1_InheritanceDML() {
        Animal dog = new Dog();
        dog.printSounds();
        new Dog().printSounds();
        new Cat().printSounds();
    }

   public abstract class Animal {
        public abstract void printSounds();

        public void printEats() {
            System.out.println("Animal eats food");
        }
    }

    class Dog extends Animal  {
        @Override
        public void printSounds() {
            System.out.println("Dog says GAVGAV");
        }

        public void doHunt() {
            System.out.println("Dogs also do hunt");
        }
    }

    class Cat extends Animal {
        @Override
        public void printSounds() {
//            super.printSounds();
        }
        public void printEats() {
            super.printEats();
        }
    }
}
