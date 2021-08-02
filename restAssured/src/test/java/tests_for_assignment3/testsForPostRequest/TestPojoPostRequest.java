package tests_for_assignment3.testsForPostRequest;

import assignment3.PojoPost;
import assignment3.details.PostDetailsPojoFormat;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.GetDomainAndPath;
import utilities.PojoConverter;

public class TestPojoPostRequest {

    private String hostDomain;
    private String resourcePath;
    private PojoPost postInstance=new PojoPost();
    private PostDetailsPojoFormat pojoFormat=new PostDetailsPojoFormat();

    @Test
    public void pojoExample(){
        String[] values= GetDomainAndPath.getDomainAndPath(
                new String[]{"ResReqPostHostDomain","getPostNewUserResourcePath"});
        hostDomain=values[0];
        resourcePath=values[1];
        pojoFormat.setName("abc");
        pojoFormat.setJob("intern");
        String detailsToPost=PojoConverter.converterToJson(pojoFormat);
        JsonPath js=postInstance.postTheUser(hostDomain,resourcePath,detailsToPost);
        String nameToVerify=js.get("name");
        Assert.assertTrue(nameToVerify.equalsIgnoreCase("abc"));

    }

}
