package com.ems.json_path.jaywayjson;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

import java.io.*;
import java.util.List;

public class ReadJsonUsingFile {

    public static void readJsonFileEveryRead() throws IOException {

        File bookFile = new File("src/test/resources/jsonValidation/readJsonFile/bookstore.json");
        File outputFile = new File("src/test/resources/jsonValidation/writeResponseJsonFile/writeTest.txt");


        try (FileWriter writter = new FileWriter(outputFile)) {


            List<Object> responseArray = JsonPath.read(bookFile, "$..price");
            for (Object response : responseArray) {
                System.out.println(response);
                writter.write(response.toString() + "\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void readJsonFileOneTime() throws IOException {

        InputStream JsonFile = new FileInputStream("src/test/resources/jsonValidation/readJsonFile/bookstore.json");
        File writeFile = new File("src/test/resources/jsonValidation/writeResponseJsonFile/writeTest.txt");

        Object jsonParserData = Configuration.defaultConfiguration().jsonProvider().parse(JsonFile.readAllBytes());
        try (FileWriter writeData = new FileWriter(writeFile)) {

            List<Object> responseData = JsonPath.read(jsonParserData, "$..first_name");
            for (Object data : responseData) {
                writeData.write(data.toString() + "\n");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void fluentAPITestingMethod1() throws IOException {

        File jsonFile = new File("src/test/resources/jsonValidation/readJsonFile/bookstore.json");

        DocumentContext documentContext = JsonPath.parse(jsonFile);
        List<Object> responseData = documentContext.read("$..first_name");

        for (Object data : responseData) {
            System.out.println(data.toString());
        }
    }
    public static void fluentAPITestingMethod2() throws IOException {

        File jsonFile = new File("src/test/resources/jsonValidation/readJsonFile/bookstore.json");

        Configuration configuration = Configuration.defaultConfiguration();

        List<Object> read = JsonPath.using(configuration).parse(jsonFile).read("$..last_name");

        for (Object data : read){
            System.out.println(data.toString());
        }


    }

    public static void main(String[] args) throws IOException {
//        readJsonFileEveryRead();
//        readJsonFileOneTime();
//        fluentAPITestingMethod1();
        fluentAPITestingMethod2();
    }

}
