package com.ems.chatGPTTasks.intermediate.Task1;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> userIds = Arrays.asList(1, 2, 3, 10);

        for (int userId : userIds) {
            Response response = RestAssured.given()
                    .baseUri("https://jsonplaceholder.typicode.com/posts")
                    .contentType("application/json")
                    .queryParam("userId", userId)
                    .when()
                    .get();

            System.out.println("\n🔍 Checking userId: " + userId);
            System.out.println("Status Code: " + response.getStatusCode());

            JsonPath jsonPath = new JsonPath(response.getBody().asString());
            List<Integer> returnedUserIds = jsonPath.getList("userId");

            // ✅ Validate all userIds match the input
            boolean isAllMatch = returnedUserIds.stream().allMatch(id -> id.equals(userId));
            System.out.println("All userIds match? " + isAllMatch);
            System.out.println("Total posts returned: " + returnedUserIds.size());
        }


    }
}
