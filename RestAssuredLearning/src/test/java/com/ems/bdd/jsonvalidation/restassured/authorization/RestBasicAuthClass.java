package com.ems.bdd.jsonvalidation.restassured.authorization;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RestBasicAuthClass {

    public static void main(String[] args) {

        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setBaseUri("https://postman-echo.com").setBasePath("/basic-auth");

        RequestSpecification specification = builder.build();
//        RestAssured.given().spec(specification).get().prettyPrint();
        RestAssured.given().spec(specification).auth().basic("postman","password").get().prettyPrint();

    }

}
