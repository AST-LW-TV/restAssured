package assignment4;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONException;
import org.json.JSONObject;
import utilities.GetDomainAndPath;

import static io.restassured.RestAssured.given;

public class WeatherApi {

    private String hostDomain;
    private String resourcePath;
    private JsonPath js;

    public String weatherApi(){
        String[] values= GetDomainAndPath.getDomainAndPath(
                new String[]{"WeatherApiHostDomain","getWeatherApiResourcePath"});
        hostDomain=values[0];
        resourcePath=values[1];
        RestAssured.baseURI=hostDomain;
        Response response=given()
                .param("q","london")
                .param("cnt","1")
                .header("X-Rapidapi-Host","community-open-weather-map.p.rapidapi.com")
                .header("X-Rapidapi-Key","a2fbc19ed6msh07c2d0076ce1a6ap1f87fcjsn2dd0e06a64af")
                .when().get(resourcePath)
                .then()
                .extract().response();
        return response.asString();
    }
}
