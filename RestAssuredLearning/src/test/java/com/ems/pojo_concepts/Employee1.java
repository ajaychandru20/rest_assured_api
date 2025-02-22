package com.ems.pojo_concepts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Employee1 {

    public static void main(String[] args) throws JsonProcessingException {
        Employee employee1 = new Employee();
        employee1.setName("Ajay");
        employee1.setAge("24");
        employee1.setDescription("IT");
        employee1.setEmail("it@email.dom");


        System.out.println(employee1.getName());
        System.out.println(employee1.getAge());
        System.out.println(employee1.getDescription());
        System.out.println(employee1.getEmail());


        ObjectMapper mapper = new ObjectMapper();

        String jsonEmployee = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee1);

        System.out.println(jsonEmployee);

    }




}
