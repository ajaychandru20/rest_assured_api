package com.ems.bdd.jsonvalidation.restassured.authorization;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class RestBearerTokenClass {

    @Test
    public void getGitRepository(){
        String token = "testing token";

        RestAssured.given()
                .header("Authorization","Bearer " +token)
                .when()
                .baseUri("https://api.github.com/user/repos")
                .get()
                .prettyPrint();
    }
}
