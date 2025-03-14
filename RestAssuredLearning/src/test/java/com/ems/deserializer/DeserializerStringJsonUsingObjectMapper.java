package com.ems.deserializer;

import com.ems.deserializer.getter_setter_pages.GetterSetterUserDetails;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class DeserializerStringJsonUsingObjectMapper {

    String jsonValue = "{\n" +
            "  \"name\": \"Ajay\",\n" +
            "  \"age\": 25,\n" +
            "  \"department\": \"Arts\",\n" +
            "  \"email\": \"testing003@gmail.com\"\n" +
            "}";
    public void readUsingObjectMapper() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        GetterSetterUserDetails setDetails = mapper.readValue(jsonValue, GetterSetterUserDetails.class);
        String name = setDetails.getName();
        System.out.println(name);
        System.out.println(setDetails.getAge());
        System.out.println(setDetails.getDepartment());
        System.out.println(setDetails.getEmail());


    }


    public static void main(String[] args) throws IOException {

        DeserializerStringJsonUsingObjectMapper deserializerStringJsonUsingObjectMapper = new DeserializerStringJsonUsingObjectMapper();
        deserializerStringJsonUsingObjectMapper.readUsingObjectMapper();

    }




}
