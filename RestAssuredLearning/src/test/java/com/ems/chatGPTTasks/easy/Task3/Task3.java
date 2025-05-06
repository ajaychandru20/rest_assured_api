package com.ems.chatGPTTasks.easy.Task3;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Task3 {
    public static void main(String[] args) {

        String jsonBody = "{\n" +
                "  \"id\": 1,\n" +
                "  \"title\": \"Updated Post Title\",\n" +
                "  \"body\": \"Updated body content by Ajay\",\n" +
                "  \"userId\": 1\n" +
                "}";
        Response response = RestAssured.given()
                .baseUri("https://jsonplaceholder.typicode.com/posts")
                .when()
                .header("Content-Type", "application/json")
                .body(jsonBody)
                .put("/1");
        String responseData = response.getBody().asString();

        JsonPath jsonPath = new JsonPath(responseData);
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response: " + responseData);

    }
}
