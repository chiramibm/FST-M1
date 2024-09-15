package examples;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.response.Response;

public class FirstTest {
//// GET https://petstore.swagger.io/v2/pet/findByStatus?status=alive
	@Test
	public void getRequestwithQueryParam() {
		Response response = 
				given().
				   baseUri("https://petstore.swagger.io/v2/pet").
				   header("Content-Type", "application/json"). // specify the response type
				   queryParam("status", "alive").
				when().
				   get("/findByStatus");
		System.out.println("The header response is : ");
		System.out.println(response.getHeaders());
		System.out.println("***********************************");
		System.out.println("The reponse as string :");
		System.out.println(response.getBody().asString());
		System.out.println("***********************************");
		System.out.println("The reponse as pretty string :");
		System.out.println(response.getBody().asPrettyString());
		
		//Extract individual values
		String petStatus=response.then().extract().path("[0].status");
		//Assertions using testng
		assertEquals(petStatus, "alive");
		// another easy assertion way
		response.then().statusCode(200).body("[0].status",equalTo("alive")).body("[0].name",equalTo("Riley"));
		
		
	}
	
	@Test
	public void getRequestWithParam() {
	    given().
	      baseUri("https://petstore.swagger.io/v2/pet").
	      header("Content-Type", "application/json").
	      pathParam("petId", 77232).
	      log().all(). // used to log it easily instead of print statement
	   when().
	      get("/{petId}").
	   then().
	      statusCode(200).
	      body("status",equalTo("alive")).
	      body("name",equalTo("Riley")).
	      log().all();
	   
	} 

}
