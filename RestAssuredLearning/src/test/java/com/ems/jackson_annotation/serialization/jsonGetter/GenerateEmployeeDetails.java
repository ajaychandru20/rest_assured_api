package com.ems.jackson_annotation.serialization.jsonGetter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GenerateEmployeeDetails {

    public static void main(String[] args) throws JsonProcessingException {

        SetEmployee setEmployee = new SetEmployee();

        setEmployee.setEmpName("Ajay");
        setEmployee.setEmpAge(24);
        setEmployee.setEmpDepartment("Arts");
        setEmployee.setEmpEmail("test@gmail.co");

        ObjectMapper mapper = new ObjectMapper();
        String jsonData = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(setEmployee);
        System.out.println(jsonData);

    }
}
