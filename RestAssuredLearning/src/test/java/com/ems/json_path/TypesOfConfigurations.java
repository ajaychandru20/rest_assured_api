package com.ems.json_path;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class TypesOfConfigurations {
    File jsonFile = new File("src/test/resources/jsonValidation/readJsonFile/bookstore.json");

    public void returnAllListByDefault() throws IOException {

        Configuration configuration = Configuration.defaultConfiguration();
        configuration = configuration.addOptions(Option.ALWAYS_RETURN_LIST);
        List<Map<String, Object>> singleValuePrice = JsonPath.using(configuration).parse(jsonFile).read("$.store.books[0].price");
        System.out.println(singleValuePrice);
    }

    public void returnAllDefaultNull() throws IOException {

        // this is not working
//        Configuration configuration = Configuration.defaultConfiguration();
//        configuration.addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL);
//        configuration = configuration.addOptions(Option.ALWAYS_RETURN_LIST);

        // Builder configuration
        Configuration configuration = Configuration.builder().options(Option.DEFAULT_PATH_LEAF_TO_NULL).build();
        configuration = configuration.addOptions(Option.ALWAYS_RETURN_LIST);
        List<Map<String, Object>> returnKeyValue = JsonPath.using(configuration).parse(jsonFile).read("$.store.books[0].name");
        System.out.println(returnKeyValue); // output: null

    }

    public void suppressExpression() throws IOException {

        Configuration configuration = Configuration.defaultConfiguration();
        configuration = configuration.addOptions(Option.SUPPRESS_EXCEPTIONS);

        String nameValue = JsonPath.using(configuration).parse(jsonFile).read("$.store.books[0].name");
        System.out.println(nameValue); // output: No exception throws
        String priceValue = JsonPath.using(configuration).parse(jsonFile).read("$.store.books[0].price");
        System.out.println(priceValue); // output: CastException
    }

    public void requiredProperties() throws IOException {

        Configuration configuration = Configuration.defaultConfiguration();
        configuration = configuration.addOptions(Option.REQUIRE_PROPERTIES);
        List<Map<String, Object>>  priceValue = JsonPath.using(configuration).parse(jsonFile).read("$.store.books[*].price");
        System.out.println(priceValue); // output: Exception PathNotFoundException
    }


    public static void main(String[] args) throws IOException {
        TypesOfConfigurations typesOfConfigurations = new TypesOfConfigurations();
        typesOfConfigurations.returnAllListByDefault();
        typesOfConfigurations.returnAllDefaultNull();
//        typesOfConfigurations.suppressExpression();
        typesOfConfigurations.requiredProperties();

    }


}
