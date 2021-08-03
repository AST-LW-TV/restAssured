package assignment4;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import utilities.GetDomainAndPath;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class MakeUpApi {
    private String hostDomain;
    private String resourcePath;
    private JsonPath js;
    private int size;
    private List<Object> naturalProducts;
    private List<Object> productsWithBlackColor;
    private List<String> uniqueBrandNames;

    private List<Object> getBlackColorProducts(int size) {
        List<Object> products = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int sizeOfProductColors = js.get("[" + i + "].product_colors.size()");
            for (int j = 0; j < sizeOfProductColors; j++) {
                if (js.get("[" + i + "].product_colors[" + j + "].colour_name") != null) {
                    String tempValue = js.get("[" + i + "].product_colors[" + j + "].colour_name").toString();
                    if (tempValue.toLowerCase().contains("black"))
                        products.add(js.get("[" + i + "]"));
                }
            }
        }
        return products;
    }

    private List<String> getUniqueProducts(int size) {
        List<String> uniqueBrands = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String brandName = js.get("[" + i + "].brand");
            if (!uniqueBrands.contains(brandName))
                uniqueBrands.add(brandName);
        }
        return uniqueBrands;
    }

    private List<Object> getNaturalProducts(int size) {
        List<Object> products = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int sizeOfProductColors = js.get("[" + i + "].tag_list.size()");
            for (int j = 0; j < sizeOfProductColors; j++) {
                if (js.get("[" + i + "].tag_list[" + j + "]") != null) {
                    String tempValue = js.get("[" + i + "].tag_list[" + j + "]").toString();
                    if (tempValue.toLowerCase().contains("natural"))
                        products.add(js.get("[" + i + "]"));
                }
            }
        }
        return products;
    }

    private void makeUpProducts() {
        String[] values = GetDomainAndPath.getDomainAndPath(
                new String[]{"MakeUpApiHostDomain", "getMakeUpProductsResourcePath"});
        hostDomain = values[0];
        resourcePath = values[1];
        RestAssured.baseURI = hostDomain;
        String responseStringFormat = given()
                .when().get(resourcePath)
                .then()
                .extract().response().asString();
        js = new JsonPath(responseStringFormat);
        size = js.get("size()");
        uniqueBrandNames = getUniqueProducts(size);
        naturalProducts = getNaturalProducts(size);
    }

    public List<Object> getBlackColorProducts() {
        makeUpProducts();
        productsWithBlackColor = getBlackColorProducts(size);
        return productsWithBlackColor;
    }

    public List<String> getUniqueBrandNames() {
        makeUpProducts();
        uniqueBrandNames = getUniqueProducts(size);
        return uniqueBrandNames;
    }

    public List<Object> getNaturalProducts() {
        makeUpProducts();
        naturalProducts = getNaturalProducts(size);
        return naturalProducts;
    }
}
