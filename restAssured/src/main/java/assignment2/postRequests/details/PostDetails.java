package assignment2.postRequests.details;

public class PostDetails {
    public static String postCartDetails() {
        return "{\n" +
                "\"userId\":5,\n" +
                "\"date\":\"2020-02-03\",\n" +
                "\"products\":[{\"productId\":5,\"quantity\":1},{\"productId\":1,\"quantity\":5}]\n" +
                "}";
    }

    public static String postUserInformation() {
        return "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}\n";
    }
}
