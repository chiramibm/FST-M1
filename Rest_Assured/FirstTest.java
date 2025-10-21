package examples;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FirstTest {

	@Test

	// GET https://petstore.swagger.io/v2/pet/findByStatus?status=sold
	public void getResponsWithQueryParam() {
		Response response = RestAssured.given().baseUri("https://petstore.swagger.io/v2/pet")
				.header("Content-Type", "application/json").queryParam("status", "sold").when().get("/findByStatus");

		System.out.println(response.getBody().asString());

		System.out.println("***************************");
		System.out.println(response.getBody().asPrettyString());

		System.out.println("***************************");
		System.out.println(response.getHeaders().asList());
		String petStatus = response.then().extract().path("[0]['status']");

		Assert.assertEquals(petStatus, "sold");// this is asserting using Testng but we need to extract and then assert
												// everytime.

		response.then().statusCode(200).body("[0]['status']", Matchers.equalTo("sold"));// this assertion done via
																						// hamcrust along with statement
																						// no need to extract.

	}

	@Test
	public void getResponsWithPathParam() {
		RestAssured.given().baseUri("https://petstore.swagger.io/v2/pet").header("content-type", "application/json")
				.pathParam("petId", 12).when().get("/{petId}"). // get("/12")
				then().statusCode(200).body("status", Matchers.equalTo("available"))
				.body("name", Matchers.equalTo("doggie"));
	}
}
