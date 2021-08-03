# restAssured

## Project Structure

```
+-- restAssured 
    +-- src
        +-- main
            +-- java
                +-- assignment2 
                    +-- getRequests
                        +-- GettingProducts.java
                    +-- postRequests
                        +-- details
                            +-- PostDetails.java
                        +-- AddingProductToCart.java
                        +-- CreatingNewUser.java
                +-- assignment3
                    +-- details
                        +-- GetDetailsPojoFormatChild1.java
                        +-- GetDetailsPojoFormatChild2.java
                        +-- GetDetailsPojoFormatParent.java
                        +-- PostDetailsPojoFormat.java
                    +-- PojoGet.java
                    +-- PojoPost.java
                +-- assignment4
                    +-- Main.java
                    +-- MakeUpApi.java
                    +-- WeatherApi.java
                +-- utilities
                    +-- Config.java
                    +-- GetDomainAndPath.java
                    +-- JsonFormatter.java
                    +-- PojoConverter.java
                    +-- StringToJson.java
            +-- resources
                +-- filesPath.properties
                +-- hostDomain.properties
                +-- resourcesDomain.properties
        +-- test 
            +-- java
                +-- tests_for_assignment2
                    +-- testsForGetRequests
                        +-- TestGetRequests.java
                    +-- testsForPostRequests
                        +-- TestPostRequests.java
                +-- tests_for_assignment3
                    +-- testsForGetRequest
                        +-- TestPojoGetRequest.java
                    +-- testsForPostRequest
                        +-- TestPojoPostRequest.json
    +-- pom.xml
    +-- testng.xml                    
```

