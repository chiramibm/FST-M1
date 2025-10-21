package project;

import java.util.HashMap;

import org.apache.http.client.methods.RequestBuilder;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestLogSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class GitHubProjectTest {
String SSHKey="ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAID3bO336pyRqv4ebhihkfFa2KBu0zAbLZFWwQTKB7l1u";
int keyId; //temp variable to share id

RequestSpecification requestSpec;
ResponseSpecification responseSpec;
@BeforeClass
public void setup() {
	requestSpec =new RequestSpecBuilder().
			setBaseUri("https://api.github.com/users/USERNAME/keys").
			addHeader("Content-Type", "application/json").
			addHeader("Authorization", "token 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").
			addHeader("X-GitHub-Api-Version", "2022-11-28").
			build();
	
	responseSpec= new ResponseSpecBuilder().
			expectBody("title",Matchers.equalTo("Testkey")).
			expectResponseTime(Matchers.lessThanOrEqualTo(3000L)).
			build();
}
	@Test(priority = 1)
	public void postRequestTest() {
		HashMap<String,String> reqBody=new HashMap<>();
		reqBody.put("title","Testkey");
		reqBody.put("key",SSHKey);
		
		Response response =RestAssured.
		given().spec(requestSpec).body(reqBody).
		when().post();
		keyId=response.then().extract().path("id");
		response.then().statusCode(201);
	}
	
	@Test(priority = 2)
	public void getRequestTest() {
		
		
		RestAssured.
		given().spec(requestSpec).pathParam("keyId", keyId).
		when().get("/{key_id}").
		then().statusCode(200).spec(responseSpec);
	}
	
	
	@Test(priority = 3)
	public void deleteRequestTest() {
		RestAssured.
		given().spec(requestSpec).pathParam("keyId", keyId).
		when().delete("/{key_id}").
		then().statusCode(204);
	}
}

