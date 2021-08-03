package assignment2.postRequests;

import assignment2.postRequests.details.PostDetails;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.StringToJson;

import static io.restassured.RestAssured.given;

public class AddingProductToCart {
    public JsonPath addToCart(String hostDomain, String resourcePath) {
        RestAssured.baseURI = hostDomain;
        Response response = given()
                .header("Content-Type", "application/json")
                .body(PostDetails.postCartDetails())
                .when().post(resourcePath)
                .then().extract().response();
        String responseStringFormat = response.asString();
        return StringToJson.ConversionToJson(responseStringFormat);
    }
}
