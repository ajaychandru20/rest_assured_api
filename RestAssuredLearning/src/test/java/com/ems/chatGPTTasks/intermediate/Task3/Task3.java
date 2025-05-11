package com.ems.chatGPTTasks.intermediate.Task3;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        Integer countPost = 0;
        for (int userID = 1; userID <= 5; userID++) {
            Response response =  RestAssured.given().baseUri("https://jsonplaceholder.typicode.com/posts")
                    .contentType("application/json")
                    .queryParam("userId", userID)
                    .when()
                    .get();
            JsonPath jsonPath = new JsonPath(response.getBody().asString());
            System.out.println("User ID: " + userID);
            List<String> titleResponse = jsonPath.getList("title");
            List<Integer> idResponse = jsonPath.getList("id");
            for (int i = 0; i < titleResponse.size(); i++) {
                String title = titleResponse.get(i);
                if (title != null && title.trim() != ""){
                    System.out.println("POST ID: " + idResponse.get(i) + " | " +"Title: " + title);
                    countPost++;
                }else{
                    System.out.println("⚠ Post ID <" + idResponse.get(i) + "> has invalid title.");
                }
            }
            System.out.println("Total Posts for User " + userID+ ": " + countPost);
            System.out.println("-------------------------");
        }

    }
}
