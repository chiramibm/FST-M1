package liveProject;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.head;
import static org.hamcrest.Matchers.equalTo;

import java.util.Map;

import javax.annotation.meta.When;

import org.apache.commons.collections4.map.HashedMap;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import au.com.dius.pact.consumer.dsl.DslPart;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit5.PactConsumerTestExt;
import au.com.dius.pact.consumer.junit5.PactTestFor;
import au.com.dius.pact.core.model.RequestResponsePact;
import au.com.dius.pact.core.model.annotations.Pact;

@ExtendWith(PactConsumerTestExt.class)
public class ConsumerTest {

    Map<String,String> headers = new HashedMap<String, String>();
    
    @Pact(consumer="UserConsumer",provider="UserProvider")
    public RequestResponsePact createPact(PactDslWithProvider builder)    {
    	headers.put("Content-Type", "application/json");
    	//create request reponse body
    	DslPart requestResponseBody = new PactDslJsonBody().
    			numberType("Id",123).
    			stringType("firstName","chidam").
    			stringType("lastName","vairavan").
    			stringType("email","chid@test.com");
    	return builder.given("POST Request").
    		   uponReceiving("Request to create User").
    		   method("POST").
    		   path("/api/users").
    		   headers(headers).
    		   body(requestResponseBody).
    		   willRespondWith().
    		   status(201).
    		   body(requestResponseBody).
               toPact();
    	
    }
    
    //
    @Test
    @PactTestFor(providerName="UserProvider",port="8282")
    public void postRequestTest() {
    	 Map<String,Object> reqBody = new HashedMap<String,Object>();
    	 reqBody.put("Id", 123);
    	 reqBody.put("firstName","chidam");
    	 reqBody.put("lastName","vairavan");
    	 reqBody.put("email","chid@test.com");
    	 given().baseUri("http://localhost:8282/api/users").headers(headers).body(reqBody).log().all().
    	 when().post().
    	 then().statusCode(201).body("Id", equalTo(123)).log().all();
    }
    
}
