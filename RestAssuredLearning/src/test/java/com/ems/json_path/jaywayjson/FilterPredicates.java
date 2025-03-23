package com.ems.json_path.jaywayjson;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class FilterPredicates {

    File file = new File("src/test/resources/jsonValidation/readJsonFile/bookstore.json");

    public void FilterUsingObject() throws IOException {
        Filter firstFilter = Filter.filter(
                Criteria
                        .where("price")
                        .gt(85)
        );
        List<Object> firstResponse = JsonPath.parse(file).read("$..[?]", firstFilter);
        System.out.println(firstResponse);
        // Here if I want to get some specific key means then this method will not work.
//        System.out.println(firstResponse.get(0).get("author")); // Cannot resolve method 'get' in 'Object'
    }

    public void SecondFilterUsingMapObject() throws IOException {
        Filter secondFilter = Filter.filter(Criteria
                .where("price")
                .gt(80)
                .and("authors[?(@.first_name == 'Jennifer')]").exists(true)
        );

        List<Map<String, Object>> secondResponse = JsonPath.parse(file).read("$.store.books[?]", secondFilter);

        Object authorDetails = secondResponse.get(0).get("authors");

        List<Map<String, Object>> lastName = (List<Map<String, Object>>) authorDetails;


        System.out.println(authorDetails);
        System.out.println(lastName.get(0));
        System.out.println(secondResponse);

        if (!secondResponse.isEmpty()) {
            System.out.println(secondResponse.get(0).get("title")); // Fetch the title of the book
        }

    }

    public void ThirdFilterUsingMapObject() throws IOException {

        List<Map<String, Object>> thirdResponse = JsonPath.parse(file).read("$..price"); // [85,100,120,95]
        Object priceDetails = thirdResponse.get(0);
        System.out.println(priceDetails);
        System.out.println(thirdResponse);
    }

    public static void main(String[] args) throws IOException {

        FilterPredicates filterPredicates = new FilterPredicates();
//        filterPredicates.FilterUsingObject();
//        filterPredicates.SecondFilterUsingMapObject();
        filterPredicates.ThirdFilterUsingMapObject();


    }

}
