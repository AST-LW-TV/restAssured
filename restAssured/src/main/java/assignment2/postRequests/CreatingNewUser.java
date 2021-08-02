package assignment2.postRequests;

import assignment2.postRequests.details.PostDetails;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class CreatingNewUser {

    public int createNewUser(String hostDomain,String resourcePath){
        RestAssured.baseURI=hostDomain;
        int statusCode=given()
                .header("Content-Type","application/json")
                .body(PostDetails.postUserInformation())
                .when().post(resourcePath)
                .then().extract().statusCode();
        return statusCode;
    }

}
