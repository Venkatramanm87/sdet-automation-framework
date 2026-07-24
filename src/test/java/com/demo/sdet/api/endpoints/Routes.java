package com.demo.sdet.api.endpoints;

import com.demo.sdet.config.ConfigReader;

public class Routes {

    private static final String BASE_URL =
            ConfigReader.getProperty("apiBaseUrl");

    public static final String USER = BASE_URL + "/user";
    public static final String USER_BY_NAME = BASE_URL + "/user/{username}";
}