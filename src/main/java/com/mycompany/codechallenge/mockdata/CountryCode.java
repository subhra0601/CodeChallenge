/**
 * Getter for Country field to be used in Address Model
 * Add/Delete this data to keep CountryCode field values
 */
package com.mycompany.codechallenge.mockdata;

import java.util.HashMap;

public class CountryCode {

    private static final HashMap<String,String> countryMapping = new HashMap<>();

    public static HashMap<String, String> getCountryMapping() {
        return countryMapping;
    }

    static {
        countryMapping.put("","USA");
        countryMapping.put("United States","USA");
        countryMapping.put("Canada","CAN");
        countryMapping.put("Mexico","MEX");
        countryMapping.put("Netherlands","NLD");
    }
}
