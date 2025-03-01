package com.ems.bdd.jsonvalidation;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

public class ValidateUsingNetworkNT {

    @Test
    public void validateJsonSchemaUsingNetworkNt() throws IOException {
        // Load JSON file
        File inputJson = new File("src/test/resources/jsonValidation/response.json");
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNodeProperties = mapper.readTree(inputJson);
        System.out.println("JSON Response: " + jsonNodeProperties);

        // Load JSON Schema
        InputStream responseSchema = new FileInputStream("src/test/resources/jsonValidation/schema.json");
        JsonSchemaFactory jsonSchemaFactory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V4);
        JsonSchema schema = jsonSchemaFactory.getSchema(responseSchema);

        // Validate JSON against Schema
        Set<ValidationMessage> validate = schema.validate(jsonNodeProperties);

        // Print validation errors, if any
        for (ValidationMessage message : validate) {
            System.out.println("Validation Error: " + message);
        }

        // Assert that the validation passed
        Assert.assertTrue(validate.isEmpty(), "JSON does not match the schema!");
    }
}
