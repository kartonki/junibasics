package com.kartonki.junitbasics;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Sending console output
        
    }

    /**
     *
     */
    //public class Multiplex {

        public int multiply(int x, int y) {
            // the following is just an example
            if (x > 999) {
                throw new IllegalArgumentException("X should be less than 1000");
            }
            return x * y;
        }
    //}
}
