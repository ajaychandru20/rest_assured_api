package com.ems.non_bdd;


import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GetAllEmployees {

    @Test(enabled = false)
    public void getAllEmployeeDetails() {
        RestAssured.baseURI = "http://localhost:3000/";

        RequestSpecification requestSpecification = RestAssured.given();

        Response response = requestSpecification.request(Method.GET, "employees");
        System.out.println(response.asPrettyString());
        System.out.println("Status Code is: " + response.getStatusCode());

    }

    @Test(enabled = false)
    public void createAnEmployee() {
        RestAssured.baseURI = "http://localhost:3000/";

        RequestSpecification requestSpecification = RestAssured.given().header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"name\":\"Vijay\",\n" +
                        "    \"role\":\"Actor\"\n" +
                        "}");

        Response response = requestSpecification.request(Method.POST, "employees");
        System.out.println(response.getStatusCode());
        System.out.println(response.asPrettyString());

    }

    @Test(enabled = false)
    public void updateAnEmployee() {
        RestAssured.baseURI = "http://localhost:3000/";
        RequestSpecification requestSpecification = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"name\":\"Vijay\",\n" +
                        "    \"role\":\"Actor and CM\"\n" +
                        "}");
        Response response = requestSpecification.request(Method.PUT, "employees/9b52");
        System.out.println(response.asPrettyString());
    }

    @Test
    public void deleteAnEmployee(){
        RestAssured.baseURI = "http://localhost:3000/";

        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification.request(Method.DELETE,"employees/9b52");
        System.out.println(response.asPrettyString());
        System.out.println(response.getStatusCode());



    }




}
