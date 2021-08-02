package tests_for_assignment3.testsForGetRequest;

import assignment3.PojoGet;
import assignment3.details.GetDetailsPojoFormatParent;
import com.google.gson.Gson;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.GetDomainAndPath;

public class TestPojoGetRequest {

    private String hostDomain;
    private String resourcePath;
    private PojoGet getInstance=new PojoGet();

    @Test
    public void checkTheUserFirstName(){
        String[] values= GetDomainAndPath.getDomainAndPath(
                new String[]{"ResReqPostHostDomain","getGetUserResourcePath"});
        hostDomain=values[0];
        resourcePath=values[1];
        String responseStringFormat=getInstance.getTheUser(hostDomain,resourcePath).asString();
        // some refactoring required...
        Gson gson=new Gson();
        GetDetailsPojoFormatParent details=gson.fromJson(responseStringFormat,GetDetailsPojoFormatParent.class);
        Assert.assertTrue(details.getData().getFirst_name().equalsIgnoreCase("Janet"));

    }

}
