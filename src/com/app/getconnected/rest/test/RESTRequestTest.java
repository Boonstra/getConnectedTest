package com.app.getconnected.rest.test;

import com.app.getconnected.network.Config;
import com.app.getconnected.rest.RESTRequest;
import com.app.getconnected.rest.RESTRequest.Method;
import com.app.getconnected.rest.RESTRequestEvent;
import com.app.getconnected.rest.RESTRequestListener;

import android.test.AndroidTestCase;

public class RESTRequestTest extends AndroidTestCase implements RESTRequestListener
{
	@Override
	public void setUp()
	{
		
	}
	
	public void testPreconditions()
	{
		
	}
	
	@Override
	public void tearDown()
	{
		
	}
	
	/**
	 * Test getting the address.
	 */
	public void testGetAddress()
	{
		RESTRequest restRequest = new RESTRequest("address");
		
		assertEquals("address", restRequest.getAddress());
	}

	/**
	 * Test setting the address.
	 */
	public void testSetAddress()
	{
		RESTRequest restRequest = new RESTRequest("");
		
		restRequest.setAddress("address");
		
		assertEquals("address", restRequest.getAddress());
		
		restRequest.setAddress("");
		
		assertEquals("", restRequest.getAddress());
	}
	
	/**
	 * Test getting the method.
	 */
	public void testGetMethod()
	{
		RESTRequest restRequest = new RESTRequest("");
		
		assertEquals(RESTRequest.Method.GET, restRequest.getMethod());
	}
	
	/**
	 * Test setting the mehtod.
	 */
	public void testSetMethod()
	{
		RESTRequest restRequest = new RESTRequest("");
		
		restRequest.setMethod(Method.PUT);
		
		assertEquals(RESTRequest.Method.PUT, restRequest.getMethod());
		
		restRequest.setMethod(Method.POST);
		
		assertEquals(RESTRequest.Method.POST, restRequest.getMethod());
		
		restRequest.setMethod(Method.GET);
		
		assertEquals(RESTRequest.Method.GET, restRequest.getMethod());
	}
	
	/**
	 * Test getting the accepted data type.
	 */
	public void testGetHeaderAcceptedData()
	{
		RESTRequest restRequest = new RESTRequest("");
		
		assertEquals(RESTRequest.HeaderAcceptedData.JSON.getHeaderAcceptedData(), restRequest.getHeaderAcceptedData());
	}
	
	/**
	 * Test setting the accepted data type.
	 */
	public void testSetHeaderAcceptedData()
	{
		RESTRequest restRequest = new RESTRequest("");
		
		restRequest.setHeaderAcceptedData(RESTRequest.HeaderAcceptedData.TEXT.getHeaderAcceptedData());
		
		assertEquals(RESTRequest.HeaderAcceptedData.TEXT.getHeaderAcceptedData(), restRequest.getHeaderAcceptedData());
		
		restRequest.setHeaderAcceptedData(RESTRequest.HeaderAcceptedData.XML.getHeaderAcceptedData());
		
		assertEquals(RESTRequest.HeaderAcceptedData.XML.getHeaderAcceptedData(), restRequest.getHeaderAcceptedData());
		
		restRequest.setHeaderAcceptedData(RESTRequest.HeaderAcceptedData.HTML.getHeaderAcceptedData());
		
		assertEquals(RESTRequest.HeaderAcceptedData.HTML.getHeaderAcceptedData(), restRequest.getHeaderAcceptedData());
		
		restRequest.setHeaderAcceptedData(RESTRequest.HeaderAcceptedData.JSON.getHeaderAcceptedData());
		
		assertEquals(RESTRequest.HeaderAcceptedData.JSON.getHeaderAcceptedData(), restRequest.getHeaderAcceptedData());
	}
	
	/**
	 * Test getting the ID.
	 */
	public void testGetID()
	{
		RESTRequest restRequest = new RESTRequest("");
		
		assertEquals("", restRequest.getID());
	}

	/**
	 * Test setting the ID.
	 */
	public void testSetID()
	{
		RESTRequest restRequest = new RESTRequest("");
		
		restRequest.setID("test");
		
		assertEquals("test", restRequest.getID());
		
		restRequest.setID("");
		
		assertEquals("", restRequest.getID());
	}

	/**
	 * Test executing the asynchronous task.
	 */
	protected void testDoInBackground()
	{
		
	}

	@Override
	public void RESTRequestOnPreExecute(RESTRequestEvent event)
	{
		
	}

	@Override
	public void RESTRequestOnProgressUpdate(RESTRequestEvent event)
	{
		
	}

	@Override
	public void RESTRequestOnPostExecute(RESTRequestEvent event)
	{
		
	}
	
	/**
	 * 
	 */
	public void testToString()
	{
		
	}
}
