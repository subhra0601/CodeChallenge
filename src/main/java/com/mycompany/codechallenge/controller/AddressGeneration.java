/**
 * Controller for random address generation from mock test data
 * This is exposed as a rest HTTP service
 */

package com.mycompany.codechallenge.controller;

import com.mycompany.codechallenge.service.AddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AddressGeneration {

    private static final Logger logger = LoggerFactory.getLogger(AddressService.class);

    @Autowired
    AddressService addressService;

    /**
     * Method used for return random address from mock test data
     */
    @RequestMapping(value = "/randomizer/address",produces = {"application/json"},method = RequestMethod.GET)
    public ResponseEntity<Object> getAddress() {

        logger.info("..getting the mock address data");
        try {
            return new ResponseEntity<>(addressService.getAddress(), HttpStatus.OK);
        }
        catch (Exception e) {
            logger.info(e.getMessage());
            Error error = new Error("500");
            return new ResponseEntity<>(error,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
