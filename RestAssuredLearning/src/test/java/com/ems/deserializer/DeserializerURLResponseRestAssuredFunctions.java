package com.ems.deserializer;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

import java.util.Map;

public class DeserializerURLResponseRestAssuredFunctions {

    public void usingAsFunction(){

       Map<String,Object> response = RestAssured.given()
                .baseUri("http://localhost:3000/")
                .contentType("application/json")
                .when()
                .get("employees/12")
                .then()
                .extract()
                .body()
                .as(new TypeRef<Map<String,Object>>() {
                });

        System.out.println(response.get("name"));
        System.out.println(response.get("age"));
        System.out.println(response.get("email"));
        System.out.println(response.get("department"));



    }

    public static void main(String[] args) {
        DeserializerURLResponseRestAssuredFunctions urlResponseRestAssuredFunctions = new DeserializerURLResponseRestAssuredFunctions();
        urlResponseRestAssuredFunctions.usingAsFunction();
    }


}
