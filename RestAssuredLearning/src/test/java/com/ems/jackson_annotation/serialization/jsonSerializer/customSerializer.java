package com.ems.jackson_annotation.serialization.jsonSerializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class customSerializer extends StdSerializer <EmployeeDetailsPOJO> {



    protected customSerializer(Class<EmployeeDetailsPOJO> t) {
        super(t);
    }

    public customSerializer(){
        this(null);
    }

    @Override
    public void serialize(EmployeeDetailsPOJO employeeDetailsPOJO,
                          JsonGenerator jsonGenerator,
                          SerializerProvider serializerProvider) throws IOException {

        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("first_name","Ajith");
        jsonGenerator.writeNumberField("age", employeeDetailsPOJO.getEmpAge());
        jsonGenerator.writeStringField("department",employeeDetailsPOJO.getEmpDepartment());
        jsonGenerator.writeStringField("role","Senior Software Tester");
        jsonGenerator.writeEndObject();

    }




}
