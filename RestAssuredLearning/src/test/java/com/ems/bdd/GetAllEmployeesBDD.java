package com.ems.bdd;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetAllEmployeesBDD {


    @Test(enabled = false)
    public void getEmployeesDetailBDD() {
                given()
                .baseUri("http://localhost:3000/")
                .when()
                .get("/employees")
                .prettyPrint();
    }

    @Test(enabled = true)
    public void insertEmployeeDetailBDD(){

        given()
                .baseUri("http://localhost:3000/")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"name\":\"Vijay\",\n" +
                        "    \"age\": \"23\",\n" +
                        "    \"department\": \"Arts\",\n" +
                        "    \"email\": \"testing002@gmail.com\" " +
                        "}")
                .when()
                .post("/employees")
                .prettyPrint();
    }

    @Test(enabled = false)
    public void updateEmployeeDetailBDD(){

        given()
                .baseUri("http://localhost:3000/")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"name\": \"Vijay\",\n" +
                        "    \"age\": \"25\",\n" +
                        "    \"department\": \"Arts\",\n" +
                        "    \"email\": \"testing002@gmail.com\"\n" +
                        "}")
                .when()
                .put("/employees/1")
                .prettyPrint();


    }






}
