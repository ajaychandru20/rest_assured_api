package com.ems.json_path.jaywayjson;

import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class TypesOfPaths {
    public static void definatePath() throws IOException {
        File jsonFile = new File("src/test/resources/jsonValidation/readJsonFile/bookstore.json");
        Integer singleValuePrice = JsonPath.parse(jsonFile).read("$.store.books[0].price");
        System.out.println(singleValuePrice);

    }

    public static void indefinatePath() throws IOException {
        File jsonFile = new File("src/test/resources/jsonValidation/readJsonFile/bookstore.json");
//        Integer singleValuePrice = JsonPath.parse(jsonFile).read("$.store.books[*].price");
//        System.out.println(singleValuePrice); // output: ClassCast Exception, need to use List<Map<String,Object>>
        List<Map<String, Object>> singleValuePriceList = JsonPath.parse(jsonFile).read("$.store.books[*].price");
        System.out.println(singleValuePriceList); // output: [85,"100",120,95]

    }

    public static void main(String[] args) throws IOException {
        definatePath();
        indefinatePath();

    }


}
