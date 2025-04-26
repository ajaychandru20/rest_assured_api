package com.ems.jackson_annotation.deserialization.JsonSetter;

import com.fasterxml.jackson.annotation.JsonSetter;

public class JsonSetterPage {
    public String empName;
    public Integer empAge;
    public String empDepartment;
    public String empEmail;

    public Integer getEmpAge() {
        return empAge;
    }

    @JsonSetter(value = "age")
    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    public String getEmpName() {
        return empName;
    }

    @JsonSetter(value = "name")
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    @JsonSetter(value = "department")
    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    @JsonSetter(value = "email")
    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

}
