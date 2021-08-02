package assignment2.getRequests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.StringToJson;

import static io.restassured.RestAssured.given;

public class GettingProducts {

    public int getProductsList(String hostDomain,String resourcePath){
        RestAssured.baseURI=hostDomain;
        int statusCode=given()
                .when().get(resourcePath)
                .then().contentType(ContentType.JSON)
                .extract().statusCode();
        return statusCode;
    }

    public int getLimitedProducts(String hostDomain,String resourcePath){
        RestAssured.baseURI=hostDomain;
        Response response=given()
                .param("limit","6")
                .when().get(resourcePath)
                .then().extract().response();
        String productList=response.asString();
        JsonPath productListInJson=StringToJson.ConversionToJson(productList);
        return productListInJson.get("size()");
    }

}
