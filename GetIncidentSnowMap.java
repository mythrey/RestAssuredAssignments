package day5;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetIncidentSnowMap {

	@Test
	public void GetInc() {
		// Step 1: Requirement Gather
		// Step 2: Endpoint with resources
		RestAssured.baseURI = "https://dev97283.service-now.com/api/now/table/incident";
		// Step 3: Construct the request (auth, headers)
		
		// Get all the incidents which should display only the sys_id and category and
		// filter it with the category hardware
		RestAssured.authentication = RestAssured.basic("admin", "kf85$@guCQDH");

		Map<String, String> querymap = new HashMap<String, String>();
		querymap.put("sysparm_fields", "sys_id,category");
		querymap.put("category", "hardware");

		RequestSpecification sysparm = RestAssured.given().queryParams(querymap);
		// Step 4 : Http Methods
		Response response = sysparm.get();
		// Step 5: Validate the response
		response.prettyPrint();

	}

}
