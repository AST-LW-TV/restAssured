package utilities;

import com.google.gson.Gson;

public class PojoConverter {
    private static Gson gson = new Gson();

    public static String converterToJson(Object template) {
        return gson.toJson(template);
    }
}

