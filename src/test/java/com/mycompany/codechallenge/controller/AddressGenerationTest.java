/**
 * Test AddressGeneration class used for random address generation from mock test data
 */
package com.mycompany.codechallenge.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.mycompany.codechallenge.model.Address;
import com.mycompany.codechallenge.service.AddressService;

@RunWith(MockitoJUnitRunner.class)
public class AddressGenerationTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    AddressService addressService;

    @InjectMocks
    private AddressGeneration addressGeneration;

    /**
     * Test method to verify Address Generation controller setup
     */
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(addressGeneration).build();
    }

    /**
     * Test method to verify Address Generation success 200
     */
    @Test
    public final void getAddress200() throws Exception {

        when(addressService.getAddress()).thenReturn(new Address());

        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/randomizer/address");
        mockMvc.perform(requestBuilder).andDo(print())
                .andExpect(status().is2xxSuccessful());
    }

    /**
     * Test method to verify Address Generation failure 500
     */
    @Test
    public final void getAddress500() throws Exception {

        when(addressService.getAddress()).thenThrow(new NullPointerException());

        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/randomizer/address");
        mockMvc.perform(requestBuilder).andDo(print())
                .andExpect(status().is5xxServerError());
    }

}
