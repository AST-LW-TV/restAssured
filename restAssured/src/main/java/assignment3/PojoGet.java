package assignment3;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PojoGet {
    public Response getTheUser(String hostDomain, String resourcePath) {
        RestAssured.baseURI = hostDomain;
        Response response = given()
                .pathParam("id", 2)
                .when().get(resourcePath)
                .then().extract().response();
        return response;
    }
}
