package SetUpPackage;

import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import UtilityPackage.ExcelReader;
import UtilityPackage.configProperties;
import io.restassured.RestAssured;

public class TestSetup {
	
	public static configProperties config;
	
	public static ExcelReader excel = new ExcelReader("./src/test/resources/TestData/TestData.xlsx");
	
	@BeforeSuite
	public void setUp()
	{
		config = ConfigFactory.create(configProperties.class);
		
		RestAssured.baseURI = config.getBaseURI();
		RestAssured.basePath = config.getBasePath();

	}
	
	@AfterSuite
	public void tearDown()
	{
		
	}

}
