package SetUpPackage;

import org.testng.annotations.*;

import io.restassured.RestAssured;

public class TestSetup {
	
	@BeforeSuite
	public void setUp()
	{
		RestAssured.baseURI = "https://api.stripe.com";
		RestAssured.basePath = "/v1";
	}
	
	@AfterSuite
	public void tearDown()
	{
		
	}

}
