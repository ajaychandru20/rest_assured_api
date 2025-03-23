package com.ems.json_path.jaywayjson;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Predicate;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class CustomPredicates {

    File file = new File("src/test/resources/jsonValidation/readJsonFile/bookstore.json");
    public void customPredicateUsingInterfate() throws IOException {

        Predicate booksISBN = new Predicate() {
            @Override
            public boolean apply(PredicateContext predicateContext) {
                boolean isContain = predicateContext.item(Map.class).containsKey("isbn");
                return isContain;
            }
        };

       List<Map<String,Object>> responseData =  JsonPath.parse(file).read("$.store.books[?]",booksISBN);
        System.out.println(responseData);

    }


    public static void main(String[] args) throws IOException {

        CustomPredicates customPredicates = new CustomPredicates();
        customPredicates.customPredicateUsingInterfate();
    }

}
