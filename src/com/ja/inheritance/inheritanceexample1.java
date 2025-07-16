package com.ja.inheritance;

    class Animal {
        void eat() {

            System.out.println("Animal eats");
        }
    }
    class Dog extends Animal {
        void bark() {
            System.out.println("Dog barks");
        }
    }
    class Puppy extends Dog {
        void weep() {


            System.out.println("Puppy weeps");
        }
    }
    public class inheritanceexample1 {
        public static void main(String[] args) {
            Puppy mypuppy = new Puppy();
            mypuppy.eat();
            mypuppy.bark();
            mypuppy.weep();
        }
}


