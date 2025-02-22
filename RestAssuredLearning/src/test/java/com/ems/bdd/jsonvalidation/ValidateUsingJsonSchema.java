package com.ems.bdd.jsonvalidation;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.testng.annotations.Test;

import java.io.*;

public class ValidateUsingJsonSchema {


    @Test
    public void validateUsingJsonSchemaOnly() throws FileNotFoundException {

//        File InputJsonFile = new File("src/test/resources/jsonValidation/response.json");
//        Reader InputJsonFile = new FileReader("src/test/resources/jsonValidation/response.json");
        FileInputStream InputJsonFile = new FileInputStream("src/test/resources/jsonValidation/response.json");

        File responseSchema = new File("src/test/resources/jsonValidation/schema.json");


        RestAssured.given()
                .baseUri("http://localhost:3000/")
                .contentType("application/json")
                .body(InputJsonFile)
                .when()
                .post("/employees")
                .then()
//                .body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
                .body(JsonSchemaValidator.matchesJsonSchema("{\n" +
                        "  \"$schema\": \"http://json-schema.org/draft-04/schema#\",\n" +
                        "  \"type\": \"object\",\n" +
                        "  \"properties\": {\n" +
                        "    \"name\": {\n" +
                        "      \"type\": \"string\"\n" +
                        "    },\n" +
                        "    \"age\": {\n" +
                        "      \"type\": \"integer\"\n" +
                        "    },\n" +
                        "    \"department\": {\n" +
                        "      \"type\": \"string\"\n" +
                        "    },\n" +
                        "    \"email\": {\n" +
                        "      \"type\": \"string\"\n" +
                        "    }\n" +
                        "  },\n" +
                        "  \"required\": [\n" +
                        "    \"name\",\n" +
                        "    \"age\",\n" +
                        "    \"department\",\n" +
                        "    \"email\"\n" +
                        "  ]\n" +
                        "}"));

    }

}
