package com.ems.jackson_annotation.serialization.jsonSerializer;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;

@JsonSerialize(using = customSerializer.class)
public class EmployeeDetailsPOJO {
    public String empName;
    public String empDepartment;
    public String empEmail;
    public Integer empAge;

    public List<String> course;

    public DevicesDetailsPOJO getDevices() {
        return devices;
    }

    public void setDevices(DevicesDetailsPOJO devices) {
        this.devices = devices;
    }

    public DevicesDetailsPOJO devices;

    public List<String> getCourse() {
        return course;
    }

    public void setCourse(List<String> course) {
        this.course = course;
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
