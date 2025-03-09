package com.ems.bdd;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.io.File;

public class UpdateGetterSetterEmployeeUsingFileJson {

    @Test
    public void insertEmployeeUsingJson() {

        File jsonFile = new File("postData.json");

        RestAssured
                .given()
                .baseUri("http://localhost:3000/")
                .header("Content-Type", "application/json")
                .body(jsonFile)
                .when()
                .post("employees")
                .prettyPrint();


    }

}
