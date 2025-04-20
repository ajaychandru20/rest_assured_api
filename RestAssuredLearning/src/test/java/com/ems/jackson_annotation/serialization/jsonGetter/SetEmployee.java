package com.ems.jackson_annotation.serialization.jsonGetter;

import com.fasterxml.jackson.annotation.JsonGetter;

public class SetEmployee {


    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    @JsonGetter(value = "name")
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

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String empName;
    public Integer empAge;
    public String empDepartment;
    public String empEmail;
}