### packages
- [assignment2](https://github.com/AST-LW-TV/restAssured/tree/main/restAssured/src/main/java/assignment2)
    - [getRequests](https://github.com/AST-LW-TV/restAssured/tree/main/restAssured/src/main/java/assignment2/getRequests)
        - [GettingProducts](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/main/java/assignment2/getRequests/GettingProducts.java) - returns product list and gets limited products
    - [postRequests](https://github.com/AST-LW-TV/restAssured/tree/main/restAssured/src/main/java/assignment2/postRequests) 
        - [details](https://github.com/AST-LW-TV/restAssured/tree/main/restAssured/src/main/java/assignment2/postRequests/details)
            - [PostDetails](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/main/java/assignment2/postRequests/details/PostDetails.java) - post details of the user and product
        - [AddingProductToCart](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/main/java/assignment2/postRequests/AddingProductToCart.java) - add to cart functionality
        - [CreatingNewUser](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/main/java/assignment2/postRequests/CreatingNewUser.java) - creating new user functionality
- [assignment3](https://github.com/AST-LW-TV/restAssured/tree/main/restAssured/src/main/java/assignment3) 
    - [details](https://github.com/AST-LW-TV/restAssured/tree/main/restAssured/src/main/java/assignment3/details)
        - [GetDetailsPojoFormatChild1](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/main/java/assignment3/details/GetDetailsPojoFormatChild1.java) - leaf class 1 
        - [GetDetailsPojoFormatChild2](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/main/java/assignment3/details/GetDetailsPojoFormatChild2.java) - leaf class 2
        - [GetDetailsPojoFormatParent](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/main/java/assignment3/details/GetDetailsPojoFormatParent.java) - parent class 1 
        - [PostDetailsPojoFormat](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/main/java/assignment3/details/PostDetailsPojoFormat.java) - parent class 2
    - [PojoGet](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/main/java/assignment3/PojoGet.java) - pojo format for get request
    - [PojoPost](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/main/java/assignment3/PojoPost.java) - pojo format for post request
- [assignment4](https://github.com/AST-LW-TV/restAssured/tree/main/restAssured/src/main/java/assignment4)
    - [MakeUpApi](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/main/java/assignment4/MakeUpApi.java) - makeup api for getting cosmetics products
      ```
      Output of MakeUp api ( not prettified format )
      +++++++++++++++Black Colored Products+++++++++++++++
        {id=1041, brand=zorah biocosmetiques, name=Liquid Liner, price=0.0, price_sign=$, currency=USD, image_link=https://www.purpicks.com/wp-content/uploads/2018/06/Zorah-Biocosmetiques-Liquid-Liner.png, product_link= ...}
        {id=1030, brand=penny lane organics, name=Lip Gloss, price=0.0, price_sign=$, currency=USD, image_link=https://www.purpicks.com/wp-content/uploads/csm/sunset-bronze-pennylaneorganics1.jpg, product_link=...}
        ...
        ...
      +++++++++++++++Unique Brand Products+++++++++++++++
        colourpop
        boosh
        deciem
        zorah biocosmetiques
        w3llpeople
        ...
        ...
      +++++++++++++++Natural Products+++++++++++++++
        {id=507, brand=null, name=Saint Cosmetics Bronzer, price=30.96, price_sign=null, currency=null, image_link=https://d3t32hsnjxo7q6.cloudfront.net/i/4f8578c9a7588249e95d463078b84de1_ra,w158,h184_pa,w158,h184.jpg, product_link=...}
        {id=503, brand=physicians formula, name=Physicians Formula Super BB InstaReady Filter BB Bronzer, price=19.99, price_sign=null, currency=null, image_link=...}
        ... 
        ... 
      ```
    - [WeatherApi](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/main/java/assignment4/WeatherApi.java) - weather api for getting london climate info
      ```
      output of Weather Api ( prettified output )

      {
          "cod": "200",
          "count": 1,
          "list": [{
                "clouds": {"all": 75},
                "coord": {
                "lat": 51.5085,
                "lon": -0.1257
          },
          "dt": 1627970956,
          "id": 2643743,
          "main": {
                "feels_like": 285.37,
                "humidity": 92,
                "pressure": 1014,
                "temp": 285.66,
                "temp_max": 288.17,
                "temp_min": 282.76
          },
          "name": "London",
          "rain": null,
          "snow": null,
          "sys": {"country": "GB"},
          "weather": [{
                "description": "broken clouds",
                "icon": "04d",
                "id": 803,
                "main": "Clouds"
          }],
          "wind": {
          "deg": 0,
          "speed": 1.54
          }
        }],
      "message": "accurate"
      }
    ```
    - [Main](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/main/java/assignment4/Main.java) - processing and displaying results
- [utilities](https://github.com/AST-LW-TV/restAssured/tree/main/restAssured/src/main/java/utilities) 
    - [Config](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/main/java/utilities/Config.java) - used for getting values from properties file
    - [GetDomainAndPath](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/main/java/utilities/GetDomainAndPath.java) - gets domain and resource path using *Config*
    - [JsonFormatter](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/main/java/utilities/JsonFormatter.java) - prettifies json string
    - [PojoConverter](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/main/java/utilities/PojoConverter.java) - helper class for converting pojo object template to Json
    - [StringToJson](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/main/java/utilities/StringToJson.java) - convert the string to json
- [resources](https://github.com/AST-LW-TV/restAssured/tree/main/restAssured/src/main/resources)
    - [filesPath](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/main/resources/filesPath.properties) - parent properties files that has path for child files [hostDomain](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/main/resources/hostDomain.properties) and [resourcesDomain](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/main/resources/resourcesDomain.properties)

There are 6 test cases, 
- [status code 200 checking](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/test/java/tests_for_assignment2/testsForGetRequests/TestGetRequests.java)
- [size of the product list](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/test/java/tests_for_assignment2/testsForGetRequests/TestGetRequests.java)
- [status code 201 checking](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/test/java/tests_for_assignment2/testsForPostRequests/TestPostRequests.java)
- [verifing if product added to cart](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/test/java/tests_for_assignment2/testsForPostRequests/TestPostRequests.java)
- [validating pojo get request](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/test/java/tests_for_assignment3/testsForGetRequest/TestPojoGetRequest.java)
- [validating pojo post request](https://github.com/AST-LW-TV/restAssured/blob/main/restAssured/src/test/java/tests_for_assignment3/testsForPostRequest/TestPojoPostRequest.java) 

They can be executed using the following maven command 
```
mvn -P AssignmentTestCases test 
```
All the test cases, are Passed