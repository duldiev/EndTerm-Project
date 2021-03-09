package com.company;

import java.util.Random;

public class RandomNumber {  // class to generate random number
    public static int generate(int x, int y) {  // static method to generate random number in range x and y
        Random rand = new Random();  // Random object
        int n = rand.nextInt(y);  // getting the random number
        while (n < x) {  // if generated number is less than x, then it generates again to get the number between x and y
            n = rand.nextInt(y);  // getting the random number
        }
        return n;  // returning the random number
    }
}
