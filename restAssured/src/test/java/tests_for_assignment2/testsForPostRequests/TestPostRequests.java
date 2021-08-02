package tests_for_assignment2.testsForPostRequests;

import assignment2.postRequests.AddingProductToCart;
import assignment2.postRequests.CreatingNewUser;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.GetDomainAndPath;

public class TestPostRequests {
    private String hostDomain;
    private String resourcePath;
    private AddingProductToCart postInstance=new AddingProductToCart();
    private CreatingNewUser createNewUser=new CreatingNewUser();

    @Test
    public void checkingIfProductAddedToCart(){
        String[] values= GetDomainAndPath.getDomainAndPath(
                new String[]{"FakeStorePostHostDomain","getPostIntoCartResourcePath"});
        hostDomain=values[0];
        resourcePath=values[1];
        JsonPath js=postInstance.addToCart(hostDomain,resourcePath);
        int size=js.get("products.size()");
        int totalProducts=0;
        for(int i=0;i<size;i++){
            int temp=js.get("products["+i+"].quantity");
            totalProducts+=temp;
        }
        Assert.assertTrue(totalProducts==6);
    }

    @Test
    public void checkingStatusCodeForNewUser(){
        String[] values=GetDomainAndPath.getDomainAndPath(
                new String[]{"ResReqPostHostDomain","getPostNewUserResourcePath"});
        hostDomain=values[0];
        resourcePath=values[1];
        int statusCode=createNewUser.createNewUser(hostDomain,resourcePath);
        Assert.assertTrue(statusCode==201);
    }

}
