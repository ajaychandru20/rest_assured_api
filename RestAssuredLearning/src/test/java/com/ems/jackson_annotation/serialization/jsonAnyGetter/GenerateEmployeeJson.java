package com.ems.jackson_annotation.serialization.jsonAnyGetter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class GenerateEmployeeJson {


    public static void main(String[] args) throws JsonProcessingException {



        EmployeeMap employeeMap = new EmployeeMap();

        Map<String,Object> mapValues = new HashMap<String,Object>();

        mapValues.put("empName","Ajay");
        mapValues.put("empAge", 25);
        mapValues.put("empDepartment","IT");
        mapValues.put("empEmail","test@1234");

        employeeMap.setEmployeeDetails(mapValues);

        ObjectMapper mapper = new ObjectMapper();
        String jsonData =  mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employeeMap);
        System.out.println(jsonData);

    }

}
