package com.ems.bdd.jsonvalidation;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.testng.annotations.Test;

import java.io.File;

public class ValidateUsingJsonSchemaInClassPath {

    @Test
    public void validateJsonSchemaResponse() {

        File responseFile = new File("src/test/resources/jsonValidation/response.json");

        RestAssured.given()
                .baseUri("http://localhost:3000/")
                .contentType("application/json")
                .body(responseFile)
                .when()
                .post("/employees")
                .then()
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("jsonValidation/schema.json"));
    }
}
