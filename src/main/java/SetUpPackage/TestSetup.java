package SetUpPackage;

import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.*;

import UtilityPackage.InterfaceConfigProperties;
import io.restassured.RestAssured;

public class TestSetup {
	
	public static InterfaceConfigProperties config;
	
	@BeforeSuite
	public void setUp()
	{
		config = ConfigFactory.create(InterfaceConfigProperties.class);
		
		RestAssured.baseURI = config.getBaseURI();
		RestAssured.basePath = config.getBasePath();

	}
	
	@AfterSuite
	public void tearDown()
	{
		
	}

}
