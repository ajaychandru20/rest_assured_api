package com.ems.chatGPTTasks.easy.Task1;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Response respose = RestAssured.given()
                .baseUri("https://jsonplaceholder.typicode.com/posts")
                .when()
                .get("/1");

        String jsonBody = respose.getBody().asString();

        JsonPath jsonPath = new JsonPath(jsonBody);

        System.out.println("Status Code: " + respose.getStatusCode());
        System.out.println( "Response Body: " + jsonBody);
        System.out.println("Title: " + jsonPath.getString("title"));

//        FileWriter fileWriter = new FileWriter("src/test/java/com/ems/chatGPTTasks/easy/respons.json");
//        fileWriter.write(jsonBody);
//        fileWriter.close();



//        System.out.println(respose.title);
    }
}
