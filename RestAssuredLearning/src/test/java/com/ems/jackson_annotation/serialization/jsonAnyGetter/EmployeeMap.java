package com.ems.jackson_annotation.serialization.jsonAnyGetter;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.Map;

public class EmployeeMap {

    @JsonAnyGetter
    public Map<String, Object> getEmployeeDetails() {
        return EmployeeDetails;
    }

    public void setEmployeeDetails(Map<String, Object> employeeDetails) {
        EmployeeDetails = employeeDetails;
    }

    private Map<String,Object> EmployeeDetails;
}
