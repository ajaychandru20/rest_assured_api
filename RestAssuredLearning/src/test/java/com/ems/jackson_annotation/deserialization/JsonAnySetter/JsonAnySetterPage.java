package com.ems.jackson_annotation.deserialization.JsonAnySetter;

import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;

public class JsonAnySetterPage {

    private Map<String,Object> employeeDetails = new HashMap<String, Object>();

    public Map<String , Object> getEmployeeDetails() {
        return employeeDetails;
    }


    @JsonAnySetter
    public void setEmployeeDetails(String key, Object value ) {
        employeeDetails.put(key, value);
    }



}
