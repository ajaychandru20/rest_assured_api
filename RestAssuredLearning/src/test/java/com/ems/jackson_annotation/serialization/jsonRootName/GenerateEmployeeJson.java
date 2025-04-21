package com.ems.jackson_annotation.serialization.jsonRootName;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class GenerateEmployeeJson {

    public static void main(String[] args) throws JsonProcessingException {
        Employee employee = new Employee();

        employee.setEmpName("Ajay");
        employee.setEmpRole("QA");
        employee.setEmpAge(25);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);

        String jsonData = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);

        System.out.println(jsonData);

    }



}
