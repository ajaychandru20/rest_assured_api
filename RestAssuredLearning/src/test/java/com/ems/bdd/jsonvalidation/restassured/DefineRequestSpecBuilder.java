package com.ems.bdd.jsonvalidation.restassured;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import java.io.File;

public class DefineRequestSpecBuilder {

    File fileRead = new File("src/test/resources/jsonValidation/readJsonFile/response.json");
    public static void requestSpecficationBuilder(){

        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setBaseUri("http://localhost:3000");
        requestSpecBuilder.setBasePath("/employees");

        RequestSpecification requestSpecification = requestSpecBuilder.build();

        RestAssured.given().spec(requestSpecification).get("/1").prettyPrint();

    }

    public static void main(String[] args) {

    requestSpecficationBuilder();



    }

}
