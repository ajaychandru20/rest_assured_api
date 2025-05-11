package com.ems.chatGPTTasks.intermediate.Task2;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        Response response = RestAssured.given()
                .baseUri("https://jsonplaceholder.typicode.com/posts")
                .queryParam("userId", 1)
                .contentType("application/json")
                .when()
                .get();
        JsonPath jsonPath = new JsonPath(response.getBody().asString());
        List<String> titleResponse = jsonPath.getList("title");
        List<Integer> idResponse = jsonPath.getList("id");
        Integer postCount = 0;
        for (int i =0; i < titleResponse.size(); i++){
            String title = titleResponse.get(i);
            if (title != null || title != ""){
                        postCount = postCount + 1;
            }else{
                System.out.println("Invalid Title: " + idResponse.get(i));
            }
        }
        System.out.println(titleResponse);
        System.out.println("Total Post count: " + postCount);

    }
}
