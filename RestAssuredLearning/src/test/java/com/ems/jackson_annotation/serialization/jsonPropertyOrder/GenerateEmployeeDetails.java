package com.ems.jackson_annotation.serialization.jsonPropertyOrder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GenerateEmployeeDetails {

    public static void main(String[] args) throws JsonProcessingException {

        EmployeeDetails employeeDetails = new EmployeeDetails();


        employeeDetails.setEmpName("Ajay");
        employeeDetails.setEmpAge(25);
        employeeDetails.setEmpDepartment("IT");
        employeeDetails.setEmpEmail("test@123.com");

        ObjectMapper mapper = new ObjectMapper();
        String jsonData=  mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employeeDetails);
        System.out.println(jsonData);

    }

}
