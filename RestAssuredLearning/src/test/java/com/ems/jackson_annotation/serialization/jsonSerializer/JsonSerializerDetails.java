package com.ems.jackson_annotation.serialization.jsonSerializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.util.Arrays;

public class JsonSerializerDetails {

    public static void main(String[] args) throws JsonProcessingException {

        EmployeeDetailsPOJO employeeSerializerPOJO = new EmployeeDetailsPOJO();

        employeeSerializerPOJO.setEmpName("Ajay");
        employeeSerializerPOJO.setEmpAge(25);
        employeeSerializerPOJO.setEmpDepartment("IT");
        employeeSerializerPOJO.setCourse(Arrays.asList("Selenium, Cypress"));

        DevicesDetailsPOJO devicesDetailsPOJO = new DevicesDetailsPOJO();
        devicesDetailsPOJO.setLaptop("Asus i3");
        devicesDetailsPOJO.setMobile("CMF Phone 1");

        employeeSerializerPOJO.setDevices(devicesDetailsPOJO);

        ObjectMapper mapper = new ObjectMapper();


        SimpleModule simpleModule = new SimpleModule();

        simpleModule.addSerializer(EmployeeDetailsPOJO.class, new customSerializer());
        mapper.registerModule(simpleModule);


      String jsonData =  mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employeeSerializerPOJO);
        System.out.println(jsonData );



    }



}
