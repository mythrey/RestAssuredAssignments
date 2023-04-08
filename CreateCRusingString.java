package day5;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateCRusingString {

	@Test
	public void CreateInc() {
		// Step 1: Requirement Gather
		// Step 2: Endpoint with resources
		RestAssured.baseURI = "https://dev97283.service-now.com/api/now/table/change_request";
		// Step 3: Construct the request (auth, headers)
		RestAssured.authentication = RestAssured.basic("admin", "kf85$@guCQDH");

		RequestSpecification body = RestAssured.given().contentType(ContentType.JSON)
										       .body("{\r\n"
										       		+ "    \"short_description\": \"Create CR using RestAssured\",\r\n"
										       		+ "    \"description\": \"Creating CR using body in RA\"\r\n"
										       		+ "}");
		// Step 4 : Http Methods
		Response response = body.post();
		// Step 5: Validate the response
		response.prettyPrint();

	}

}
