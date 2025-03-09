package com.ems.pojo_concepts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeserializerEmployee {

    public void deserializeEmployee() throws JsonProcessingException {
        // Serialize the POJO first
        SerializerEmployee serializerEmployee = new SerializerEmployee();
        String jsonData = serializerEmployee.convertPojoToJson(); // Now getting JSON as a return value

        System.out.println("Imported JSON for Deserialization: " + jsonData);

        // Deserialize JSON back to Java object
        ObjectMapper mapper = new ObjectMapper();
        GetterSetterEmployee employee = mapper.readValue(jsonData, GetterSetterEmployee.class);

        System.out.println("\nDeserialized Java Object:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Description: " + employee.getDescription());
        System.out.println("Email: " + employee.getEmail());
    }

    public static void main(String[] args) throws JsonProcessingException {
        DeserializerEmployee deserializerEmployee = new DeserializerEmployee();
        deserializerEmployee.deserializeEmployee();
    }
}
