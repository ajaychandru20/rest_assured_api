package com.ems.chatGPTTasks.easy.Task4;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Task4 {
    public static void main(String[] args) {
        Response response = RestAssured
                .given()
                .baseUri("https://jsonplaceholder.typicode.com/posts")
                .when()
                .header("Content-Type","application/json")
                .delete("/1");

        Integer statusCode = response.getStatusCode();
        System.out.println("Response Code: " + response.getStatusCode());
        if (statusCode.equals(200)){
            System.out.println("✅ Resource successfully deleted");
        }


    }
}
