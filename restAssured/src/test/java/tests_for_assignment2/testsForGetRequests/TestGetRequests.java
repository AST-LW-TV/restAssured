package tests_for_assignment2.testsForGetRequests;

import assignment2.getRequests.GettingProducts;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.GetDomainAndPath;

public class TestGetRequests {
    private String hostDomain;
    private String resourcePath;
    private GettingProducts getInstance=new GettingProducts();

    @Test
    public void statusCodeOfGetRequest(){
        String[] values= GetDomainAndPath.getDomainAndPath(
                new String[]{"FakeStoreGetHostDomain","getProductsResourcePath"});
        hostDomain=values[0];
        resourcePath=values[1];
        int statusCode=getInstance.getProductsList(hostDomain,resourcePath);
        Assert.assertTrue(statusCode==200);
    }

    @Test
    public void checkingSizeOfProductList(){
        String[] values=GetDomainAndPath.getDomainAndPath(new String[]{"FakeStoreGetHostDomain","getProductsResourcePath"});
        hostDomain=values[0];
        resourcePath=values[1];
        int size=getInstance.getLimitedProducts(hostDomain,resourcePath);
        Assert.assertTrue(size==6);
    }

}
