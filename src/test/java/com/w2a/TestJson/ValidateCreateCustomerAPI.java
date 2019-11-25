package com.w2a.TestJson;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import APIPackage.CreateCustomerAPI;
import SetUpPackage.TestSetup;
import io.restassured.response.Response;


public class ValidateCreateCustomerAPI extends TestSetup{
	
	@Test
	public void validateAPIWithValidSecretKey(Hashtable<String, String> data)
	{
		Response response = CreateCustomerAPI.sendPostRequestToCreateCustomerWithInvalidSecretKey(data.get("email"), data.get("description"), 
				config.getValidSecretKey(), config.getCustomerAPIEndPoint());
		
		response.statusCode();
		
		Assert.assertEquals(response.statusCode(), 200);
	}
	
	@Test
	public void validateAPIWithInvalidSecretKey()
	{
		
	}
	
	@Test
	public void validateAPIWithValidParameters()
	{
		
	}

}
