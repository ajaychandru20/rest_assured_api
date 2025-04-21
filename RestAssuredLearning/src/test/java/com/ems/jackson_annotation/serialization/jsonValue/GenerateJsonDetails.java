package com.ems.jackson_annotation.serialization.jsonValue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GenerateJsonDetails {

    public static void main(String[] args) throws JsonProcessingException {
        EmployeeSerializerPOJO serializerPOJO = new EmployeeSerializerPOJO();

        serializerPOJO.setEmpName("Ajay");
        serializerPOJO.setEmpAge(25);
        serializerPOJO.setEmpDepartment("IT");
        serializerPOJO.setEmpEmail("test@123.com");

        ObjectMapper mapper = new ObjectMapper();
        String jsonData=  mapper.writerWithDefaultPrettyPrinter().writeValueAsString(serializerPOJO);
        System.out.println(jsonData);


    }




}
