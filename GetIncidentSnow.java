package day5;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.response.Response;

public class GetIncidentSnow {

	@Test
	public void GetInc() {
		// Step 1: Requirement Gather
		// Step 2: Endpoint with resources
		RestAssured.baseURI = "https://dev97283.service-now.com/api/now/table/incident";
		// Step 3: Construct the request (auth, headers)
		RestAssured.authentication = RestAssured.basic("admin", "kf85$@guCQDH");
		// Step 4 : Http Methods
		Response response = RestAssured.get();
		// Step 5: Validate the response
	    response.prettyPrint();

	}

}
