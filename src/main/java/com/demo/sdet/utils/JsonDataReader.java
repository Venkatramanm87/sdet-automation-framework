package com.demo.sdet.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.demo.sdet.model.LoginData;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDataReader {

    public static List<LoginData> getLoginData() {

        ObjectMapper mapper = new ObjectMapper();

        try {

            InputStream input = JsonDataReader.class
                    .getClassLoader()
                    .getResourceAsStream("com/demo/sdet/testdata/loginData.json");

            return mapper.readValue(
                    input,
                    new TypeReference<List<LoginData>>() {
                    });

        } catch (IOException e) {

            throw new RuntimeException(e);

        }

    }

}