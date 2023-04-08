package day5;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetIncidentSnowParam {

	@Test
	public void GetInc() {
		// Step 1: Requirement Gather
		// Step 2: Endpoint with resources
		RestAssured.baseURI = "https://dev97283.service-now.com/api/now/table/incident";
		// Step 3: Construct the request (auth, headers)
		// Get all the incidents which should display only the sys_id and category and
		// filter it with the category hardware
		RestAssured.authentication = RestAssured.basic("admin", "kf85$@guCQDH");
		RequestSpecification sysparm = RestAssured.given()
												  .param("sysparm_fields", "sys_id,category")
												  .param("category","hardware");
		// Step 4 : Http Methods
		Response response = sysparm.get();
		// Step 5: Validate the response
		response.prettyPrint();

	}

}
