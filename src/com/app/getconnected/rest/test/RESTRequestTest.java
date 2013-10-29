package com.app.getconnected.rest.test;

import com.app.getconnected.rest.RESTRequestListener;
import com.app.getconnected.rest.RESTRequest.Method;

import android.test.AndroidTestCase;

public class RESTRequestTest extends AndroidTestCase
{
	/**
	 * 
	 */
	public RESTRequestTest()
	{
		System.out.println("Hoi");
	}
	
	@Override
	public void setUp()
	{
		System.out.println("Hai");
	}
	
	public void testPreconditions()
	{
		System.out.println("Hei");
	}
	
	@Override
	public void tearDown()
	{
		System.out.println("BBQ");
	}
	
	/**
	 * Test getting the address
	 */
	public void testGetAddress()
	{
		//return address;
	}

	/**
	 * Test setting the address
	 */
	public void testSetAddress()
	{
		//this.address = address;
	}
	
	/**
	 * @return method
	 */
	public void testGetMethod()
	{
		//return method;
	}
	
	/**
	 * @param method
	 */
	public void testSetMethod()
	{
		//this.method = method;
	}
	
	/**
	 * @return headerAcceptedData
	 */
	public void testGetHeaderAcceptedData()
	{
		//return headerAcceptedData;
	}
	
	/**
	 * @param headerAcceptedData
	 */
	public void testSetHeaderAcceptedData()
	{
		//this.headerAcceptedData = headerAcceptedData;
	}
	
	/**
	 * @return ID
	 */
	public void testGetID()
	{
		//return ID;
	}

	/**
	 * @param address
	 */
	public void testSetID()
	{
		//this.ID = ID;
	}
	
	/**
	 * @param key
	 * @param value
	 */
	public void testPutString()
	{
		//parameters.add(new BasicNameValuePair(key, value));
	}
	
	/**
	 * @param key
	 * @param value
	 */
	public void testPutInt()
	{
		//parameters.add(new BasicNameValuePair(key, Integer.toString(value)));
	}
	
	/**
	 * @param key
	 * @param value
	 */
	public void testPutDouble()
	{
		//parameters.add(new BasicNameValuePair(key, Double.toString(value)));
	}

	/**
	 * @param key
	 * @param value
	 */
	public void testPutFloat()
	{
		//parameters.add(new BasicNameValuePair(key, Float.toString(value)));
	}
	
	/**
	 * @param key
	 * @param value
	 */
	public void testPutBoolean()
	{
		//parameters.add(new BasicNameValuePair(key, Boolean.toString(value)));
	}
	
	/**
	 * @param eventListener
	 */
	public void testAddEventListener()
	{
		//this.eventListeners.add(eventListener);
	}
	
	protected void testDoInBackground()
	{
//		DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
//
//		HttpUriRequest httpRequest = null; 
//		
//		// Get the correct request method
//		try
//		{
//			switch (method)
//			{
//				case GET:
//					// Set URL and encode parameters
//					httpRequest = new HttpGet(address + "?" + URLEncodedUtils.format(parameters, "utf-8"));
//					break;
//	
//				case POST:
//					httpRequest = new HttpPost(address);
//					
//					// Encode parameters as entity
//					((HttpPost) httpRequest).setEntity(new UrlEncodedFormEntity(parameters));
//					break;
//					
//				case PUT:
//					httpRequest = new HttpPut(address);
//					
//					// Encode parameters as entity
//					((HttpPut) httpRequest).setEntity(new UrlEncodedFormEntity(parameters));
//					break;
//					
//				default:
//					return "-1";
//			}
//		}
//		catch (IllegalArgumentException e)
//		{
//			e.printStackTrace();
//			return "-2";
//		}
//		catch (UnsupportedEncodingException e)
//		{
//			return "-3";
//		}
//		
//		// Indicate what data needs to be received
//		httpRequest.setHeader("Accept", headerAcceptedData);
//
//		InputStream inputStream = null;
//		
//		Scanner scanner = null;
//		
//		try
//		{
//			// Run request
//			HttpResponse httpResponse = defaultHttpClient.execute(httpRequest);
//			
//			// Get content of response
//			inputStream = httpResponse.getEntity().getContent();
//			
//			// Trick to read all data from a stream in one line: https://weblogs.java.net/blog/pat/archive/2004/10/stupid_scanner_1.html
//			scanner = new Scanner(inputStream).useDelimiter("\\A");
//
//			String result = "";
//			
//			// Read lines into result
//			while (scanner.hasNext())
//			{
//				result += scanner.next();
//			}
//			
//			if (result.length() > 0)
//			{
//				return result;
//			}
//		}
//		catch (IOException e)
//		{
//			return "-4";
//		}
//		finally // Close opened utilities
//		{
//			if (scanner != null)
//			{
//				scanner.close();
//			}
//			
//			if (inputStream != null)
//			{
//				try
//				{
//					inputStream.close();
//				}
//				catch (IOException e) { }
//			}
//		}
//		
//		return "-5";
	}
	
	protected void testOnPreExecute()
	{
//		super.onPreExecute();
//		
//		for (RESTRequestListener eventListener : eventListeners)
//		{
//			// Create new RESTRequestEvent to be handled by the event listener
//			eventListener.RESTRequestOnPreExecute(new RESTRequestEvent(this, ID));
//		}
	}
	
	protected void testOnProgressUpdate()
	{
//		super.onProgressUpdate(voids);
//		
//		for (RESTRequestListener eventListener : eventListeners)
//		{
//			// Create new RESTRequestEvent to be handled by the event listener
//			eventListener.RESTRequestOnProgressUpdate(new RESTRequestEvent(this, ID));
//		}
	}
	
	protected void testOnPostExecute()
	{
//		for (RESTRequestListener eventListener : eventListeners)
//		{
//			// Create new RESTRequestEvent to be handled by the event listener
//			eventListener.RESTRequestOnPostExecute(new RESTRequestEvent(this, result, ID));
//		}
	}
	
	public void testToString()
	{
		//return address + "?" + URLEncodedUtils.format(parameters, "utf-8");
	}
}
