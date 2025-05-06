package com.ems.chatGPTTasks.easy.Task2;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Task2 {
    public static void main(String[] args) {
        String jsonBody = "{\n" +
                "    \"title\": \"Ajay's Testing Post\",\n" +
                "    \"body\": \"Learning Rest Assured is fun!\",\n" +
                "    \"userId\": 1\n" +
                "}";

        Response response = RestAssured.given()
                .baseUri("https://jsonplaceholder.typicode.com/posts")
                .when()
                .header("Content-Type", "application/json")
                .body(jsonBody)
                .post();

        String jsonResponse = response.getBody().asString();

        JsonPath jsonPath = new JsonPath(jsonResponse);
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response: " + jsonResponse);
        System.out.println("Generated ID: " + jsonPath.getString("id"));




    }
}
