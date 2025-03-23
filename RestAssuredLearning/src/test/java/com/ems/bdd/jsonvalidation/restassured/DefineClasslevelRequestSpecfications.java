package com.ems.bdd.jsonvalidation.restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;

public class DefineClasslevelRequestSpecfications {

    RequestSpecification requestSpecificationURIPath;

    File jsonFile = new File("src/test/resources/jsonValidation/readJsonFile/response.json");

    @BeforeSuite
    public void setRequestSpecification() {
        requestSpecificationURIPath = RestAssured.given()
                .baseUri("http://localhost:3000")
                .basePath("/employees");

        RestAssured.requestSpecification  = requestSpecificationURIPath;

    }

    @Test(enabled = false)
    public void getAllEmployee() {

        RestAssured.given()
                .spec(requestSpecificationURIPath)
                .when()
                .get()
                .prettyPrint();
    }

    @Test(enabled = false)
    public void getSpecficEmployee(){
        RestAssured.given()
                .spec(requestSpecificationURIPath)
                .when()
                .get("/3")
                .prettyPrint();
    }
    @Test(enabled = false)
    public void createEmployeeExplicitReqSpec(){

        RequestSpecification requestSpecificationExplicit = RestAssured.given().contentType(ContentType.JSON);

        RestAssured.given()
                .spec(requestSpecificationURIPath)
                .spec(requestSpecificationExplicit)
                .body(jsonFile)
                .post()
                .prettyPrint();


    }

    @Test
    public void getAllEmployeeWithoutUsingRequestSpecfications(){

        RestAssured.given()
                .when()
                .get()
                .prettyPrint();


    }



}
