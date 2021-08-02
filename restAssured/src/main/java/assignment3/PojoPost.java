package assignment3;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.StringToJson;

import static io.restassured.RestAssured.given;

public class PojoPost {

    public JsonPath postTheUser(String hostDomain,String resourcePath,String postDetails){
        RestAssured.baseURI=hostDomain;
        Response response=given()
                .header("Content-Type","application/json")
                .body(postDetails)
                .when().post(resourcePath)
                .then()
                .extract().response();
        String responseStringFormat=response.asString();
        return StringToJson.ConversionToJson(responseStringFormat);
    }

}
