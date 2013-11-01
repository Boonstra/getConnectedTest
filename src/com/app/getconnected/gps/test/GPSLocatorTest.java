package com.app.getconnected.gps.test;

import android.test.AndroidTestCase;

import com.app.getconnected.gps.GPSLocator;

public class GPSLocatorTest extends AndroidTestCase {
	
	public GPSLocator locator;

	@Override
	public void setUp() {
		locator = new GPSLocator(getContext());
	}

	public void testPreconditions() {

	}

	@Override
	public void tearDown() {

	}
	
	public void testGPSEnabled() {
		
		assertTrue(locator.getLatitude() > 0);
		assertTrue(locator.getLongitude() > 0);
		
	}
	
	public void testGPSCoordinates() {
		
		//Test Zernikeplein, Groningen: 53.24083, 6.53280;
		assertTrue(locator.getLatitude() > 50);
		assertTrue(locator.getLatitude() < 60);
		assertTrue(locator.getLongitude() > 5);
		assertTrue(locator.getLongitude() < 8);
		
	}

	
	
}
