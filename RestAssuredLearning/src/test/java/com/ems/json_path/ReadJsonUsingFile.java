package com.ems.json_path;

import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class ReadJsonUsingFile {

    public static void readJson() throws IOException {

        File bookFile = new File("src/test/resources/jsonValidation/readJsonFile/bookstore.json");
        File outputFile = new File("src/test/resources/jsonValidation/writeResponseJsonFile/writeTest.txt");


        try (FileWriter writter = new FileWriter(outputFile)) {

            // Read JSON file content as a String
            String jsonContent = new String(Files.readAllBytes(bookFile.toPath()));

            List<Object> responseArray = JsonPath.read(jsonContent, "$..price");
            for (Object response : responseArray) {
                System.out.println(response);
                writter.write(response.toString() + "\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) throws IOException {
        readJson();
    }

}
