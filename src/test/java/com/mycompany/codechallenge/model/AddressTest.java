/**
 * Test Address class for Address that contains all mockdata to be returned to AddressService
 */
package com.mycompany.codechallenge.model;


import static org.hamcrest.CoreMatchers.allOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

import static com.google.code.beanmatchers.BeanMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class AddressTest {

    /**
     * Test method to verify Address Bean
     */
    @Test
    public void testBean() {

        assertNotNull(new Address());
        assertThat(Address.class, allOf(hasValidGettersAndSetters(), hasValidBeanToString()));
    }
}
