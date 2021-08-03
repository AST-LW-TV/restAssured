package utilities;

import io.restassured.path.json.JsonPath;

public class StringToJson {
    public static JsonPath ConversionToJson(String stringFormat) {
        JsonPath js = new JsonPath(stringFormat);
        return js;
    }
}
