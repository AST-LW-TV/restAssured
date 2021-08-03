package utilities;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonFormatter {
    public static String formatJson(String stringFormat) {
        String formattedJson = null;
        JSONObject json = null;
        try {
            json = new JSONObject(stringFormat);
            formattedJson = json.toString(4);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return formattedJson;
    }
}
