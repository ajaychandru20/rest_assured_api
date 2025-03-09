package com.ems.extra_concepts;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManualJsonConstructor {


    @Test
    public void generateJsonData() {



        Map<String, Object> jsonData = new HashMap<String, Object>(); // this is for key value
        List<String> listData = new ArrayList<>(); // this is for list, because we need the skills list
        listData.add("java");
        listData.add("javascript");

        jsonData.put("name", "Ajay");
        jsonData.put("age", 23);
        jsonData.put("department", "HR");
        jsonData.put("email","ajay@cemail.com");
        jsonData.put("skills", listData);

        System.out.println(jsonData); // {skills=[java, javascript], name=Ajay, department=HR, age=23, email=ajay@cemail.com}


        RestAssured.given()
                .baseUri("http://localhost:3000/")
                .contentType("application/json")
                .body(jsonData)
                .log()
                .all()
                .when()
                .post("employees")
                .then()
                .log().all();

    }


}
