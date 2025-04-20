package com.ems.bdd.jsonvalidation.restassured.authorization;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class RestAPIAuthClass {

    @Test(enabled = false)
    public void passingAPIBaseURL(){

        RestAssured.given().baseUri("https://api.openweathermap.org/data/2.5/weather?q=pattabiram&appid=3764be22d1c217d19865567ffe95d7a0")
                .when().get().prettyPrint(); // passing the api key without query parameter, its depends on the Developer code, if they set it this as using headers or query parameter

    }

    @Test
    public void passingAPIQueryPara(){
        RestAssured.given()
                .baseUri("https://api.openweathermap.org/data/2.5/weather")
                .when()
                .queryParam("q","chennai")
                .queryParam("appid","Default")
                .get()
                .then().log().body();
    }

}
