package com.ems.bdd.jsonvalidation.restassured.authorization;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class RestOauth2Class {

    @Test
    public void getGitRepoDetails(){

        String token = "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";

        RestAssured.given()
                .auth()
                .oauth2(token)
                .when()
                .baseUri("https://api.github.com/user/repos")
                .get().prettyPrint();
    }
}
