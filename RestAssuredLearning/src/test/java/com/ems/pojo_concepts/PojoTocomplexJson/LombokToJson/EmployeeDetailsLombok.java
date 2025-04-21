package com.ems.pojo_concepts.PojoTocomplexJson.LombokToJson;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDetailsLombok {
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    private int age;

    public void setName(String ajay) {
    }
}
