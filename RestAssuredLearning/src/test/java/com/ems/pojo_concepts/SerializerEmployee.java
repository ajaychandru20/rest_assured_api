package com.ems.pojo_concepts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializerEmployee {

    public String convertPojoToJson() throws JsonProcessingException {

        GetterSetterEmployee getterSetterEmployee = new GetterSetterEmployee();
        getterSetterEmployee.setName("Ajay");
        getterSetterEmployee.setAge("24");
        getterSetterEmployee.setDescription("IT");
        getterSetterEmployee.setEmail("it@email.dom");

        System.out.println("Original POJO Data:");
        System.out.println(getterSetterEmployee.getName());
        System.out.println(getterSetterEmployee.getAge());
        System.out.println(getterSetterEmployee.getDescription());
        System.out.println(getterSetterEmployee.getEmail());
        System.out.println("------------------------------------------------------------------\n");

        ObjectMapper mapper = new ObjectMapper();

        String jsonEmployee = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(getterSetterEmployee);

        System.out.println("Formatted POJO to JSON, using Jackson DataBinder:");
        System.out.println(jsonEmployee);

        return jsonEmployee;  // Return the JSON string
    }

    public static void main(String[] args) throws JsonProcessingException {
        SerializerEmployee serializerEmployee = new SerializerEmployee();
        serializerEmployee.convertPojoToJson();
    }
}
