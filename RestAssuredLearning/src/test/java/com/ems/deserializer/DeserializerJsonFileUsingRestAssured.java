package com.ems.deserializer;

import com.ems.deserializer.getter_setter_pages.GetterSetterUserDetails;
import io.restassured.path.json.JsonPath;

import java.io.File;

public class DeserializerJsonFileUsingRestAssured {
    File jsonFile = new File("src/test/resources/jsonValidation/readJsonFile/response.json");
    public void restAssuredJsonPath(){


        JsonPath dataFile = JsonPath.from(jsonFile);
        GetterSetterUserDetails getterSetterUserDetails = dataFile.getObject("", GetterSetterUserDetails.class);
        System.out.println(getterSetterUserDetails.getName());
        System.out.println(getterSetterUserDetails.getAge());
        System.out.println(getterSetterUserDetails.getDepartment());
        System.out.println(getterSetterUserDetails.getEmail());

    }

    public static void main(String[] args) {
        DeserializerJsonFileUsingRestAssured deserializerJsonFileUsingRestAssured = new DeserializerJsonFileUsingRestAssured();
        deserializerJsonFileUsingRestAssured.restAssuredJsonPath();
    }


}
