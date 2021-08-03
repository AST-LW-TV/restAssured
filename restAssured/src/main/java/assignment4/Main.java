package assignment4;

import utilities.JsonFormatter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MakeUpApi makeUpApi = new MakeUpApi();
        WeatherApi weatherApi = new WeatherApi();

        List<Object> blackProducts = makeUpApi.getBlackColorProducts();
        List<String> uniqueProducts = makeUpApi.getUniqueBrandNames();
        List<Object> naturalProducts = makeUpApi.getNaturalProducts();

        System.out.println("+++++++++++++++Black Colored Products+++++++++++++++");
        for (int i = 0; i < blackProducts.size(); i++)
            System.out.println(blackProducts.get(i));

        System.out.println("+++++++++++++++Unique Brand Products+++++++++++++++");
        for (int i = 0; i < uniqueProducts.size(); i++)
            System.out.println(uniqueProducts.get(i));

        System.out.println("+++++++++++++++Natural Products+++++++++++++++");
        for (int i = 0; i < naturalProducts.size(); i++)
            System.out.println(naturalProducts.get(i));

        System.out.println("+++++++++++++++Weather API Data - London+++++++++++++++");
        System.out.println(JsonFormatter.formatJson(weatherApi.weatherApi()));
    }
}
