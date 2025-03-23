package com.ems.pojo_concepts.PojoTocomplexJson.LombokToJson;

import com.fasterxml.jackson.core.JsonProcessingException;

public class EmployeeSerializerData {

    public static void main(String[] args) throws JsonProcessingException {

        EmployeeDetailsLombok employeeDetailsLombok = new EmployeeDetailsLombok();
        employeeDetailsLombok.setName("Ajay");
        employeeDetailsLombok.setAge(24);

        System.out.println(employeeDetailsLombok.getName());
        System.out.println(employeeDetailsLombok.getAge());


        // Getter Setter code traditional

        EmployeeDetailsGetterSetterCode employeeDetailsGetterSetterCode = new EmployeeDetailsGetterSetterCode();

        employeeDetailsGetterSetterCode.setName("Ajith");
        employeeDetailsGetterSetterCode.setAge(23);

        System.out.println(employeeDetailsGetterSetterCode.getName());
        System.out.println(employeeDetailsGetterSetterCode.getAge());
    }
}
