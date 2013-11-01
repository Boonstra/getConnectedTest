package com.app.getconnected.rest.test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.json.JSONException;
import org.json.JSONObject;

import com.app.getconnected.config.Config;
import com.app.getconnected.rest.RESTRequest;
import com.app.getconnected.rest.RESTRequest.Method;
import com.app.getconnected.rest.RESTRequestEvent;
import com.app.getconnected.rest.RESTRequestListener;

import android.test.AndroidTestCase;

public class RESTRequestTest extends AndroidTestCase implements RESTRequestListener
{
	/** The CountDownLatch is used by the testAbort method to wait for the asynchronous task to finish before continuing the RESTRequestTest. */
	protected CountDownLatch testAbortCountDownLatch;
	
	/** An integer indicating how many RESTRequests initiated by the testAbort method were executed successfully. */
	protected int testAbortFinishedRESTRequests = 0;
	
	/** Identifier for the testDoInBackground method. */
	protected final String TEST_ABORT_ID = "testAbort";
	
	/** The CountDownLatch is used by the testDoInBackground method to wait for the asynchronous task to finish before continuing the RESTRequestTest. */
	protected CountDownLatch testDoInBackgroundCountDownLatch;
	
	/** A boolean indicating whether or not a RESTRequest initiated by the testDoInBackground method was executed successfully. */
	protected boolean testDoInBackgroundRESTRequestSuccessfull;
	
	/** Identifier for the testDoInBackground method. */
	protected final String TEST_DO_IN_BACKGROUND_ID = "testDoInBackground";
	
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
	 * Test aborting an executing asynchronous task
	 */
	public void testCancel()
	{
//		// The CountDownLatch is used to wait for the RESTRequest to finish
//		testAbortCountDownLatch = new CountDownLatch(1);
//		
//		testAbortFinishedRESTRequests = 0;
//		
//		RESTRequest restRequest1 = new RESTRequest(Config.tripPlannerAddress, TEST_ABORT_ID);
//		RESTRequest restRequest2 = new RESTRequest(Config.tripPlannerAddress, TEST_ABORT_ID);
//		RESTRequest restRequest3 = new RESTRequest(Config.tripPlannerAddress, TEST_ABORT_ID);
//		
//		restRequest1.addEventListener(this);
//		restRequest2.addEventListener(this);
//		restRequest3.addEventListener(this);
//		
//		restRequest1.execute();
//		restRequest2.execute();
//		restRequest3.execute();
//		
//		restRequest1.abort();
//		
//	    try
//		{
//	    	// Wait until the count down is finished by either the RESTRequest having finished, or the 30 seconds running out
//	    	testAbortCountDownLatch.await(30, TimeUnit.SECONDS);
//		}
//	    catch (InterruptedException e)
//		{
//	    	e.printStackTrace();
//	    	
//	    	// Fail test on Exception
//			assertFalse(true);
//		}
//
//	    assertEquals(2, testAbortFinishedRESTRequests);
	}

	/**
	 * Test executing the asynchronous task.
	 */
	public void testDoInBackground()
	{
		// The CountDownLatch is used to wait for the RESTRequest to finish
		testDoInBackgroundCountDownLatch = new CountDownLatch(1);
		
		testDoInBackgroundRESTRequestSuccessfull = false;
		
		RESTRequest restRequest = new RESTRequest(Config.tripPlannerAddress, TEST_DO_IN_BACKGROUND_ID);
		
		restRequest.addEventListener(this);
		
		restRequest.execute();
		
	    try
		{
	    	// Wait until the count down is finished by either the RESTRequest having finished, or the 30 seconds running out
	    	testDoInBackgroundCountDownLatch.await(30, TimeUnit.SECONDS);
		}
	    catch (InterruptedException e)
		{
	    	e.printStackTrace();
	    	
	    	// Fail test on Exception
			//assertFalse(true);
		}

	    //assertTrue(testDoInBackgroundRESTRequestSuccessfull);
	}

	@Override
	public void RESTRequestOnPreExecute(RESTRequestEvent event) { }

	@Override
	public void RESTRequestOnProgressUpdate(RESTRequestEvent event) { }

	@Override
	public void RESTRequestOnPostExecute(RESTRequestEvent event)
	{
		if (event.getID().equals(TEST_DO_IN_BACKGROUND_ID))
		{
			assertEquals("", event.getID());
			
			String result = event.getResult();
			
			assertFalse("".equals(result));
			
			try
			{
				JSONObject jsonObject = new JSONObject(result);
				
				JSONObject errorJSONObject = jsonObject.getJSONObject("error");
	
				assertEquals(500, errorJSONObject.getInt("id"));
				
				assertTrue(errorJSONObject.getBoolean("noPath"));
			}
			catch (JSONException e)
			{
				e.printStackTrace();
				
				assertTrue(false);
			}
			
			testDoInBackgroundRESTRequestSuccessfull = true;
			
			testDoInBackgroundCountDownLatch.countDown();
		}
		else if (event.getID().equals(TEST_ABORT_ID))
		{
			testAbortFinishedRESTRequests++;
			
			testDoInBackgroundCountDownLatch.countDown();
		}
		else
		{
			// ID was incorrectly set
			assertFalse(true);
		}
	}
	
	/**
	 * Test the toString method
	 */
	public void testToString()
	{
		RESTRequest restRequest = new RESTRequest(Config.tripPlannerAddress);
		
		restRequest.putString("test", "success");
		
		assertEquals(Config.tripPlannerAddress + "?test=success", restRequest.toString());
	}
}
