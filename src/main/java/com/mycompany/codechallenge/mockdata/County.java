/**
 * Getter for County field to be used in Address Model
 * Add/Delete this data to keep County field values
 */
package com.mycompany.codechallenge.mockdata;

public class County {
    private static final String county[]={"South Holland","Middlesex","Chihuahua","British Columbia"};

    public static String[] getCounty() {
        return county;
    }
}
