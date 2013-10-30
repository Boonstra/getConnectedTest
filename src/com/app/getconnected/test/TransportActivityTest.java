package com.app.getconnected.test;

import com.app.getconnected.activities.TransportActivity;
import com.app.getconnected.network.GeoLocation;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class TransportActivityTest extends
		ActivityInstrumentationTestCase2<TransportActivity> {

	private TransportActivity transportActivity;

	@SuppressWarnings("deprecation")
	public TransportActivityTest() {
		super("com.app.getconnected.activities.TransportActivity",
				TransportActivity.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();

		setActivityInitialTouchMode(false);

		transportActivity = getActivity();
	}
	
	public void testTripPlanner() {
		String address = "Groningen, The Netherlands";
		GeoLocation location = new GeoLocation(address);
		
		assertTrue(transportActivity.validateLocation(address, location));
		
		address = "De Hilde, Zuidlaren, The Netherlands";
		location = new GeoLocation(address);
		
		assertTrue(transportActivity.validateLocation(address, location));
		
		address = "sgnfjdgnnerintinertsdkfs";
		location = new GeoLocation(address);
		
		assertFalse(transportActivity.validateLocation(address, location));
	}
	
	public void testFields() {
		EditText inputFrom = (EditText) transportActivity.findViewById(com.app.getconnected.R.id.transport_input_from);
		EditText inputTo = (EditText) transportActivity.findViewById(com.app.getconnected.R.id.transport_input_to);

		assertNotNull(inputFrom);
		assertNotNull(inputTo);
		assertEquals(inputFrom.getHint(), transportActivity.getResources().getString(com.app.getconnected.R.string.transport_input_from));
		assertEquals(inputTo.getHint(), transportActivity.getResources().getString(com.app.getconnected.R.string.transport_input_to));
		
	}

}
