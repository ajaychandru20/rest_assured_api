package com.ems.jackson_annotation.serialization.jsonValue;

import com.fasterxml.jackson.annotation.JsonValue;

public class EmployeeSerializerPOJO {
    public String empName;
    public String empDepartment;
    public String empEmail;
    public Integer empAge;


    @JsonValue
    public String jsonValue(){
        return null;
    }


    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

}
