package com.ems.deserializer;

import com.ems.deserializer.getter_setter_pages.GetterSetterBooks;
import com.ems.deserializer.getter_setter_pages.GetterSetterUserDetails;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class DeserializerJsonFileUsingJsonPath {

    File jsonFile = new File("src/test/resources/jsonValidation/readJsonFile/response.json");
    File jsonFile2 = new File("src/test/resources/jsonValidation/readJsonFile/bookstore.json");
    public void convertDataUsingMapperProvider() throws IOException {
        JacksonMappingProvider mappingProvider = new JacksonMappingProvider();
        Configuration configuration = Configuration.builder().mappingProvider(mappingProvider).build();
        GetterSetterUserDetails getUsersString = JsonPath.using(configuration).parse(jsonFile).read("$", GetterSetterUserDetails.class);
        System.out.println(getUsersString.getName());
    }

    public void convertBooksDataUsingMapperProvider() throws IOException {

        JacksonMappingProvider mappingProvider = new JacksonMappingProvider();

        Configuration configuration = Configuration.builder().mappingProvider(mappingProvider).build();

        GetterSetterBooks respondBooks = JsonPath.using(configuration).parse(jsonFile2).read("$.store", GetterSetterBooks.class);

        List<GetterSetterBooks.Book> booksData = respondBooks.getBooks();
        System.out.println(booksData);

        Object bookData = booksData.toString();
        System.out.println(bookData);

        for (GetterSetterBooks.Book data : booksData){
            System.out.println(data.toString());
        }

    }


    public static void main(String[] args) throws IOException {

        DeserializerJsonFileUsingJsonPath deserializerJsonFileUsingJsonPath = new DeserializerJsonFileUsingJsonPath();
        deserializerJsonFileUsingJsonPath.convertDataUsingMapperProvider();
//        deserializerJsonFileUsingJsonPath.convertBooksDataUsingMapperProvider();



    }


}
