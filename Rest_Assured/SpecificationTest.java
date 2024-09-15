package examples;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

import java.util.Map;

import javax.annotation.meta.When;

import org.apache.commons.collections4.map.HashedMap;

public class SpecificationTest {

	RequestSpecification requestSpec;
	ResponseSpecification responseSpec;
	int petId;
	
	@BeforeClass
	public void setUp() {
		//request Spec
		requestSpec=new RequestSpecBuilder().
				setBaseUri("https://petstore.swagger.io/v2/pet").
				addHeader("Content-Type", "application/json").
				build();
		// response spec
		responseSpec= new ResponseSpecBuilder().
				expectStatusCode(200).
				expectResponseTime(lessThanOrEqualTo(3000L)).
				build();
	}
	
	@Test (priority = 0)
	public void postResquest() {
		Map<String,Object> reqBody=new HashedMap<String,Object>();
		reqBody.put("id", "986525");
		reqBody.put("name", "chidam");
		reqBody.put("status","alive");
		//send response, save response
		Response response= given().spec(requestSpec).body(reqBody).
				when().post();
		//extract the pet id
		petId=response.then().extract().path("id");
		//Assertion
		response.then().spec(responseSpec).body("status",equalTo("alive")).log().all();
	}
	
	@Test(priority = 1)
	public void getRequest() {
		given().spec(requestSpec).pathParam("petId",petId).log().uri().
		when().get("/{petId}").
		then().spec(responseSpec).body("name",equalTo("chidam")).log().all();
		
	}
	
	@Test(priority = 2)
	public void deleteRequest() {
		given().spec(requestSpec).pathParam("petId",petId).log().uri().
		when().delete("/{petId}").
		then().spec(responseSpec).body("message",equalTo(""+petId)).log().all();
		
	}
}
