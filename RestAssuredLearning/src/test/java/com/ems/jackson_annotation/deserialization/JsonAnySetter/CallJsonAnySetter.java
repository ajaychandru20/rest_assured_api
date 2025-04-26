package com.ems.jackson_annotation.deserialization.JsonAnySetter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CallJsonAnySetter {

    public static void main(String[] args) throws JsonProcessingException {

        String jsonValue = "{\n" +
                "  \"name\": \"Vijay\",\n" +
                "  \"age\": 23,\n" +
                "  \"department\": \"Arts\",\n" +
                "  \"email\": \"testing002@gmail.com\"\n" +
                "}";

        ObjectMapper mapper = new ObjectMapper();
        JsonAnySetterPage pojo =  mapper.readValue(jsonValue, JsonAnySetterPage.class);
        System.out.println(pojo.getEmployeeDetails());


    }
}
