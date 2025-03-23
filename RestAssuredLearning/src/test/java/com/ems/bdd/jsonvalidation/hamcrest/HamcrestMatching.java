package com.ems.bdd.jsonvalidation.hamcrest;

import io.restassured.module.jsv.JsonSchemaValidator;
import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class HamcrestMatching {

    @Test
    public void validateDataUsingHamcrest() throws IOException {

        File jsonInput = new File("src/test/resources/jsonValidation/response.json");


         String stringJsonInput = FileUtils.readFileToString(jsonInput,"UTF-8");

        InputStream readResponseSchema = new FileInputStream("src/test/resources/jsonValidation/schema.json");

        MatcherAssert.assertThat(stringJsonInput, JsonSchemaValidator.matchesJsonSchema(readResponseSchema));

    }


}
