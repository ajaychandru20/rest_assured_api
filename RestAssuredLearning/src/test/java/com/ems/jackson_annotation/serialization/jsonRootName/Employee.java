package com.ems.jackson_annotation.serialization.jsonRootName;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "employee")
public class Employee {

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String empName;
    public String empRole;
    public Integer empAge;

}
