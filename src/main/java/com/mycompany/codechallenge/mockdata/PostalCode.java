/**
 * Getter for PostalCode field to be used in Address Model
 * Add/Delete this data to keep PostalCode field values
 */
package com.mycompany.codechallenge.mockdata;

public class PostalCode {
    private static final String[] postalCode = {"07008","07803","06338","09808","3073","K1A 0B1","S0A0A0"};

    public static String[] getPostalCode() {
        return postalCode;
    }
}
