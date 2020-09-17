/**
 * Service for to return random address to AddressGeneration Controller
 * */
package com.mycompany.codechallenge.service;

import com.mycompany.codechallenge.mockdata.*;
import com.mycompany.codechallenge.model.Address;
import com.mycompany.codechallenge.util.Utility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class AddressService {

    private static final Logger logger = LoggerFactory.getLogger(AddressService.class);

    /**
     * Method to generate random address from Address object
     * */
    public Address getAddress() {

        Address address = new Address();

        address.setHouse(House.getHouse()[Utility.generateRandomNumber(House.getHouse().length)]);
        address.setStreet(Street.getStreet()[Utility.generateRandomNumber(Street.getStreet().length)]);
        address.setPostalCode(PostalCode.getPostalCode()[Utility.generateRandomNumber(PostalCode.getPostalCode().length)]);
        address.setCity(City.getCity()[Utility.generateRandomNumber(City.getCity().length)]);
        address.setCounty(County.getCounty()[Utility.generateRandomNumber(County.getCounty().length)]);
        address.setState(State.getState()[Utility.generateRandomNumber(State.getState().length)]);
        address.setStateCode(StateCode.getStateCode()[Utility.generateRandomNumber(StateCode.getStateCode().length)]);
        String country = Country.getCountry()[Utility.generateRandomNumber(Country.getCountry().length)];

        address.setCountry(country);
        address.setCountryCode(CountryCode.getCountryMapping().get(country));

        return address;
    }
}
