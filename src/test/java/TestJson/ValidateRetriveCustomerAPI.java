package TestJson;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ValidateRetriveCustomerAPI {
	
	@Test (priority=1)
	public void ValidateCreateCusAPIWithValidSK()
	{
		
		Response response = given().formParams("id", "1")
				.get("http://localhost:8080/SmartUtilityApi/rest/resource/getemployee/1");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		
		response.prettyPrint();

		
	}
	

}
