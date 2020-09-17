/**
 * Common Utility/Helper class
 * that groups useful methods
 * */
package com.mycompany.codechallenge.util;

import java.util.Random;

public class Utility {

    /**
     * Method to generate random number from A0 to i
     * */
    public static int generateRandomNumber(int i) {
        Random rand = new Random();

        // Generate random integers in range 0 to i
        return rand.nextInt(i);
    }
}
