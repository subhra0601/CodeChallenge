/**
 * POJO for Address that contains all mockdata to be returned to AddressService
 */
package com.mycompany.codechallenge.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {

    @JsonProperty("house")
    private String house;

    @JsonProperty("street")
    private String street;

    @JsonProperty("postalCode")
    private String postalCode;

    @JsonProperty("City")
    private String city;

    @JsonProperty("county")
    private String county;

    @JsonProperty("state")
    private String state;

    @JsonProperty("stateCode")
    private String stateCode;

    @JsonProperty("country")
    private String country;

    @JsonProperty("countryCode")
    private String countryCode;

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city  = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "Address [house=" + house + ", street=" + street + ", postalCode=" + postalCode + ", city=" + city
                + ", county=" + county + ", state=" + state + ", stateCode=" + stateCode + ", country=" + country
                + ", countryCode=" + countryCode + "]";
    }


}