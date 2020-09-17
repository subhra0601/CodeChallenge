/**
 * Getter for Country field to be used in Address Model
 * Add/Delete this data to keep Country field values
 */

package com.mycompany.codechallenge.mockdata;

public class Country {
    private static final String country[]={"","United States","Canada","Mexico","Netherlands"};

    public static String[] getCountry() {
        return country;
    }
}
