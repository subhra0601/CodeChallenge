/**
 * Test AddressService class for to return random address to AddressGeneration Controller
 * */
package com.mycompany.codechallenge.service;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.Test;
import com.mycompany.codechallenge.model.Address;

public class AddressServiceTest {

	/**
	 * Test method to verify the address is returned
	 * */
	@Test
	public void testGetAddress() {
			
		AddressService svc = new AddressService();
		
		Address addr = svc.getAddress();
		assertTrue(addr instanceof Address);
		
	}

	/**
	 * Test method to verify all mandatory fields  are returned
	 * */
	@Test
	public void testGetAddressMandatoryFields() {

		AddressService svc = new AddressService();

		Address addr = svc.getAddress();

		assertTrue(addr.getHouse().isEmpty());
		assertTrue(!addr.getStreet().isEmpty());
		assertTrue(!addr.getPostalCode().isEmpty());
		assertTrue(!addr.getCity().isEmpty());
		assertTrue(!addr.getCounty().isEmpty());
		assertTrue(!addr.getCountryCode().isEmpty());
	}
}
