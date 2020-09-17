/**
 * Getter for StateCode field to be used in Address Model
 * Add/Delete this data to keep StateCode field values
 */
package com.mycompany.codechallenge.mockdata;

public class StateCode {
    private static final String[] stateCode = {"","NJ","NY","CA","TX","NS","NH","DF"};

    public static String[] getStateCode() {
        return stateCode;
    }
}
